//This file is where all HTTP calls to the server related to POKEMON would lie

import axios from "axios"
import { Pokemon } from "../store/types"
import { GET_POKEMON } from "./ActionTypes"

//this Action will GET Pokemon from the PokeAPI, when given an id to search with
export const getPoke = (pokeId:number) => async (dispatch:any) => {

    //empty object of type Pokemon (the interface from the store) which we'll populate with a GET request
    let incomingPoke:Pokemon

    try{
        const response = await axios.get("https://pokeapi.co/api/v2/pokemon/" + pokeId)

        //fill the empty incomingPoke with pokemon data
        incomingPoke = {
            id: response.data.id,
            name: response.data.name,
            sprite: response.data.sprites.front_shiny
        }

        //we need to use the dispatcher to send this new data to the store/reducer
        return dispatch ({
            type: GET_POKEMON,
            payload: incomingPoke
        })

    } catch (e) {
        console.log("GET POKE FAILED")
    }

}