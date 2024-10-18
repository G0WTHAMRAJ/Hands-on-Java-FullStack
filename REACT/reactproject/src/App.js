
import './App.css';
import './Child3.css';
import {Component} from 'react'
import React,{useRef} from 'react';

export default function App(){

  const myRef=useRef();
  const handleClick=()=>{
    myRef.current.focus()
  }
  return(
    <div>
      <input ref={myRef} type='text'/>
      <button onClick={handleClick}>Focus Input</button>
    </div>
  )

}

/*----------------------------------useEffect
export default function App (){
  const[count,setValue]=useState(0)
  
  

  useEffect(()=>{
    document.getElementById('ResultDiv').innerHTML=`you clicked ${count} times`;
  })
    return(
      <>
      <div className="ResultDiv">
        <br></br>
        <button onClick={()=>setValue(count+1)}></button>
        <br></br>
        Count{this.state.count}
      </div>
      </>
    )
  
}


/* component Did mount---------------------------------
export default class App extends Component(){
  constructor(){
    super();
    this.state={
      count:0
    }
  }

  componentDidMount(){
    document.getElementById('ResultDiv').innerHTML="Component did mount Phase : Count is  "+this.state.count;
  }
  render(){
    return(
      <>
      <div className="App">
        <br></br>
        <button onClick={()=>this.setState({count:this.state.count+1})}>Click ME</button>
        <br></br>
        Count{this.state.count}
      </div>
      </>
    )
  }

}

/*----------------------uState---------------------------------------
export default function App(){
  const[name,setName]=useState(""); //setting value for the name use setstate  
  
  

  return (
    <div className='App'>
      <input type='text'  value={name} onChange={(e)=>setName(e.target.value)}/>
      <h2>welcome {name}</h2>
    </div>

  )
}



/*-------------------------------use State-----------------
export default function App(){
 const  [count, setCount] = useState(0); // use state method to declare the value for count 
 const increment  = () => {setCount(count+1)}
const decrement  = () => {setCount(count-1)}



  return (
    <div className='App'>
      <button onClick={()=>increment()}>Increment</button>
      <button onClick={()=>decrement()}>Decrement</button>
      <h2>{count}</h2>
    </div>

  )
}


















/*------------------------------------find even or Odd
class App extends Component {
  constructor() {
    super();
    
    this.state = {
      userNumber: '', 
      result: ''      
    };
  }


  inputChange = (event) => {
    this.setState({ userNumber: event.target.value });
  };


  checkEvenOrOdd = () => {
    const { userNumber } = this.state;
    const number = parseInt(userNumber, 10); 

    if ((number)) {
     
      const result = number % 2 === 0 ? `${number} is Even` : `${number} is Odd`; //ternary operator
      this.setState({ result });
    } else {
      this.setState({ result: 'Please enter a valid number' });
    }
  };

  render() {
    const { userNumber, result } = this.state;

    return (
      <div>
        <input type="number" value={this.state.userNumber} onChange={this.inputChange}/>

      
        <button onClick={this.checkEvenOrOdd}>Check</button>

        <p>{result}</p>
      </div>
    );
  }
}

export default App;



/*------------------------------------AND Conditional Operator---------------------------
export default function App(props)
{ 
  let n  = props.input;
  return(
    <>
  {n%2===0 && <Even input={n}/>}
  {n%2!==0 && <Odd input={n}/>}
    </>
)

}

function Odd(props){
  return(
    <b>{props.input} is Odd</b>
  )
}

function Even(props){
  return(
    <b>{props.input} is Even</b>
  )
}

/*-----------------------------------if Statement------------------------------
export default function App(props)
{ 
  let n  = props.input;
  if(n%2==0)
      return <Even input={n}></Even>
  else
    return<Odd input={n}></Odd>

}

function Odd(props){
  return(
    <b>{props.input} is Odd</b>
  )
}

function Even(props){
  return(
    <b>{props.input} is Even</b>
  )
}

/*------------------------------------------------user and Password------------------------
class App extends Component{
  constructor(){
    super();
    this.state={
      falg:false,
      uid:"",
      upass:"",
      uidError:"",
      upassError:""
    }
  }
  validateUid =(uid)=>{
    let re= /^[0-9]+$/;  //regular expression
    if(uid==='')
      return "Id is required "
    else if(!re.test(uid)){
      return "Ivalid ID"
    }
    else{
      return null
    }
  }
  
  validateUpass=(upass)=>{
    let re=/^[A-Z,a-z]+$/;
    if(upass==='')
      return "Password is required"
    else if(!re.test(upass)){
      return "Invaild password"
    }
    else{
      return null
    }
  }
  changeId = (e) =>{
    this.setState({uid:e.target.value})
    let error=this.validateUid(this.state.uid)
  this.setState({uidError:error})
  
  }
  changePass =(e)=>{
    this.setState({upass:e.target.value})
    let error=this.validateUpass(this.state.upass)
    this.setState({upassError:error})
  }
  getResult = (e) => {
    e.preventDefault();
    this.setState({flag:true})
  
    let error=this.validateUid(this.state.uid)
    this.setState({eidError:error})
  
    let error1=this.validateUpass(this.state.upass)
    this.setState({enameError:error1})
  
  
    if(!error&&!error1){
      this.setState({flag:true}); //validating all error is null
    }
  }
  
  render(){
    return(
      <div>
<form>
<label for="first">Enter User Id:</label>
<input type='text' value={this.state.uid} onChange={this.changeId}></input><br></br><br></br>
<br></br><div><font color='red'><b>{this.state.uidError}</b></font></div> 

<label for="second">Enter User Password:</label>
<input type='text' value={this.state.upass} onChange={this.changePass}></input><br></br>
<br></br><div><font color='red'><b>{this.state.upassError}</b></font></div>


<button onClick={this.getResult}>Submit</button>
</form>
          {this.state.flag? // check the condition to execute
<div>
<br></br>SuccessFull.!!
</div>
          :''
          }
</div>
  );
}
}
export default App;
      

/*
class App extends Component{

constructor() {
  super();
  this.state = {
      flag:false,
      eid: "",
      ename: "",
      esalary: "",
      employee:"",
      eidError:"",
      enameError:"",
      esalaryError:""
  }
}
validateEid =(eid)=>{
  let re= /^[0-9]+$/;  //regular expression
  if(eid==='')
    return "Id is required "
  else if(!re.test(eid)){
    return "Ivalid ID"
  }
  else{
    return null
  }
}

validateEname =(ename)=>{
  let re=/^[A-Z,a-z]+$/;
  if(ename==='')
    return "Name is required"
  else if(!re.test(ename)){
    return "Invaild Name"
  }
  else{
    return null
  }
}


validateSalary =(esalary)=>{
  let re=/^[0-9]+$/;
  if(esalary==='')
    return "salary is required"
  else if(!re.test(esalary)){
    return "Invaild salary"
  }
  else{
    return null
  }
}
changeId = (e) =>{
  this.setState({eid:e.target.value})
  let error=this.validateEid(this.state.eid)
this.setState({eidError:error})

}
changeName =(e)=>{
  this.setState({ename:e.target.value})
  let error=this.validateEname(this.state.ename)
  this.setState({enameError:error})
}
changeSalary=(e)=>{
  this.setState({esalary:e.target.value})
  let error=this.validateSalary(this.state.esalaryError)
  this.setState({esalaryError:error})
}
getResult = (e) => {
  e.preventDefault();
  this.setState({flag:true})

  let error=this.validateEid(this.state.eid)
  this.setState({eidError:error})

  let error1=this.validateEname(this.state.ename)
  this.setState({enameError:error1})

  let error2=this.validateSalary(this.state.esalary)
  this.setState({esalaryError:error2})

  if(!error&&!error1&&error2){
    this.setState({flag:true}); //validating all error is null
  }
}
render() {
  return (
<div>
<form>
<label for="first">Enter Employee Id:</label>
<input type='text' value={this.state.eid} onChange={this.changeId}></input><br></br><br></br>
<br></br><div><font color='red'><b>{this.state.eidError}</b></font></div> 

<label for="second">Enter Employee Name:</label>
<input type='text' value={this.state.ename} onChange={this.changeName}></input><br></br>
<br></br><div><font color='red'><b>{this.state.enameError}</b></font></div>


<label for="third">Enter Employee Salary:</label>
<input type='text' value={this.state.esalary} onChange={this.changeSalary}></input><br></br><br></br>
<br></br><div><font color='red'><b>{this.state.esalaryError}</b></font></div>

<button onClick={this.getResult}>Submit</button>
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



