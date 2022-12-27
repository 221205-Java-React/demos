//First we'll make a basic named function
//because of hoisting, we can call this method before we actually declare it
helloWorld();

function helloWorld(){
    console.log("hola mundo");
}

/* Here's an anonymous function, it hasn't been named, but it's assigned a variable 
So basically, it's a function stored in a variable */
var anon = function(){
    console.log("I'm in an anonymous function!!");
}

anon(); //we call the variable to invoke the function

/* Arrow functions are basically like Lambdas in Java 
takes in some argument(s), and performs some logic */
let test = (var1, var2) => {
    console.log(var1 + " compared to " + var2);
    console.log(var1 == var2);
};

//thanks Luan... now we can call this function to compare the values (NOT TYPES) of two variables
test(1, true);
test(" ", false);

//callback functions

//closures

