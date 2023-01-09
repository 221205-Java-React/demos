import axios from 'axios';
import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import { getPoke } from '../../actions/PokeActions';
import Pokemon from '../Pokemon/Pokemon';

import "./Home.css"

const Home: React.FC<any> = () => {

  /* We need useSelector to access the store 
  we set it so that it can take <any state, and access any store>
  our state object is set to change to whatever state is in the store */
  const appState = useSelector<any, any>((state) => state)

  //we need some useState hooks to store Pokemon info, and send to the Pokemon Component
  const [pokeId, setPokeId] = useState(0);

  //we need useDispatch to DISPATCH (send) info to our action, which sends it to the store.
  const dispatch = useDispatch();

  //a function that stores the user inputted pokeID (which we need for the GET request)
  const gatherInput = (input:any) => {
    if(input.target.name === "pokeSearch"){
        setPokeId(input.target.value) //use the mutator to save the inputted ID to pokeId
    }
  }

  //a function that makes an axios HTTP GET request
  const loadPokemon = async () => {
    await dispatch(
      getPoke(pokeId) as any
    )
    /* We send the pokeId state variable to the getPoke action
    "as any" because the component doesn't know what data type this will return
    the pokemon object in question will then get sent to the store */
  }

  return (
    <div className="home-page"> 

        <div className="home-container"> 
            <h3>Search for your Pokemon</h3>
            <input type="number" name="pokeSearch" placeholder="Enter PokeID" onChange={gatherInput}/>
            <button className='poke-button' onClick={loadPokemon}>Find Pokemon</button>
            <Pokemon name={appState.poke.name} sprite={appState.poke.sprite}/>
        </div>

    </div>
  )
}

export default Home

//rafce to auto generate the React Function Component skeleton