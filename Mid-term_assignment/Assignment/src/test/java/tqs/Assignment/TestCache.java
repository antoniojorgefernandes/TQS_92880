package tqs.Assignment;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


class TestCache {

    private Cache cache;

    @BeforeEach
    void setUp(){
        this.cache = new Cache();
    }


    @Test
    void afterCreationAssertValuesAre0(){
        final int expected =0;

        int real_miss = this.cache.getMisses();
        assertEquals(expected, real_miss);

        int real_requests = this.cache.getRequests();
        assertEquals(expected, real_requests);

        int real_hits = this.cache.getHits();
        assertEquals(expected, real_hits);
    }

    @Test
    void afterMissIncrementMisses(){
        this.cache.miss();
        final int expected = 1;
        int real = this.cache.getMisses();
        assertEquals(expected, real);
    }

    @Test
    void afterInsertInfoCheckInfo(){
        HashMap<String,AirQualityStats> info = new HashMap<>();
        AirQualityStats aqs = new AirQualityStats();
        aqs.setAqi(10);
        aqs.setCity_name("Aveiro");
        aqs.setCo(10.1);
        aqs.setSo2(10.2);
        aqs.setPollen_level_grass(11);
        aqs.setPollen_level_tree(12);
        aqs.setPollen_level_weed(13);
        aqs.setPm25(14);
        aqs.setMold_level(15);
        aqs.setNo2(10.3);
        aqs.setO3(16);
        aqs.setPm10(10.4);
        aqs.setPredominant_pollen_type("pollen type");
        aqs.setTtl(1);
        info.put("Aveiro",aqs);
        this.cache.setInfo(info);
        assertEquals(aqs, this.cache.getInfo().get("Aveiro"));
    }

    @Test
    void afterHitIncrementHits(){
        this.cache.hit();
        final int expected = 1;
        int real = this.cache.getHits();
        assertEquals(expected, real);
    }

    @Test
    void afterRequestIncrementRequests(){
        this.cache.requests();
        final int expected = 1;
        int real = this.cache.getRequests();
        assertEquals(expected, real);

        
    }

    @Test
    void afterTimeoutInfoIsRemoved(){
        AirQualityStats aqs = new AirQualityStats();
        HashMap<String,AirQualityStats> info = new HashMap<>();
        aqs.setTtl(0);
        info.put("Aveiro",aqs);
        this.cache.setInfo(info);
        this.cache.selfClean();
        boolean contains =this.cache.getInfo().containsKey("Aveiro");
        assertFalse(contains);
    }

    @Test
    void testEquals(){
        AirQualityStats aqs = new AirQualityStats();
        AirQualityStats aqs2 = new AirQualityStats();
        aqs2.setAqi(10);
        aqs2.setCity_name("Aveiro");
        aqs2.setCo(10.1);
        aqs2.setSo2(10.2);
        aqs2.setPollen_level_grass(11);
        aqs2.setPollen_level_tree(12);
        aqs2.setPollen_level_weed(13);
        aqs2.setPm25(14);
        aqs2.setMold_level(15);
        aqs2.setNo2(10.3);
        aqs2.setO3(16);
        aqs2.setPm10(10.4);
        aqs2.setPredominant_pollen_type("pollen type");
        aqs.setAqi(10);
        aqs.setCity_name("Aveiro");
        aqs.setCo(10.1);
        aqs.setSo2(10.2);
        aqs.setPollen_level_grass(11);
        aqs.setPollen_level_tree(12);
        aqs.setPollen_level_weed(13);
        aqs.setPm25(14);
        aqs.setMold_level(15);
        aqs.setNo2(10.3);
        aqs.setO3(16);
        aqs.setPm10(10.4);
        aqs.setPredominant_pollen_type("pollen type");
        boolean comparison = aqs.equals(aqs2);
        assertTrue(comparison);
    }


}
