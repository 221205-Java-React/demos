import React from 'react';
import logo from './logo.svg';
import './App.css';
import { EmployeeContainerComponent } from './EmployeeContainerComponent/EmployeeContainerComponent';
import { data } from './data';
import { BrowserRouter } from 'react-router-dom';
import { Route, Routes } from 'react-router';
import MultiplyComponent from './MultiplyComponent/MultiplyComponent';

function App() {
  return (
    <div className="App">

        <BrowserRouter>
          <Routes>
            <Route path="/emp" element={<EmployeeContainerComponent data={data}/>}/>
            <Route path="/mult" element={<MultiplyComponent/>}/>
          </Routes>
        </BrowserRouter>
        
    </div>
  );
}

export default App;
