package com.simplifyforme.jpainheritancesingletablestrategy.repositories;

import com.simplifyforme.jpainheritancesingletablestrategy.entities.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}