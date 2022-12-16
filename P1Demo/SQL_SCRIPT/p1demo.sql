CREATE TABLE roles(
	role_id serial PRIMARY KEY, 
	role_title TEXT NOT NULL, 
	role_salary int check(role_salary > 25000) 
);

CREATE TABLE employees(
	employee_id serial PRIMARY KEY,
	first_name TEXT UNIQUE, 
	last_name TEXT,
	role_id_fk int REFERENCES roles(role_id)
);

INSERT INTO roles(role_title, role_salary)
VALUES ('Manager', 100000), ('Cashier', 40000), ('Fry Cook', 45000), ('Marketing Director', 100000);

SELECT * FROM roles;

SELECT role_title FROM roles; 

INSERT INTO employees(first_name, last_name, role_id_fk)
VALUES ('Eugene', 'Krabs', 1), ('Squidward', 'Tentacles', 2), 
('Spongebob', 'Squarepants', 3), ('Sheldon', 'Plankton', 4);

SELECT * FROM employees;




