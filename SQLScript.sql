CREATE DATABASE EMPLOYEE;
USE EMPLOYEE;

CREATE TABLE user (
  id bigint NOT NULL AUTO_INCREMENT,
  annual_salary int DEFAULT NULL,
  date_of_birth varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  first_name varchar(255) DEFAULT NULL,
  gender varchar(255) DEFAULT NULL,
  last_name varchar(255) DEFAULT NULL,
  mobile_phone varchar(255) DEFAULT NULL,
  user_type varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE useraddress (
  id int NOT NULL AUTO_INCREMENT,
  addr_ln1 varchar(255) DEFAULT NULL,
  addr_ln2 varchar(255) DEFAULT NULL,
  addrname varchar(255) DEFAULT NULL,
  addrtype varchar(255) DEFAULT NULL,
  city varchar(255) DEFAULT NULL,
  country varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  location_code varchar(255) DEFAULT NULL,
  postal_code varchar(255) DEFAULT NULL,
  state_code varchar(255) DEFAULT NULL,
  user_id bigint DEFAULT NULL,
  PRIMARY KEY (id),
  KEY A (user_id),
  FOREIGN KEY (user_id) REFERENCES user2 (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



