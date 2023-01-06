import React, { useState } from 'react'
import InputComponent from '../InputComponent/InputComponent'
import ResultComponent from '../ResultComponent/ResultComponent';

import "./MultiplyComponent.css"

const MultiplyComponent: React.FC<any> = () => {

  //use the useState hook to let us set and manipulate state 
  const [firstValue, setFirst] = useState(0); 
  const [secondValue, setSecond] = useState(0);
  const [result, setResult] = useState(0); //result will be zero by default

  const storeValues = (input:any) => {

    //fill out either the first or second value (depending on which one was changed)
    //we'll take the name of the input, and give that value to that specific input
    if(input.target.name === "first"){
        setFirst(input.target.value)
    } else {
        setSecond(input.target.value)
    }

    console.log(input.target.value) //just to see the value the user sent in

  }

  //this function will multiple the two numbers stored in firstValue and secondValue
  const calculateResult = () => {

    //use the mutator or the result state variable to store the product of the two numbers
    setResult(firstValue * secondValue);

  }


  return (
    <div className="input-container">
        <h3>Multiply Two Numbers:</h3>
        <InputComponent name="first" onChange={storeValues}/>
        <InputComponent name="second" onChange={storeValues}/>
        <ResultComponent first={firstValue} second={secondValue} result={result}/>
        <button onClick={calculateResult}>Calculate!</button>
    </div>
  )

}

export default MultiplyComponent