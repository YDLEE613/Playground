function Button(props) {
  const handleClick = () => props.onClickFunction(props.increment)
  
  return (
    <button onClick={handleClick}>
      +{props.increment}
    </button>
  );
}

// Display component
function Display(props){
  return(
    <div>
        {props.message}
    </div>
  );
}


// timer
const timer= ()=>{
  ReactDOM.render(
    React.createElement(
      'div', 
      null, 
      React.createElement('pre', null, (new Date).toLocaleTimeString()),
    ),
    document.getElementById('mountNode2'),
  );
}

// App
function App(){
  const[counter, setCounter] = useState(2);
  const incrementCounter = (incrementValue)=>setCounter(counter+incrementValue);
  return (
    <div>
      <Button onClickFunction={incrementCounter} increment={1}/>
      <Button onClickFunction={incrementCounter} increment={5}/>
      <Button onClickFunction={incrementCounter} increment={10}/>
      <Button onClickFunction={incrementCounter} increment={100}/>
      <Display message={counter}/>   
      <timer/>
   </div>
  );
}

ReactDOM.render(
  <App/>,
  document.getElementById('mountNode'),
);

setInterval(timer, 1000);
