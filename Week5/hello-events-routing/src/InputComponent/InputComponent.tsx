import React from 'react' //rafce to build out a react function component skeleton

const InputComponent: React.FC<any> = (props:any) => {

  
    /* what is <> </>??? these are fragment tags. better to use these if no attributes 
    They're like an imaginary parent tag */
  return (
    <>
        <p>Enter a value:</p>
        <input type="number"/>
    </>
  )

}

//this is the more modern way to export your function components, either way works for P2
export default InputComponent
//(in the older way, we don't have this export at the bottom, we simply put it before the const)