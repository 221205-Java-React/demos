import React from 'react';
import logo from './logo.svg';
import './App.css';
import { EmployeeContainerComponent } from './EmployeeContainerComponent/EmployeeContainerComponent';
import { data } from './data';

function App() {
  return (
    <div className="App">
        <EmployeeContainerComponent data={data}></EmployeeContainerComponent>
    </div>
  );
}

export default App;
