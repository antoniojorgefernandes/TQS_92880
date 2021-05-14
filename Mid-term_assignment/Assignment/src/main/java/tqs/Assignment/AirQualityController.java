package tqs.Assignment;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ui.Model;
import java.util.logging.Logger;
import java.util.logging.Level;

import java.io.*;
import java.net.*;

@Controller
public class AirQualityController{
    Logger LOGGER = Logger.getLogger("AirQualityController");
    @Autowired
    private RestTemplate restTemplate;

    private Cache cache = new Cache();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("aqs", new AirQualityStats()); 
        return "home";
    }
    
    @GetMapping("/api/{city}")
    @ResponseBody
    public String apiAirStats(@PathVariable(value = "city") String city)throws IOException {
        this.cache.selfClean();
        if(this.cache.getInfo().containsKey(city)){
            this.cache.hit();
            this.cache.requests();
            return this.cache.getInfo().get(city).toString();
        }
        var aqs = this.getAQS(city);
        if(aqs==null){
            return "{}";
        }
        this.cache.getInfo().put(city,aqs);
        return aqs.toString();
    }

    @GetMapping("/api/cache")
    @ResponseBody
    public String apiCacheStats(Model model) {
       return this.cache.toString();
    }

    @GetMapping("/cache")
    public String cache(Model model) {
        model.addAttribute("cache", this.cache); 
        return "cache";
    }
      
    @GetMapping(path="/{city}")
    public String city(@PathVariable(value = "city") String city, Model model) throws IOException{
        city = city.toLowerCase();
        this.cache.selfClean();
        if(this.cache.getInfo().containsKey(city)){
            this.cache.hit();
            this.cache.requests();
            model.addAttribute("aqs",this.cache.getInfo().get(city));
            return "data";
        }
        var aqs = this.getAQS(city);
        if(aqs==null){
            return "home";
        }
        this.cache.getInfo().put(city,aqs);
        model.addAttribute("aqs",aqs);
        return "data";
    }   

    public AirQualityStats getAQS(String city)throws IOException{
        var aqs = new AirQualityStats();
        var url = "https://api.weatherbit.io/v2.0/current/airquality?city=";
        var key= "&key=c5041e9d7d8d416f8c474153ab58e0f2";
        String readLine =null;
        var urlForGetRequest = new URL(url+city+key);
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        var in = new BufferedReader(
            new InputStreamReader(conection.getInputStream()));
        var response = new StringBuilder();
        while ((readLine = in .readLine()) != null) {
            response.append(readLine);
        } in .close();
        var airInfoAsJson = response.toString();
        if(airInfoAsJson.equals("")){
            return null;
        }
        var jsonObj = new JSONObject(airInfoAsJson);
        var jArr = jsonObj.getJSONArray("data");
        var objm = new ObjectMapper();
        airInfoAsJson= jArr.toString().replace("[","").replace("]","");
        try{
            aqs= objm.readValue(airInfoAsJson, AirQualityStats.class);
        }catch(JsonProcessingException e){
            LOGGER.log(Level.INFO, "Error trying to process Json");
        }
        this.cache.miss();
        this.cache.requests();
        aqs.setCity_name(city);
        aqs.setTtl(1);
        return aqs;
    }

}