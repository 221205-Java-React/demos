--I want to create two tables with a relationship
--I can accomplish this with primary key/foreign key relationships

--This schema will track employees and their roles


--roles table
CREATE TABLE roles(
	role_id serial PRIMARY KEY, --The primary key uniquely identifies each record in a table. Typically an ID.
	--serial is an auto-incrementing int data type - perfect for primary keys, which must be unique.
	--whenever we insert a new role, the primary key will be incremented for us
	role_title TEXT NOT NULL, --now, every Role must have a title
	role_salary int check(role_salary > 25000) --thanks to the check, we can't have salaries lower than 25,000
);

--employees table
CREATE TABLE employees(
	employee_id serial PRIMARY KEY,
	first_name TEXT UNIQUE, --we can't have multiple employees with the same first name
	last_name TEXT,
	role_id_fk int REFERENCES roles(role_id) --this is a FOREIGN KEY (note the "references" keyword)
	/*this is saying, "every employee has a role"
	THIS IS HOW WE ESTABLISH RELATIONSHIPS BETWEEN TABLES
	Now, every employee must have one role associated with it, whereas a role can have one, many, or no employees
	*/
);


--DML-------------------------------------

--Data Manipulation Language - SELECT, INSERT, UPDATE, DELETE - Everything to do with creating, viewing, and changing data


/*INSERT some data into the tables

we specify what table and columns we're filling with data (we don't need to put values in for the serial primary key)
and then, we specify what data we actually want to insert
each pair of parenthesis will be a different record in the table
*/
INSERT INTO roles(role_title, role_salary)
VALUES ('Manager', 100000), ('Cashier', 40000), ('Fry Cook', 45000), ('Marketing Director', 100000);

--we can use SELECT to view the data in the table
SELECT * FROM roles; --we can use SELECT * to select everything from the table

SELECT role_title FROM roles; --or, we can select specific columns only

INSERT INTO employees(first_name, last_name, role_id_fk)
VALUES ('Eugene', 'Krabs', 1), ('Squidward', 'Tentacles', 2), 
('Spongebob', 'Squarepants', 3), ('Sheldon', 'Plankton', 4);

SELECT * FROM employees;

--The WHERE clause----------------------------------

--The WHERE clause in a SELECT statement can use many different operators to filter data

--all roles where role_salary is 100,000
SELECT * FROM roles WHERE role_salary = 100000;

--all roles where role_salary IS NOT 100,000
SELECT * FROM roles WHERE role_salary != 100000;

--all roles where role_salary IS GREATER THAN 40000
SELECT * FROM roles WHERE role_salary > 40000;

--all employees where name starts with 'S' (LIKE %)
SELECT * FROM employees WHERE first_name LIKE 'S%'; --this is CASE SeNsItIve

--all employees who have an 'e' in their name (LIKE %)
SELECT * FROM employees WHERE first_name LIKE '%e%';

--all roles where role_salary is BETWEEN 40000 and 50000
SELECT * FROM roles WHERE role_salary BETWEEN 40000 AND 50000;

--all employees with role_id_fk == 1 or 2
SELECT * FROM employees WHERE role_id_fk = 1 OR role_id_fk = 2;
--faster way to do the same thing (IN keyword)
SELECT * FROM employees WHERE role_id_fk IN (1, 2);
--selecting the opposite (NOT 1 or 2)
SELECT * FROM employees WHERE role_id_fk NOT IN (1, 2);


--ORDER BY----------------------

SELECT * FROM roles ORDER BY role_salary; --by default, we "order by" ascending order

--we can specify "desc" for descending order
SELECT * FROM roles ORDER BY role_salary DESC;


--UPDATE-----------------------

--We can use the UPDATE command to change values in our tables

--giving the manager a raise (without the WHERE clause, this would update every row)
UPDATE roles SET role_salary = role_salary + 10000 WHERE role_title = 'Manager';


--DELETE-----------------------

--we can use the DELETE command to delete records (I don't often do this, but it happens sometimes)

--trying to delete the marketing director role
DELETE FROM roles WHERE role_id = 4;

/*
 why can't we delete??
 this is a built in rule, to avoid what's called "orphan records"
 this is one way SQL forces REFERENTIAL INTEGRITY. 
 	We don't want an employee with a FK pointing to something that doesn't exist
  
 We would have to create our tables with the ON CASCADE constraint on the foreign key
 observe below how we would need to create the employees table to allow deletes:
 */

CREATE TABLE employees(
	employee_id serial PRIMARY KEY,
	first_name TEXT UNIQUE, 
	last_name TEXT,
	role_id_fk int REFERENCES roles(role_id) ON DELETE CASCADE --This also works for ON UPDATE CASCADE
);








