//Hopefully you all remember how Java Interfaces work :)
//TS interfaces have much of the same functionality, but we usually store uninitialized objects, no functions

//We will make a UserComponent that inherits from this Interface
export interface User {
    firstName?: string,
    lastName?: string,
    username?: string,
    email?: string
}
//we can use ? to make the inclusion of the value optional when making user objects
//sometimes you don't know if it exists in another DB - so you use ? to check if it exists - Hamza 2023
//if you know what data you're working and you know you NEED each of the fields, I'd leave the ? out
