package com.simplifyforme.jpainheritancesingletablestrategy.controllers;

import com.simplifyforme.jpainheritancesingletablestrategy.entities.Car;
import com.simplifyforme.jpainheritancesingletablestrategy.entities.Truck;
import com.simplifyforme.jpainheritancesingletablestrategy.entities.Vehicle;
import com.simplifyforme.jpainheritancesingletablestrategy.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehiculeService vehicleService;

    @PostMapping("/car")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car savedCar = (Car) vehicleService.saveVehicle(car);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }

    @PostMapping("/truck")
    public ResponseEntity<Truck> createTruck(@RequestBody Truck truck) {
        Truck savedTruck = (Truck) vehicleService.saveVehicle(truck);
        return new ResponseEntity<>(savedTruck, HttpStatus.CREATED);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = vehicleService.getAllCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping("/trucks")
    public ResponseEntity<List<Truck>> getAllTrucks() {
        List<Truck> trucks = vehicleService.getAllTrucks();
        return new ResponseEntity<>(trucks, HttpStatus.OK);
    }

        @GetMapping("/vehicles")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> trucks = vehicleService.getAllVehicles();
        return new ResponseEntity<>(trucks, HttpStatus.OK);
    }
}