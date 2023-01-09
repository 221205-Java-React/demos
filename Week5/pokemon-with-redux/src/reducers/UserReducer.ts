//leaving this barebones just to get the error out of the way

import { User } from "../store/types";

let initialState:User = {
    id:0,
    username:"",
    password:""
}

type Action = {
    type: string,
    payload: any
}

export const UserReducer = (state:User = initialState, action:Action) => { }
