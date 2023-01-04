import React from "react";

/*
Notice props is of "any" type here - we're expecting a state object from the aprent component
and we are leaving the data type of the state object flexible ("any" data type - flexibility)
*/

//ParentComponent will send state of any type. ChildComponent accepts props of any type. 
//The state in the ParentComponent will always be the props in the ChildComponent
export class ChildComponent extends React.Component<any, any>{

    /*
        We can use constructors to initialize a class component and its state. Like Java constructor/fields
        Remember, "props" is the object coming in the left parameter, which stores data sent from a parent.
        this constructor below takes in the "props" object, and initializes this component's "state"
    */

    constructor(props:any){
        super(props) //a call to the parent constructor (a default no-args constructor)

        //initializing the ChildComponent's state, using the props it got from the parent
        this.state = {
            color:props.color,
            animal:props.animal
        }
    }

    //rending some elements in ChildComponent
    render(){
        return(
            <div>
                <h3>Hello from the Child Component</h3>
                <h3 style={{color: this.state.color}}>My parent's favorite color is: {this.state.color}</h3>
                <h4>My parent's favorite animal is: {this.props.animal}</h4>
            </div>
        )
        //we're accessing the color through state, and the animal through props
        //but they both came from props sent by the parent! 
        //We used a constructor to define the child's state from the props object
    }

}