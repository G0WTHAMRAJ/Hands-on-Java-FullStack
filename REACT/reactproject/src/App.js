import { render } from '@testing-library/react';
import './App.css';
import './Child3.css';
import {Component} from 'react'


class App extends Component{

constructor() {
  super();
  this.state = {
      flag:false,
      eid: "",
      ename: "",
      esalary: ""
      ,employee:""
  }
}
GetResult = (e) => {
  e.preventDefault();
  this.setState({flag:true})
}
render() {
  return (
<div>
<form>
<label for="first">Enter Employee Id:</label>
<input type='text' value={this.state.eid} onChange={(e) => this.setState({ eid: e.target.value })}></input><br></br><br></br>
<label for="second">Enter Employee Name:</label>
<input type='text' value={this.state.ename} onChange={(e) => this.setState({ ename: e.target.value })}></input><br></br><br></br>
<label for="third">Enter Employee Salary:</label>
<input type='text' value={this.state.esalary} onChange={(e) => this.setState({ esalary: e.target.value })}></input><br></br><br></br>
<button onClick={this.GetResult}>Submit</button>
</form>
          {this.state.flag ? // check the condition to execute
<div>
<br></br>Employee Id:{this.state.eid}
<br></br>Employee Name:{this.state.ename}
<br></br>Employee Salary:{this.state.esalary}
</div>
          :''
          }
</div>
  );
}
}
export default App;

/* -----------------------------Simple Calculator--------------------------------------------->

class  App extends Component() {
  constructor(){
    super();
    this.state = {
        n1: 0,
        n2: 0,
        option: "",
        result: 0
    }
}
GetResult = () => {
    let {n1,n2}=this.state
    if (this.state.option=== "add") {
        this.setState({result : parseInt(n1) + parseInt(n2)})
    }
    else if (this.state.option=== "sub") {
        this.setState({result : parseInt(n1) - parseInt(n2)});
    }
    else if (this.state.option === "mul") {
        this.setState({result : parseInt(n1) * parseInt(n2)})
    }
    else if (this.state.option=== "div") {
        this.setState({result : parseInt(n1) / parseInt(n2)})
    }
}
render() {
    return (
<div>
  <label for="first">Enter First Number:</label>
  <input type='text' value={this.state.n1} onChange={(e) => this.setState({ n1: e.target.value })}></input><br></br><br></br>
  <label for="second">Enter Second Number:</label>
  <input type='text' value={this.state.n2} onChange={(e) => this.setState({ n2: e.target.value })}></input><br></br><br></br>
  <label for="second">Select Option:</label>
  <select  onChange={(e) => this.setState({ option: e.target.value })}>
  <option>Select</option>
  <option>add</option>
  <option>sub</option>
  <option>multi</option>
  <option>div</option>
  </select><br></br><br></br>
  <button onClick={this.GetResult}>Calculate</button>
            {// <br></br>N1 {this.state.n1} N2 {this.state.n2} Op {this.state.option} }
<br></br>Result:{this.state.result}
</div>
    );
}
}
   


export default App;

*/

/*
class App extends Component{
  constructor(){
    super()
   this.state={ input1:0,
    input2:0,
    ans:0
  }
}
  
  
  render(){
    return (
    <div>
      <label for="input1">First Number </label>
      <input id="input1" type="number" value={this.state.input1} onChange={(e)=>this.setState({input1:e.target.value})} formControlName="input1"/>
      <br></br>
       <label for="input2">Second Number </label>
      <input id="input2" type="number" value={this.state.input2} onChange={(e)=>this.setState({input2:e.target.value})}formControlName="input2"/>
       <label for="operation">Operation</label>
      <select id="operation" formControlName="operation" >
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
      </select>
      <br></br>
      <button onClick={(this.setState({ans:parseInt(this.state.input1)}))}></button>
      
      </div>
      
    )

  }
}
export default App
*/


