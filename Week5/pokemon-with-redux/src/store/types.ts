//this file stores interfaces for all types (object data types) that we will need

//declaring some data types with default values as interfaces

export interface User {
    id: number,
    username: string,
    password: string //probably don't want/need to store a password in the front end
}

export interface Pokemon {
    id: number,
    name: string,
    sprite: any //technially the sprite comes in as a string, but we use it in imgs 
}

//AppState is an object that will store one of each datatype in our global store 
//note the type keyword... it's like calling something an object in Java. It's a "data type"
export type AppState = {
    user: User,
    poke: Pokemon
}