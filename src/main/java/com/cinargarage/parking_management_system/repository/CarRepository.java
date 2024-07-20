package com.cinargarage.parking_management_system.repository;

import com.cinargarage.parking_management_system.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByPlateNumber(String plateNumber);
}
