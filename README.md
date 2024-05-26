# JPA Inheritance - Single Table Strategy

This repository provides an example of using the Single Table inheritance strategy in Java Persistence API (JPA). Single Table inheritance strategy allows mapping of an inheritance hierarchy of entities onto a single database table.

## Overview

In object-oriented programming, inheritance allows a class to inherit properties and behavior from another class. Similarly, in JPA, inheritance can be modeled between entities. Single Table inheritance strategy is one of the strategies provided by JPA to map inheritance hierarchies.

In this example, we have a simple inheritance hierarchy with a base class `Vehicle` and two subclasses `Car` and `Bike`. These classes are mapped to a single table in the database using the `@Inheritance(strategy = InheritanceType.SINGLE_TABLE)` annotation.

## Technologies Used

- Java
- Java Persistence API (JPA)
- Maven

## Dependencies

- Java Development Kit (JDK)
- Maven
