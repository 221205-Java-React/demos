//this is a rudimentary implementation of a store, which is basically global storage
//any data that you want to store globally (visible to the entire app) can reside here
//look into redux to see a more sophisticated use case, but be warned it's a dense topic.

export const state:any = {
    JWT: ""
}

//this default JWT value will get changed when the user logs in 
//(we'll assign the returned JWT here)