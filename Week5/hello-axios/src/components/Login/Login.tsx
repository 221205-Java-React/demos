import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';


import "./Login.css"

const Login: React.FC<any> = () => {

  //temporarily default variable to hold a logged in user
  const user = {
    id:0,
    username:"",
    password:""
  }

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

    //send an HTTP POST request with axios, and store the response in a variable that we can use
    const response = await axios.post("http://localhost:5000/auth", {username, password})

    if(response.status === 202) { //if the login was successful...

        console.log(response)

        //populate our user object from above with the incoming data from the server
        user.id = response.data.id;
        user.username = response.data.username
        user.password = response.data.password

        //if the user logged in successfully, their id won't be 0. 
        if(user.id > 0){
            navigate("/some component") //thanks to navigate, we can route to the home component automatically
        }

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

            <button className="login-button">Catch 'em all!</button>
        </div>

        <div className="disclaimer">
            <p>The Pokemon Exchange and its affiliates do not condone the misuse or mistreatement of Pokemon</p>
        </div>

    </div>
  )

}

export default Login