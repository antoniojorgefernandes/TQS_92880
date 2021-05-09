package tqs.Assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.*;

public class AirQualityStats {
    @SerializedName("mold_level")
    @Expose
    private int mold_level;
    @SerializedName("aqi")
    @Expose
    private int aqi;
    @SerializedName("pm10")
    @Expose
    private float pm10;
    @SerializedName("co")
    @Expose
    private float co;
    @SerializedName("o2")
    @Expose
    private int o3;
    @SerializedName("predominant_pollen_type")
    @Expose
    private String predominant_pollen_type;
    @SerializedName("so2")
    @Expose
    private float so2;
    @SerializedName("pollen_level_tree")
    @Expose
    private int pollen_level_tree;
    @SerializedName("pollen_level_weed")
    @Expose
    private int pollen_level_weed;
    @SerializedName("no2")
    @Expose
    private float no2;
    @SerializedName("pm25")
    @Expose
    private int pm25;
    @SerializedName("pollen_level_grass")
    @Expose
    private int pollen_level_grass;
    @SerializedName("city_name")
    @Expose
    private String city_name;

    public AirQualityStats() {
    }

    public AirQualityStats(int mold_level, int aqi, float pm10, float co, int o3, String predominant_pollen_type, float so2, int pollen_level_tree, int pollen_level_weed, float no2, int pm25, int pollen_level_grass, String city_name) {
        this.mold_level = mold_level;
        this.aqi = aqi;
        this.pm10 = pm10;
        this.co = co;
        this.o3 = o3;
        this.predominant_pollen_type = predominant_pollen_type;
        this.so2 = so2;
        this.pollen_level_tree = pollen_level_tree;
        this.pollen_level_weed = pollen_level_weed;
        this.no2 = no2;
        this.pm25 = pm25;
        this.pollen_level_grass = pollen_level_grass;
        this.city_name = city_name;
    }

    public int getMold_level() {
        return this.mold_level;
    }

    public void setMold_level(int mold_level) {
        this.mold_level = mold_level;
    }

    public int getAqi() {
        return this.aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public float getPm10() {
        return this.pm10;
    }

    public void setPm10(float pm10) {
        this.pm10 = pm10;
    }

    public float getCo() {
        return this.co;
    }

    public void setCo(float co) {
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

    public float getSo2() {
        return this.so2;
    }

    public void setSo2(float so2) {
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

    public float getNo2() {
        return this.no2;
    }

    public void setNo2(float no2) {
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

    public AirQualityStats mold_level(int mold_level) {
        setMold_level(mold_level);
        return this;
    }

    public AirQualityStats aqi(int aqi) {
        setAqi(aqi);
        return this;
    }

    public AirQualityStats pm10(float pm10) {
        setPm10(pm10);
        return this;
    }

    public AirQualityStats co(float co) {
        setCo(co);
        return this;
    }

    public AirQualityStats o3(int o3) {
        setO3(o3);
        return this;
    }

    public AirQualityStats predominant_pollen_type(String predominant_pollen_type) {
        setPredominant_pollen_type(predominant_pollen_type);
        return this;
    }

    public AirQualityStats so2(float so2) {
        setSo2(so2);
        return this;
    }

    public AirQualityStats pollen_level_tree(int pollen_level_tree) {
        setPollen_level_tree(pollen_level_tree);
        return this;
    }

    public AirQualityStats pollen_level_weed(int pollen_level_weed) {
        setPollen_level_weed(pollen_level_weed);
        return this;
    }

    public AirQualityStats no2(float no2) {
        setNo2(no2);
        return this;
    }

    public AirQualityStats pm25(int pm25) {
        setPm25(pm25);
        return this;
    }

    public AirQualityStats pollen_level_grass(int pollen_level_grass) {
        setPollen_level_grass(pollen_level_grass);
        return this;
    }

    public AirQualityStats city_name(String city_name) {
        setCity_name(city_name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AirQualityStats)) {
            return false;
        }
        AirQualityStats airQualityStats = (AirQualityStats) o;
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