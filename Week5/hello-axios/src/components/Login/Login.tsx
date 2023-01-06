import React from 'react'

import "./Login.css"

const Login: React.FC<any> = () => {

  

  return (
    <div className="Login">

        <div className="text-container">

            <h1>Welcome to The Pokemon Exchange</h1>
            <h3>Sign in to browse for a Pokemon</h3>

            <div className="input-container">
                <input type="text" name="username" placeholder="username"/>
            </div>
            <div className="input-container">
                <input type="password" name="password" placeholder="password"/>
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