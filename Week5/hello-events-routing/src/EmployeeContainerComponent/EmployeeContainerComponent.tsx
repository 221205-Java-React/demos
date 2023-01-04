import React, { useEffect, useState } from "react";

import { EmployeeComponent } from "../EmployeeComponent/EmployeeComponent";

export const EmployeeContainerComponent: React.FC<any> = (data) => {

    //useState lets us declare a state variable, a mutator (like a setter), and a default value
    //remember we need state to send data to other components as props
    let [employees, setEmployees] = useState([]) 
    //empty array default value since our post data is an array (D)Data.ts)

    //useEffect will execute some code when triggered
    //so our employees variable will be filled with the data from Data.ts
    useEffect(() => {
        //data is the name we gave Data.ts, so data.data accesses the Array called data in data.ts
        setEmployees(data.data) 
    }, []) //square brackets so that useEffect executes when the component renders

    return(
        //using .map to render an EmployeeComponent for every piece of data in employees
        <div>
            {employees.map((employee:any) => {
                return <EmployeeComponent {...employee} key={employee.userId}/>
            })}
        </div>
        /* Looks confusing, let me elaborate. we use .map on our employees state variable
           So, for every element in the employees Array (which hold data from the Data.ts array)...
           ...render one EmployeeComponent!
            in that EmployeeComponent, we send the appropriate employee and key.
        */
    )

}