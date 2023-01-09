import axios from 'axios';
import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import { useNavigate } from 'react-router-dom';
import { loginUser } from '../../actions/UserActions';

import "./Login.css"

const Login: React.FC<any> = () => {

  //this is how we access the state in the store. (The data in the universal data file).
  const appState = useSelector<any, any>((state) => state);

  //we need this object to actually dispatch data to our store
  const dispatch = useDispatch();

  //useState hooks to declare some state that will hold username and password
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  //we'll use this object to switch components whenever appropriate
  //this is what lets us navigate to different components with events - no more manual URL changes!
  const navigate = useNavigate();

  /* when the user updates the username/password this will be called thanks to onChange
  the username OR password state will get updated based on the name of the input that's changing */
  const gatherInput = (input:any) => {
    if(input.target.name === "username"){
        setUsername(input.target.value)
    } else {
        setPassword(input.target.value)
    }
  }

  const login = async () => {

    await dispatch(
      loginUser({username, password}) as any
      //these are the states that were changed with handleChange
      //we need "as any" to make it so that the return type can be any type
  )

  if(appState.user.id > 0){
    navigate("/home"); //thanks to Routing in the App.tsx, this will switch the component.
}

  }

  return (
    <div className="Login">

        <div className="text-container">

            <h1>Welcome to The Pokemon Exchange</h1>
            <h3>Sign in to browse for a Pokemon</h3>

            <div className="input-container">
                <input type="text" name="username" placeholder="username" onChange={gatherInput}/>
            </div>
            <div className="input-container">
                <input type="password" name="password" placeholder="password" onChange={gatherInput}/>
            </div>

            <button className="login-button" onClick={login}>Catch 'em all!</button>
        </div>

        <div className="disclaimer">
            <p>The Pokemon Exchange and its affiliates do not condone the misuse or mistreatement of Pokemon</p>
        </div>

    </div>
  )

}

export default Login