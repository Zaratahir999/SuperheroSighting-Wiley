-Overview-

Design a database and JdbcTemplate-based DAO for a superhero sightings application. With Spring Boot web application on top of the Superhero Sightings Data Layer.


-Requirements-

An entity relationship diagram

You may use MySQL Workbench to create a diagram, or use your choice of alternative tools such as Pencil, Draw.IO, or LucidChart.

The database must achieve 2nd normal form at minimum.

Proper naming conventions should be used.

The ERD should be very easy to read, with all components clearly labeled.

Use a common and appropriate file format, such as a png or jpg image or a PDF document.

A database creation script

The script should create the database with all tables, columns, and relationships.

Make reasonable assumptions about column data types; be prepared to justify your decisions.

The script should be re-runnable. This means it should drop the database and all objects if they exist and recreate them. You should be able to execute the script many times in a row without error. See the scripts provided for the databases used in the Relational Database unit for examples.

DAO Implementation and Unit Tests

DAO should have an interface and an implementation.

DAO and DTOs must fully represent all data and relationships contained in the database design.

Implementation must make proper use of transactions.

Unit tests must fully test all create, read, update, and delete functionality for all entities and test all many-to-many and one-to-many relationships in the database.




The system has the following requirements:

It must keep track of all superhero/supervillain information.
Heroes have names, descriptions, and a superpower.
Heroes are affiliated with one or more superhero/supervillain organizations.
Locations have names, descriptions, address information, and latitude/longitude coordinates.
The system must be able to report all of the superheroes sighted at a particular location.
The system must be able to report all of the locations where a particular superhero has been seen.
The system must be able to report all sightings (hero and location) for a particular date.
The system must be able to report all of the members of a particular organization.
The system must be able to report all of the organizations a particular superhero/villain belongs to.
