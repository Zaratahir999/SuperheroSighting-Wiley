# Superhero Sightings Database Design Project

## Overview
Design a database and JdbcTemplate-based DAO for a superhero sightings application. The Spring Boot web application will utilize the Superhero Sightings Data Layer.

## Requirements

### Entity Relationship Diagram (ERD)
Create an ERD that meets the following criteria:
- Achieves at least 2nd normal form
- Uses proper naming conventions
- Clearly labeled components
- Format: PNG, JPG, or PDF

### Database Creation Script
Create a script to:
- Create the database with all tables, columns, and relationships
- Use reasonable assumptions for column data types
- Be re-runnable without errors

### DAO Implementation and Unit Tests
Implement DAO with interface and implementation
- Represent all data and relationships from the database design
- Proper use of transactions
- Unit tests for create, read, update, and delete functionality for all entities
- Test all many-to-many and one-to-many relationships

## System Requirements

### Entities:
- Superheroes/Super-villains: Name, Description, Superpower
- Organizations: Name, Description
- Locations: Name, Description, Address, Latitude/Longitude Coordinates

### Functionality:
- Report all superheroes sighted at a particular location
- Report all locations where a particular superhero has been seen
- Report all sightings (hero and location) for a specific date
- Report all members of a specific organization
- Report all organizations a particular superhero/villain belongs to

## How to Run
- Clone this repository
- Execute the database creation script
- Implement DAO and run unit tests
