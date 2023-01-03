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

}