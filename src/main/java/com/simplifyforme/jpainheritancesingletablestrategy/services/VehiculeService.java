package com.simplifyforme.jpainheritancesingletablestrategy.services;

import com.simplifyforme.jpainheritancesingletablestrategy.entities.Car;
import com.simplifyforme.jpainheritancesingletablestrategy.entities.Truck;
import com.simplifyforme.jpainheritancesingletablestrategy.entities.Vehicle;
import com.simplifyforme.jpainheritancesingletablestrategy.repositories.CarRepository;
import com.simplifyforme.jpainheritancesingletablestrategy.repositories.TruckRepository;
import com.simplifyforme.jpainheritancesingletablestrategy.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class VehiculeService {

    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private TruckRepository truckRepository;

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

}
