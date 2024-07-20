package com.cinargarage.parking_management_system.service.impl;

import com.cinargarage.parking_management_system.entity.Car;
import com.cinargarage.parking_management_system.repository.CarRepository;
import com.cinargarage.parking_management_system.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    private static final int MAX_CAPACITY = 100;

    @Override
    public Car saveCar(Car car) {
        car.setPlateNumber(car.getPlateNumber().toUpperCase());
        if (carRepository.findByPlateNumber(car.getPlateNumber()) != null) {
            throw new IllegalArgumentException("Bu plaka daha önce eklendi.");
        }
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(String plateNumber) {
        Car car = carRepository.findByPlateNumber(plateNumber.toUpperCase());
        if (car == null) {
            throw new IllegalArgumentException("Plaka bulunamadı.");
        }
        carRepository.delete(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public boolean isCarExists(String plateNumber) {
        return carRepository.findByPlateNumber(plateNumber.toUpperCase()) != null;
    }

    @Override
    public int getAvailableSlots() {
        return MAX_CAPACITY - (int) carRepository.count();
    }
}