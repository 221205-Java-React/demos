//PokeAPI base URL - making a variable to hold the base URL to reach pokeAPI. This is for cleaner code
const url = "https://pokeapi.co/api/v2/pokemon/";

//use DOM Selection to select all of the elements I plan to fill with data
let pokename = document.getElementById("pokename");
let poketype = document.getElementById("poketype");
let pokenum = document.getElementById("pokenum");
let pokepic = document.getElementById("pokepic");

//when the user clicks the button, execute the fetchData method (using an eventListener)
document.getElementById("btn").onclick = fetchData;

/* This function will return some Pokemon data
It will use the Fetch api to return a promise object
This promise object will get filled with data for the pokemon we requested */
async function fetchData(){

    //put the user's input into a variable (using .value)
    let userInput = document.getElementById("userInput").value;

    /* use the fetch() method to send a request to the PokeAPI with the user's input 
       fetch sends a GET request by default. */
    await fetch(url + userInput)
    .then((response) => response.json()) //extract the body of the response
    .then((data) => console.log(data)) //send the data to the renderHTML function

    

}
