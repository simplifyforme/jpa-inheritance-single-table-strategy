package com.simplifyforme.jpainheritancesingletablestrategy.repositories;

import com.simplifyforme.jpainheritancesingletablestrategy.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
