package com.example.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {
    @Mock(lenient = true)
    private CarRepository carRepository;

    @InjectMocks
    private CarService carService;

    @BeforeEach
    public void setUp(){
        Car car1 = new Car("car1model", "car1brand");
        Car car2 = new Car("car2model", "car2brand");
        Car car3 = new Car("car3model", "car3brand");


        Mockito.when(carRepository.findByModel(car1.getModel())).thenReturn(car1);
        Mockito.when(carRepository.findByModel(car2.getModel())).thenReturn(car2);
        Mockito.when(carRepository.findByModel(car3.getModel())).thenReturn(car3);
    }

    @Test
    public void whenValidModel_returnCar() {
        String[] cars = {"car1model","car2model","car3model"};
        for (String c : cars){
            Car car = carService.getCarModel(c);
            assertThat(car.getModel()).isEqualTo(c);
        }
    }

    @Test
    public void whenInvalidModel_noReturn() {
        String no_car = "no_car";
        Car car = carService.getCarModel(no_car);
        assertThat(car).isNull();

        Mockito.verify(carRepository, VerificationModeFactory.times(1)).findByModel(no_car);
        Mockito.reset(carRepository);
    }

}