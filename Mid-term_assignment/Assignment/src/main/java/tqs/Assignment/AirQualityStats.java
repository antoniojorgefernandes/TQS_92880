package tqs.Assignment;

import java.util.*;

public class AirQualityStats {
    
   
    private int mold_level;
    private int aqi;
    private double pm10;
    private double co;
    private int o3;
    private String predominant_pollen_type;
    private double so2;
    private int pollen_level_tree;
    private int pollen_level_weed;
    private double no2;
    private int pm25;
    private int pollen_level_grass;
    private String city_name;
    private Calendar ttl = Calendar.getInstance();
    
    


    public int getMold_level() {
        return this.mold_level;
    }

    public void setMold_level(int mold_level) {
        this.mold_level = mold_level;
    }

    public void setTtl(int ttl){
        this.ttl.add(Calendar.MINUTE, ttl);
    }

    public Calendar getTtl(){
        return this.ttl;
    }

    public int getAqi() {
        return this.aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public double getPm10() {
        return this.pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public double getCo() {
        return this.co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public int getO3() {
        return this.o3;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public String getPredominant_pollen_type() {
        return this.predominant_pollen_type;
    }

    public void setPredominant_pollen_type(String predominant_pollen_type) {
        this.predominant_pollen_type = predominant_pollen_type;
    }

    public double getSo2() {
        return this.so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public int getPollen_level_tree() {
        return this.pollen_level_tree;
    }

    public void setPollen_level_tree(int pollen_level_tree) {
        this.pollen_level_tree = pollen_level_tree;
    }

    public int getPollen_level_weed() {
        return this.pollen_level_weed;
    }

    public void setPollen_level_weed(int pollen_level_weed) {
        this.pollen_level_weed = pollen_level_weed;
    }

    public double getNo2() {
        return this.no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public int getPm25() {
        return this.pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public int getPollen_level_grass() {
        return this.pollen_level_grass;
    }

    public void setPollen_level_grass(int pollen_level_grass) {
        this.pollen_level_grass = pollen_level_grass;
    }

    public String getCity_name() {
        return this.city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    

    

    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AirQualityStats)) {
            return false;
        }
        var airQualityStats = (AirQualityStats) o;
        return mold_level == airQualityStats.mold_level && aqi == airQualityStats.aqi && pm10 == airQualityStats.pm10 && co == airQualityStats.co && o3 == airQualityStats.o3 && Objects.equals(predominant_pollen_type, airQualityStats.predominant_pollen_type) && so2 == airQualityStats.so2 && pollen_level_tree == airQualityStats.pollen_level_tree && pollen_level_weed == airQualityStats.pollen_level_weed && no2 == airQualityStats.no2 && pm25 == airQualityStats.pm25 && pollen_level_grass == airQualityStats.pollen_level_grass && Objects.equals(city_name, airQualityStats.city_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mold_level, aqi, pm10, co, o3, predominant_pollen_type, so2, pollen_level_tree, pollen_level_weed, no2, pm25, pollen_level_grass, city_name);
    }

    @Override
    public String toString() {
        return "{" +
            " mold_level='" + getMold_level() + "'" +
            ", aqi='" + getAqi() + "'" +
            ", pm10='" + getPm10() + "'" +
            ", co='" + getCo() + "'" +
            ", o3='" + getO3() + "'" +
            ", predominant_pollen_type='" + getPredominant_pollen_type() + "'" +
            ", so2='" + getSo2() + "'" +
            ", pollen_level_tree='" + getPollen_level_tree() + "'" +
            ", pollen_level_weed='" + getPollen_level_weed() + "'" +
            ", no2='" + getNo2() + "'" +
            ", pm25='" + getPm25() + "'" +
            ", pollen_level_grass='" + getPollen_level_grass() + "'" +
            ", city_name='" + getCity_name() + "'" +
            "}";
    }


}