--This SQL script will demonstrate Normal Forms, Joins, and Set Operations

--I only want to demonstrate 1st-3rd normal form (we only really want 3rd normal form)


/*1ST NORMAL FORM (we do not want this)
 Tables must have primary key (which can be composite key)
 Columns must be atomic (cells should contain the smallest piece of data possible) */
CREATE TABLE superheroes(
	hero_name TEXT,
	hero_power TEXT,
	first_name TEXT,
	last_name TEXT,
	home_base TEXT,
	street_address TEXT,
	PRIMARY KEY (hero_name, first_name) --this is how you do a composite key. a PK made up of multiple columns
);


INSERT INTO superheroes (hero_name, hero_power, first_name, last_name, home_base, street_address)
VALUES ('Elastigirl', 'Elasticity', 'Helen', 'Parr', 'The Incredibles House', '123 street st.'),
('Danny Phantom', 'Can do ghost things', 'Danny', 'Felton', 'The Fentons House', '456 street st.'),
('Spiderman', 'Webby Guy', 'Peter', 'Parker', 'His Aunt''s house', '789 street st.'),
('Spiderman', 'Webby Guy', 'Myles', 'Morales', 'His Aunt''s house', '789 street st.');
/*there are two spider men, and they're mostly the same... 
this is what can confusing about composite keys... we don't wanna have dig thru the data to find who's who
the primary key here is the combo of hero_name and first_name. This is a DIFFICULT DISTINCTION TO READ */


SELECT * FROM superheroes;

DROP TABLE superheroes; --Dropping the 1NF table so that we can make a better one


--2NF--------------------------------------

--To be in 2NF we must remove partial dependencies (Only a single column primary key is allowed)

CREATE TABLE superheroes(
	superhero_id serial PRIMARY KEY, --no more composite keys!!!
	hero_name TEXT,
	hero_power TEXT,
	first_name TEXT,
	last_name TEXT,
	home_base TEXT,
	street_address TEXT
);

INSERT INTO superheroes (hero_name, hero_power, first_name, last_name, home_base, street_address)
VALUES ('Elastigirl', 'Elasticity', 'Helen', 'Parr', 'The Incredibles House', '123 street st.'),
('Danny Phantom', 'Can do ghost things', 'Danny', 'Felton', 'The Fentons House', '456 street st.'),
('Spiderman', 'Webby Guy', 'Peter', 'Parker', 'His Aunt''s house', '789 street st.'),
('Spiderman', 'Webby Guy', 'Myles', 'Morales', 'His Aunt''s house', '789 street st.');


--3NF--------------------------------------







