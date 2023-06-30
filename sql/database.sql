CREATE DATABASE metro_system;
USE metro_system;
CREATE TABLE metro_info(id int, metro_src varchar(40), metro_dest varchar(30), price bigint, name varchar(50),location varchar(100),capacity int, ticket_types varchar(80), status varchar(50), opening_time time);



CREATE DATABASE Colgate;
USE Colgate;
CREATE TABLE Products(productID int, productName varchar(100), category varchar(50), description varchar(150), price decimal(10), quantity int,manufacturing_date date, expiry_date date, supplier varchar(50),location varchar(50));



CREATE DATABASE Temple;
USE Temple;
CREATE TABLE Visitors (visitorID int, visitor_name varchar(200), gender varchar(10),age int, city varchar(100), country varchar(100), date_visited date, time_in time, time_out time, feedback varchar(300));



CREATE DATABASE Shopping;
USE Shopping;
CREATE TABLE Products(productID int, productName varchar(100), category varchar(50), description varchar(150), price decimal(10, 2), quantity int,manufacturer varchar(80), rating decimal(3, 2),availability varchar(50),discount decimal(4, 2));



CREATE DATABASE Bedsheet;
USE Bedsheet;
CREATE TABLE Products(productID int, product_name varchar(100), material varchar(90), size varchar(10), color varchar(50), thread_count int, price decimal(10, 2), quantity int, manufacturer varchar(100), supplier varchar(50));



CREATE DATABASE Highway;
USE Highway;
CREATE TABLE Road_info(id int, start_location varchar(100), end_location varchar(100), length decimal(10,2), lanes int, surface_type varchar(50), toll boolean, construction_year int, maintenance_status varchar(70), speed_limit int);



CREATE DATABASE Drainage;
USE Drainage;
CREATE TABLE Drainage_info(id int, location varchar(100), type varchar(50), length decimal(10, 2), capacity decimal(10, 2), material varchar(50), maintenance_status varchar(50), installation_year int, inlet_count int, outlet_count int);



CREATE DATABASE Tree;
USE Tree;
CREATE TABLE Tree_info(id int, species varchar(100), height decimal(10,2), diameter decimal(10, 2), age int, location varchar(100), country varchar(100), planted_year int, owner varchar(100), maintenance_status varchar(100));



CREATE DATABASE Elevator;
USE Elevator;
CREATE TABLE Elevator_info(id int, building_name varchar(100), floor_count int, manufacturer varchar(100), capacity int, installation_date date, last_maintenance_date date, maintenance_status varchar(50), current_floor int, operational boolean);



CREATE DATABASE Water_tank;
USE Water_tank;
CREATE TABLE tank_info(id int, capacity decimal(10, 2), material varchar(100), diameter decimal(10, 2), height decimal(10, 2), installation_date date, last_maintenance_date date, maintenance_status varchar(50), location varchar(100), supplier varchar(100));


