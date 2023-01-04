import React, { useEffect, useState } from "react";
import { User } from "../../interfaces/User";

import "./PostComponent.css"

/*
export CONST instead export class. We're in a function component, not a class component
recall how lambdas/arrow function work: they take in some arguments, and execute some code
in this case, we take in a User Interface as props to use in this function
*/
export const PostComponent: React.FC<User> = (user:User) => {

    /*
    Below we will see two types of variable management in Function Components:
    -Destructuring, which is how we can variables from props
    -useState, which lets us declare state
    */

    /* Destructuring
     We're breaking apart the User object that was passed in as props
     In this case, we're taking a couple variables and turning them into local variables we can use.
     The name inside the curly braces must match the variable in the props that we want to store */
    const {username} = user;
    const {email} = user;

    /* useState
        Allows us to store and manipulate state.
        We declare a variable, a mutator function, and a default value within the useState.
        So now, we can access and change the value of the state object */
   let [content, setContent] = useState('');

   /* useEffect
   Allows us to execute some code at certain events in the component's life
   This can be anything from button clicks, to state change, to simply rendering the component
    */
    useEffect(() => {
        //We'll use useEffect to call our useState mutators when the component renders
        setContent("We are setting this text with the useState mutator in the useEffect hook")
    }, []) //empty square brackets because we want this useEffect to happen when the component renders


    return(
        <div className="post-container">
            <div className="profile-container">
                <img className="profile-pic" src="https://t4.ftcdn.net/jpg/00/64/67/63/360_F_64676383_LdbmhiNM6Ypzb3FM4PPuFP9rHe7ri8Ju.jpg
" alt="profile pic" />
                <h4 className="profile-username">{username}</h4>
            </div>

            <div className="content-container">
                <h5>{username} says:</h5>
                <p>{content}</p>
            </div>
        </div>
    )
    
}

