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
    .then((response) => response.json()) //extract the body of the response (the HTTP Response from PokeAPI)
    .then((data) => renderHTML(data)) //this "data" variable gets the JS version of the incoming JSON. We send the data to the renderHTML function
    .then(() => document.getElementById("header").innerHTML = "Pokemon Found!")
    .catch((error) => document.getElementById("header").innerHTML = "It got away!! Try Again...")
    .finally(() => 
        setTimeout(() => document.getElementById("header").innerHTML = "Find A Pokemon:", 2000))

    /* Ben will add another .then(), .catch(), .finally(), and elaborate */

}

//This function will take in the Pokemon data (which we converted to JS above), and render data on the page
function renderHTML(data){

    console.log(data); //just to see the full dataset we're using

    //populate the previously empty HTML elements with the appropriate Pokemon data
    pokename.innerHTML = data.name;
    poketype.innerHTML = data.types[0].type.name;
    //we want to check if there's a second type, render it if so
    if(data.types[1]){
        poketype.innerHTML += ("/" + data.types[1].type.name)
    }
    pokenum.innerHTML = data.id

    //pokepic will be a little different, we need to set the src attribute of the <img> tag
    pokepic.setAttribute("src", data.sprites.front_default)

}