//reducers help us take in new data from actions and send that data to the store
//this is the Pokemon Reducer, which will help us take in a new pokemon and make it globally accessible

import { ADD_POKEMON, GET_POKEMON } from "../actions/ActionTypes";
import { Pokemon } from "../store/types";

let initialState:Pokemon = {
    id: 0,
    name: "",
    sprite: ""
}

//This is an object that will determine what action to take below, and send some data to the store
type Action = {
    type: string,
    payload: any
}

export const PokeReducer = (state:Pokemon = initialState, action:Action) => {

    //this switch is typical of any reducer... determine what action is being taken and act accordingly
    switch(action.type){

        case GET_POKEMON: 
            initialState = action.payload
            return{
                ...initialState
                /* Property spread notation (...) helps us send entire objects.
                Spreads the properties of the object out as props. saves us a lot of typing!*/
            }
        case ADD_POKEMON:
            //add poke stuff would go here
            break;
        default:
            return state; //if none of the cases are matched, just send back the original empty pokemon

    }

}