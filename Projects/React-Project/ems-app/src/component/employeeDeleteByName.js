import { Component } from "react";
import Empolyee from "../model/Employee";
import axios from "axios";

class DeleteByName extends Component{
    constructor() {
        super();
        this.state = {
            flag:false,
            ename: "",
            employee:"",
            enameError:"",
        
        }
      }
      validateEname =(ename)=>{
        let re= /^[a-z,A-Z]+$/;  //regular expression
        if(ename==='')
          return "name is required "
        else if(!re.test(ename)){
          return "Ivalid name"
        }
        else{
          return null
        }
      }
      
    
      changeName = (e) =>{
        this.setState({ename:e.target.value})
        let error=this.validateEname(this.state.ename)
      this.setState({enameError:error})
      
      }
     
      getResult = (e) => {
        e.preventDefault();
        this.setState({flag:true})
      
        let error=this.validateEname(this.state.ename)
        this.setState({enameError:error})
    
        if(!error){
          this.setState({flag:true}); //validating all error is null
          let employee = new Empolyee();
          employee.setId(this.state.eid)
          employee.setName(this.state.ename)
          employee.setSalary(this.state.esalary)

          axios.delete("http://localhost:1212/delete-employee-name/"+this.state.ename)
              .then(() => {
                  document.getElementsByName("ResultDiv").innerHTML = "<b>employee deleted successfully</b>";
              })
              .catch((error) => {
                  console.error("There was an error saving the employee!", error);
              });
        }
      }
      render() {
        return (
      <div>
      <form>
      <label for="first">Enter Employee Name:</label>
      <input type='text'name="ename" value={this.state.ename} onChange={this.changeName}></input><br></br><br></br>
      <br></br><div><font color='red'><b>{this.state.enameError}</b></font></div> 
      
      <button class="btn btn-danger" onClick={this.getResult}>Delete</button>
      </form>
                {this.state.flag ? // check the condition to execute
      <div>
      <br></br>successfully deleted:{this.state.ename}

      </div>
                :''
                }
      </div>
        );
      }

}
export default  DeleteByName;
