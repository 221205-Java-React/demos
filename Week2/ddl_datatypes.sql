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




--Ben will talk about the other DDL commands and the datatypes tomorrow morning :)