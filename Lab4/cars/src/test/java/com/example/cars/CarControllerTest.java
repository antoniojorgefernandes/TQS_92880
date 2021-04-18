package com.example.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CarController.class)
class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CarService service;


    @Test   
    public void whenPostCar_thenCreateCar() throws Exception {
        Car car = new Car("car1model", "car1brand");
        given(service.save(Mockito.any())).willReturn(car);

        mvc.perform(post("/api/cars").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(car)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.model", is("car1model")))
                .andExpect(jsonPath("$.maker", is("car1brand")));  
                verify(service, VerificationModeFactory.times(1)).save(Mockito.any());
        reset(service);
    }

    @Test
    public void givenCar_whenGetCar_thenReturnCar() throws Exception{
        Car car = new Car("car1model", "car1brand");
        given(service.getCarModel("car1model")).willReturn(car);

        mvc.perform(get("/api/car").contentType(MediaType.APPLICATION_JSON).param("model","car1model"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.model", is("car1model")))
                .andExpect(jsonPath("$.maker", is("car1brand"))); 
                verify(service, VerificationModeFactory.times(1)).getCarModel("car1model");
        reset(service);
    }
}