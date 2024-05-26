package com.simplifyforme.jpainheritancesingletablestrategy.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("TRUCK")
public class Truck extends Vehicle {
    private float loadCapacity;
    private boolean hasTrailer;
}
