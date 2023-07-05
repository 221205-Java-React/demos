import axios from 'axios';
import React, { useState } from 'react'
import Pokemon from '../Pokemon/Pokemon';

import "./Home.css"

const Home: React.FC<any> = () => {

  //we need some useState hooks to store Pokemon info, to send to the Pokemon Component
  //setting an object in useState complicates mutations a bit... see below
  const [pokemon, setPokemon] = useState({
    pokeId:0,
    pokeName:"",
    pokeSprite:""
  })

  //a function that stores the user inputted pokeID (which we need for the GET request)
  const gatherInput = (input:any) => {
        
        //use the mutator to save the inputted ID to pokeId
        //with an object stored in state, we must spread the original object... 
        //...and then specify which values to change. In this case, pokeId.
        setPokemon((pokemon) => ({...pokemon, pokeId:input.target.value}))
  }

  //a function that makes an axios HTTP GET request
  const loadPokemon = async () => {


    //making an axios HTTP Request to GET a specific pokemon by its ID.
    //remember, we need to AWAIT anything that returns a promise
    const response = await axios.get("https://pokeapi.co/api/v2/pokemon/" + pokemon.pokeId, 
    {headers: {Authorization: "Bearer: insertJWTHere"}}
    );

    //Note the pseudo Authorization header!!^^ This is how you'd add headers with axios

    //fill out the pokemon state variables with the incoming data
    setPokemon((pokemon) => ({...pokemon, pokeSprite: response.data.sprites.front_default}))
    setPokemon((pokemon) => ({...pokemon, pokeName: response.data.name}))
  
  }

  return (
    <div className="home-page"> 

        <div className="home-container"> 
            <h3>Search for your Pokemon</h3>
            <input type="number" name="pokeSearch" placeholder="Enter PokeID" onChange={gatherInput}/>
            <button className='poke-button' onClick={loadPokemon}>Find Pokemon</button>
            <Pokemon pokemon={pokemon}/>
        </div>

    </div>
  )
}

export default Home

//rafce to auto generate the React Function Component skeleton