/*
class App extends Component{
  constructor(){
    super()
    this.state={
      number1:0,
      number2:0,
      sum:0
    }
  }
  render(){
    return(
    <b>
      <br></br>Enter number1 :
      <input type='number' value={this.state.number1} onChange={(e)=>this.setState({number1:e.target.value})}/>
      <br></br>Enter number2 :
      <input type='number' value={this.state.number2} onChange={(e)=>this.setState({number2:e.target.value})}/>
      <br></br><button onClick={()=>this.setState({sum:parseInt(this.state.number1)+parseInt(this.state.number2)})}>Find Sum</button>
      <br></br>Addition{this.state.sum}
    </b>
    )
  }
}
export default App


*/














/*-----------SetState-------------
class App extends Component{

  constructor(){
    super();
    this.state={
      name:''
    }
  }
  render()
  {
    return(
      <b>
        <br></br> enter the name : 
        <input type='text' value={this.state.name} onChange={(e) => this.setState({name:e.target.value})}/>
        <br></br> welcome {" "+this.state.name}
      </b>
    )
  }
}
export default App;





*/












/* -------------------------------------State-------------------------
function App(){
  return(
    <Child name="Gowtham"></Child>

  )
}
class Child extends Component(){
  constructor(props){
  super(props)
  this.state={
    email:'raj@gmailcom',
    location:'Chennai'
  }
  }
render(){
    return(
      <div>
      <b></b>name :{this.props.name}
      <b></b>email :{this.state.email}
      <br></br><Child1 location={this.state.location}></Child1>
      </div>
    )

  }
} 
class Child1 extends Component{
  render(){
    return(
      <b>
        <br></br>component Child1
        <br></br>Location:{this.props.location} 
      </b>
    )
  }
}

export default App
*/







/*-----------------------------------------DefaultProps
function App(){
  return(
    <div>
    <br></br>name="" email=""
    </div>
  )
}
App.defaultProps(){
  <div>name="gowtham" email="gowtham@gmail.com"</div>
} */

/*---------------------PROPES--------------------------------------------
function App(props){
  return(//pssing the arugument from index.js to main 
    <div>
      <b>User Id = {props.uid}</b>
    </div>
  )

}
/*class App extends Component{
  render(){
    return(
      <div>
        <b>App Component</b>
        <Child name="gowtham" email="raj@gmail.com"/>
        <Child6 name = "Nivvetan" email="nivvetan@gmail.com"/>

      </div>
    )
  }
 
}
class Child extends Component{ //passing the props using class component
  render(){
    return(
      <div>
        <br></br>Name : {this.props.name}
        <br></br>Email:{this.props.email}
      </div>
    )
  }
}

function Child6(props){

  return(
    <div>
      <br></br>Name : {props.name}
      <br></br>email : {props.email}
    </div>
  )
}*/

     /* calculator <div>
         <label for="input1">First Number </label>
      <input
        id="input1"
        type="number"
        formControlName="input1"
      />
      <br></br>
       <label for="input2">Second Number </label>
      <input
        id="input2"
        type="number"
        formControlName="input2"
      />
       <label for="operation">Operation</label>
      <select id="operation" formControlName="operation" >
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
      </select>
      <br></br>
      <button type='submit'>submit</button>
      
      </div>
      
    )

  }
}
export default App;
!---------------------------------------------!

/* function App() {
  return(
   <div class="test2">
    <h1>this is function component </h1>
    <Child4></Child4>
    <Child1></Child1>
    </div>
  );
}
function Child1(){
  return(
    <div class="test3">

    <b>Child1 function component</b>
    <Child2></Child2>
    </div>
  )
}
function Child2(){
  return(
    <div class="test4">
    <b>child2 functional component</b>
    <br></br>
    <Child3></Child3>
    
    </div>
  )
}
class Child4 extends Component{
  render(){
    return (<b>Child4 Class Component</b>)
    
  }

}
export default App;
*/



