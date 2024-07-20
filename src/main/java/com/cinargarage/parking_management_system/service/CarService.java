package com.cinargarage.parking_management_system.service;

import com.cinargarage.parking_management_system.entity.Car;

import java.util.List;

public interface CarService {
    Car saveCar(Car car);
    void deleteCar(String plateNumber);
    List<Car> getAllCars();
    boolean isCarExists(String plateNumber);
    int getAvailableSlots();
}
