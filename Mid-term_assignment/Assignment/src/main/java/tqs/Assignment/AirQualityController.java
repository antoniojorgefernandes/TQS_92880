package tqs.Assignment;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import java.io.*;
import java.net.*;

@RestController
public class AirQualityController{


    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping("/home/{city}")
    @ResponseBody
    public String getAirQualities(@PathVariable String city) throws IOException{
        String url = "https://api.weatherbit.io/v2.0/current/airquality?city=";
        String key= "&key=c5041e9d7d8d416f8c474153ab58e0f2";

        URL urlForGetRequest = new URL(url+city+key);
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
            new InputStreamReader(conection.getInputStream()));
        StringBuffer response = new StringBuffer();
        while ((readLine = in .readLine()) != null) {
            response.append(readLine);
        } in .close();
        
    return response.toString();
    }

   



}