import React from "react";

import "./EmployeeComponent.css"

export const EmployeeComponent: React.FC<any> = (employee:any) => {

    //this component will render an individual employee, with props data coming from the EmployeeContainerComponent
    return(
        <div className="employee-container">
            <div className="employee-name">
                <h3>{employee.name}</h3>
            </div>
            <div className="employee-data">
                <p>Quote: {employee.quote}</p>
                <p>Relationship: {employee.relationship}</p>
            </div>
        </div>
    )

}