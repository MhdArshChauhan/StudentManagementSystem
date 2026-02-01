CREATE TABLE departments (
    department_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100) NOT NULL UNIQUE,
    department_code VARCHAR(10) UNIQUE,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
SHOW DATABASES;

SHOW TABLES;

CREATE DATABASE STORE_MANAGEMENT;

USE STORE_MANAGEMENT;

SHOW TABLES;

CREATE TABLE medicines (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    quantity INT,
    price DECIMAL(10,2)
);

show tables;

select * from medicines;

show databases;

CREATE DATABASE IF NOT EXISTS student_management_db;
USE student_management_db;

CREATE TABLE students (
    student_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15),
    date_of_birth DATE,
    gender ENUM('Male', 'Female', 'Other'),
    address TEXT,
    enrollment_date DATE NOT NULL,
    status ENUM('Active', 'Inactive', 'Graduated', 'Suspended') DEFAULT 'Active',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

select * from students;

INSERT INTO students 

select
        s1_0.student_id,
        s1_0.address,
        s1_0.created_at,
        s1_0.date_of_birth,
        s1_0.email,
        s1_0.enrollment_date,
        s1_0.first_name,
        s1_0.gender,
        s1_0.last_name,
        s1_0.phone,
        s1_0.status,
        s1_0.updated_at 
    from
        students s1_0;
(first_name, last_name, email, phone, date_of_birth, gender, address, enrollment_date, status)
VALUES
('Amit', 'Sharma', 'amit.sharma@example.com', '9876543210', '2001-05-12', 'Male', 'Delhi, India', '2023-08-01', 'Active');

INSERT INTO students 
(first_name, last_name, email, phone, date_of_birth, gender, address, enrollment_date, status)
VALUES
('Priya', 'Verma', 'priya.verma@example.com', '9123456789', '2000-11-23', 'Female', 'Mumbai, India', '2022-07-15', 'Active');

INSERT INTO students 
(first_name, last_name, email, phone, date_of_birth, gender, address, enrollment_date, status)
VALUES
('Rahul', 'Mehta', 'rahul.mehta@example.com', '9988776655', '1999-03-08', 'Male', 'Ahmedabad, India', '2020-06-10', 'Graduated');

select * from students;
  select
        s1_0.student_id,
        s1_0.address,
        s1_0.created_at,
        s1_0.date_of_birth,
        s1_0.email,
        s1_0.enrollment_date,
        s1_0.first_name,
        s1_0.gender,
        s1_0.last_name,
        s1_0.phone,
        s1_0.status,
        s1_0.updated_at 
    from
        students s1_0 
    where
        s1_0.student_id=100;
        
        select
        student_id 
    from
        students 
    where
        email='raj@gmail.com' 
    limit
        1;

