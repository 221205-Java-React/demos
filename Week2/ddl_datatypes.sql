--To create a new schema (which we'll do for every individual demo/project):
--right click the schemas folder, create new schema, give it a name
--right click your new schema -> sql eqitor -> new sql script

--Data Definition Language (DDL): CREATE, ALTER, TRUNCATE, DROP
--DDL is any SQL command that relates to THE STRUCTURE of your database. (DEFINING the structure of our database)

--the CREATE command lets us create database tables
CREATE TABLE users(
	username TEXT 
	--username is the name of a column (attribute) in the users table
	--TEXT is a datatype. The username is text-based, like a String in Java
);

--we can view this table by right clicking the schema -> view diagram
--don't forget to right click the schema -> refresh for changes to populate

--OH NO! I forgot to add the user's age to the table! I can ALTER the table with the ALTER command
ALTER TABLE users ADD user_age int;

--I won't run the two commands below (no data/I want the table to stay up)

--we can use TRUNCATE to wipe all data from the users table
TRUNCATE TABLE users;

--we can use DROP to delete a table and its data entirely
DROP TABLE users;


--DATA TYPES---------------------------------------------------------

--I'm going to make a horribly designed table to list out some data types
--Why is this table bad? No primary key, not normalized, bad column names, we'll never make another table like this.

--notice that the columns are delimited by commas
CREATE TABLE datatypes(
	small_numbers int2, -- 2 bytes, for smaller numbers (like a short in Java)
	normal_number int, --4 bytes, most commonly used int type
	big_number int8, --8 bytes in size, but big number (like a long in Java)
	standard_decimal decimal(10, 2), --2 parameters (total # of digits, total # of decimal places
	--yes, decimal places are counted in the total number of digits (8 integers, 2 decimal places here)
	
	"boolean" boolean, --double quotes let you use keywords as column names, etc.
	
	fixed_length_text char(2), --TEXT field that can hold ONLY the amount of characters given (2 in this case)
	variable_length_text varchar(15), --TEXT field that can hold UP TO the amount of characters specified
	unlimited_length_text TEXT, --unlimited length, best practice if you don't need to limit your characters
	
	"date" date --lets you input a date in YYYY-MM-DD format
	--can be tricky to convert from Java Date objects... sometimes I prefer just a text date in the DB
	
	--because nothing comes after date, we don't put a comma
	
);

--there are A LOT more datatypes, feel free to look into them, but we'll mostly just use int, text, maybe boolean




