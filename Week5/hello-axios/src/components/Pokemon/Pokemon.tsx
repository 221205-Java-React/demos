import React from 'react'

import "./Pokemon.css"

const Pokemon: React.FC<any> = (pokemon:any) => {

  return (
    <div className="pokemon-container">
        <img className="pokemon-pic" src={pokemon.pokemon.pokeSprite} alt={pokemon.pokemon.pokeName} />
        <h3>{pokemon.pokemon.pokeName}</h3>
    </div>
  )
}

export default Pokemon