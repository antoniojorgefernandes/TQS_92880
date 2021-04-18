package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/cars")
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        HttpStatus status = HttpStatus.CREATED;
        Car c = carService.save(car);

        return new ResponseEntity<>(c, status);
    }

    @GetMapping("/car")
    public Car getCarModel(@RequestParam(name = "model") String model){
        return carService.getCarModel(model);
    }
}