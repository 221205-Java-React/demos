//This is out actual store file, which will store all the active data in our application

import { configureStore } from "@reduxjs/toolkit";
import { AppState } from "./types";
import reducer from "../reducers/index"


/* The initial state of the application in the store will have a default user and pokemon.
    We contain the state in a globally visible object (visible to the ENTIRE application) 
    When a user or pokemon payload (data) get dispatched (sent) here, this state will change */
const state:AppState = {
    user: {
        id:0,
        username:"",
        password:""
    },
    poke: {
        id:0,
        name:"",
        sprite:""
    }
}
/* These default values will get changed as the user uses the application
When a user logs in, this user object will get populated with their data (won't do this one in the demo) When we GET a pokemon, this poke object will get populated (we WILL see this one) */

/* here, I'm just configuring our store to be able to use reducers so that we can dispatch new data
so when store data changes, reducers AUTOMATICALLY notify components, thus changing the user's view */
export const store = configureStore({
    reducer
})