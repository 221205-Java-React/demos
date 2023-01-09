//this file will combine our UserReducer and PokeReducer
//it'll act as a one stop shop for new data coming in that needs to be dispatched to the store

import { combineReducers } from "redux";
import { PokeReducer } from "./PokeReducer";
import { UserReducer } from "./UserReducer";


export default combineReducers({
    user:UserReducer,
    poke:PokeReducer
})

/* This isn't a necessary step for this all to work, but it's great for sanity
imagine we had 50 reducers for 50 different DB tables we're calling to
better to just combine them all in one entity so you only ever have to call one thing */