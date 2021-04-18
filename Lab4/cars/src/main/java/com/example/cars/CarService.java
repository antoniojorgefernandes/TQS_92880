package com.example.cars;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class CarService {
    @Autowired
    private CarRepository carRep;

    public Car save(Car car) {
        return carRep.save(car);
    }

    public Car getCarModel(String model){
        return carRep.findByModel(model);
    }
}