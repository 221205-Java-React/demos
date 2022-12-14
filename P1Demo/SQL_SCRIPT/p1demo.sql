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



--Showing off some aggregate functions, group by, and having.

SELECT avg(role_salary) FROM roles;

SELECT sum(role_salary) FROM roles;

SELECT min(role_salary) FROM roles;

SELECT max(role_salary) FROM roles;

SELECT count(role_salary) FROM roles where role_salary > 50000;

SELECT count(*) FROM employees;

--GROUP BY will merge rows together based on matching column values
SELECT count(*) FROM employees GROUP BY last_name;

--HAVING is like a where clause, but it can only be used after a GROUP BY. trying to use where with group by won't work.
SELECT count(*) FROM employees GROUP BY last_name HAVING last_name = 'Tentacles';

SELECT count(*) FROM employees GROUP BY last_name HAVING last_name = 'Tentacles' OR last_name = 'Squarepants';


/*We use WHERE for standard, un-aggregated data.
We use HAVING after a GROUP BY operation.
We cannot use one where the other belongs. WHERE doesn't work after a GROUP BY for instance.

GROUP BY is only useable after aggregate functions
*/

