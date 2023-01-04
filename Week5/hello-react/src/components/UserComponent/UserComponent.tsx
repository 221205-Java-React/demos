import React from "react";
import { User } from "../../interfaces/User";
import { PostComponent } from "../PostComponent/PostComponent";

//Because we only ever intend to use data found in the User Interface, we'll put User as the state type
export class UserComponent extends React.Component<any, User> {

    //constructor that initializes the User's variables to empty Strings (we'll change this later)
    constructor(props:any){
        super(props)
        
        this.state = {
            firstName: "",
            lastName: "",
            username: "",
            email: ""
        }
    }

    //The componentDidMount() lifecycle method is usually used for populating data after page load
    //in other words... once this component is rendered, the body of the method will execute
    componentDidMount(): void {
        
        //hardcoding - but imagine we're making some HTTP call to a server that populates this use data. login?
        //to set the fields of the state object, we use this.setState()
        this.setState(
            {
                firstName: "Benjamin",
                lastName: "P",
                username: "FlamePrincessLuvr111",
                email: "bennyp@revature.com"
            }
        )
    }
    //BIG PICTURE: when the component renders, the state will get populated with user data


    //as usual, we need a render method that renders the view of the this Class Component
    render(){
        return(
            <div>
                <h2>User: {this.state.firstName} {this.state.lastName}</h2>
                <h3>Email: {this.state.email}</h3>
                <PostComponent {...this.state}/>
            </div>
        )
        //to send the entire state object to a child component, we use {...this.state}
    }
        
}

