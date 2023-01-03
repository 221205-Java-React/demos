import React from 'react';
import logo from './logo.svg';
import './App.css';
import { FirstComponent } from './components/FirstComponent/FirstComponent';


/*
The App.tsx is the root of our application. 
Most of our coding will be done elsewhere, but the App.tsx lets us control what gets rendered and when
We put the components we want to render in the dev of the return() in this file 
We can also render standard TSX directly inside the div in the return()
*/

/* Some TSX quirks:
  className instead of class
  comments in TSX are NOT <!-- -->, they are block comments, like the one we're in
*/
function App() {
  return (
    <div className="App">
      <h1>Hello React! Show me your moves!</h1>
      <p>we're writing in TSX, while is like HTML for React Typescript</p>
      <FirstComponent></FirstComponent>
    </div>
  );
}

export default App;
