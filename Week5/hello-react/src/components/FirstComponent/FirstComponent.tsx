//the first step in any React component is to import React from "react". (you can autocomplete)
import React from "react";

//Below, we're creating a CLASS BASED COMPONENT. The component takes two parameters:
//The parameters are props and state, which we'll mess with later
export class FirstComponent extends React.Component<{}, {}>{

    //creating a String variable, which we'll databind below.
    words:String = "I am stored in a variable in the FirstComponent"

    //Every Class Component must contain the render() funtion
    //This is what the component will actually display (AKA render) onto the webpage
    render(){
        //the render() function must contain a return statement, where the TSX is written
        return(
            <div>
                <h3>Hello from our First Component! This is a Class-Based Component</h3>
                <p>Data bound words: {this.words}</p>
            </div>
        )
    }

}