import React from 'react'

const ResultComponent: React.FC<any> = (props:any) => {

  //If there isn't a value inputted for BOTH inputs, give the user a prompt to enter those values
  //If there is no value for result, tell the user to click the button and trigger the calculation
  return (

    <>
        <p style={{color: "red"}}>
            {props.first && props.second ? '' : "Please enter both numbers"}
        </p>
        <div>
            {props.result ? <p> You calculated: {props.result}</p>
            : "Click calculate to find the product"}
        </div>
    </>
  
    )
}

export default ResultComponent