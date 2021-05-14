package tqs.Assignment;

import java.util.*;


public class Cache{
    private int hits;
    private int misses;
    private int requests;
    private Map<String, AirQualityStats> info;


    public Cache(){
       this.hits=0;
       this.misses=0;
       this.requests=0;
       this.info = new HashMap<>(); 
    }

    public void miss(){
        this.misses++;
    }

    public int getHits() {
        return this.hits;
    }

    public int getMisses() {
        return this.misses;
    }


    public int getRequests() {
        return this.requests;
    }


    public Map<String,AirQualityStats> getInfo() {
        return this.info;
    }

    public void setInfo(Map<String,AirQualityStats> info) {
        this.info = info;
    }

    public void hit(){
        this.hits++;
    }

    public void requests(){
        this.requests++;
    }

    public void selfClean(){
        if(this.info.isEmpty()){
            return ;
        }
        for(String s : this.info.keySet()){
            var now = Calendar.getInstance();
            if(!this.info.get(s).getTtl().after(now)){
                this.info.remove(s);
            }
        }
    }


  
    

    @Override
    public String toString() {
        return "{" +
            " hits='" + getHits() + "'" +
            ", misses='" + getMisses() + "'" +
            ", requests='" + getRequests() + "'" +
            ", info='" + getInfo() + "'" +
            "}";
    }


}