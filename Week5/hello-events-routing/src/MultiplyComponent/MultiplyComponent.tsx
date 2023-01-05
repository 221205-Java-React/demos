import React from 'react'
import InputComponent from '../InputComponent/InputComponent'

const MultiplyComponent: React.FC<any> = () => {



  return (
    <div className="input-container">
        <h3>Multiply Two Numbers:</h3>
        <InputComponent></InputComponent>
        <InputComponent></InputComponent>
    </div>
  )

}

export default MultiplyComponent