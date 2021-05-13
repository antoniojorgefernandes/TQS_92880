package tqs.Assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = AssignmentApplication.class)
@AutoConfigureMockMvc
class TestController {
    @Autowired
    private MockMvc Mockmvc;

    @Test
    void whenGetHomePageReturn200() throws Exception {
      Mockmvc.perform(get("/")).andExpect(status().isOk());
    }

    @Test
    void whenSearchForCityReturn200() throws Exception{
       Mockmvc.perform(get("/aveiro")).andExpect(status().isOk());
    }

    @Test
    void whenGetCacheInfoReturn200() throws Exception {
       Mockmvc.perform(get("/cache")).andExpect(status().isOk());
    }

    @Test
    void whenCallApiCityReturn200() throws Exception {
       Mockmvc.perform(get("/api/aveiro")).andExpect(status().isOk());
    }

    @Test
    void whenCallApiCacheReturn200() throws Exception {
       Mockmvc.perform(get("/api/cache")).andExpect(status().isOk());
    }

}