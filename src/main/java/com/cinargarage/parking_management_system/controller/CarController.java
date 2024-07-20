package com.cinargarage.parking_management_system.controller;

import com.cinargarage.parking_management_system.entity.Car;
import com.cinargarage.parking_management_system.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<String> addCar(@RequestBody Car car) {
        try {
            carService.saveCar(car);
            int availableSlots = carService.getAvailableSlots();
            return new ResponseEntity<>("Plaka başarıyla eklendi. Kapasite durumu: " + availableSlots, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @DeleteMapping("/{plateNumber}")
    public ResponseEntity<String> removeCar(@PathVariable String plateNumber) {
        try {
            carService.deleteCar(plateNumber);
            int availableSlots = carService.getAvailableSlots();
            return new ResponseEntity<>("Plaka başarıyla silindi. Kapasite durumu: " + availableSlots, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }
}