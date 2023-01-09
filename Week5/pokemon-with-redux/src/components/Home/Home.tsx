import axios from 'axios';
import React, { useState } from 'react'
import Pokemon from '../Pokemon/Pokemon';

import "./Home.css"

const Home: React.FC<any> = () => {

  //we need some useState hooks to store Pokemon info, and send to the Pokemon Component
  const [pokeId, setPokeId] = useState(0);
  const [pokeName, setPokeName] = useState("");
  const [pokeSprite, setPokeSprite] = useState("");

  //a function that stores the user inputted pokeID (which we need for the GET request)
  const gatherInput = (input:any) => {
    if(input.target.name === "pokeSearch"){
        setPokeId(input.target.value) //use the mutator to save the inputted ID to pokeId
    }
  }

  //a function that makes an axios HTTP GET request
  const loadPokemon = async () => {
    //making an axios HTTP Request to GET a specific pokemon by its ID.
    //remember, we need to AWAIT anything that returns a promise
    const response = await axios.get("https://pokeapi.co/api/v2/pokemon/" + pokeId);

    //fill out the pokemon state variables with the incoming data
    setPokeName(response.data.name)
    setPokeSprite(response.data.sprites.front_shiny)
  }

  return (
    <div className="home-page"> 

        <div className="home-container"> 
            <h3>Search for your Pokemon</h3>
            <input type="number" name="pokeSearch" placeholder="Enter PokeID" onChange={gatherInput}/>
            <button className='poke-button' onClick={loadPokemon}>Find Pokemon</button>
            <Pokemon name={pokeName} sprite={pokeSprite}/>
        </div>

    </div>
  )
}

export default Home

//rafce to auto generate the React Function Component skeleton