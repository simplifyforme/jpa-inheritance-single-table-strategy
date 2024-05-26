package com.simplifyforme.jpainheritancesingletablestrategy.repositories;

import com.simplifyforme.jpainheritancesingletablestrategy.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}