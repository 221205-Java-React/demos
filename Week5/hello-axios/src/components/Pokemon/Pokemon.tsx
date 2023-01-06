import React from 'react'

const Pokemon: React.FC<any> = (props:any) => {

  return (
    <div className="pokemon-container">
        <img className="pokemon-pic" src={props.sprite} alt={props.sprite} />
        <h3>{props.name}</h3>
    </div>
  )
}

export default Pokemon