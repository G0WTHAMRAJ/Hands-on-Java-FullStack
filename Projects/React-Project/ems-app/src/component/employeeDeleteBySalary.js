import { Component } from "react";
import Empolyee from "../model/Employee";
import axios from "axios";

class DeleteBySalary extends Component{
    constructor() {
        super();
        this.state = {
            flag:false,
            esalary: "",
            employee:"",
            esalaryError:"",
        
        }
      }
      validateEsalary =(esalary)=>{
        let re= /^[0-9]+$/;  //regular expression
        if(esalary==='')
          return "Salary is required "
        else if(!re.test(esalary)){
          return "Ivalid Salary"
        }
        else{
          return null
        }
      }
      
    
      changeSalary = (e) =>{
        this.setState({esalary:e.target.value})
        let error=this.validateEsalary(this.state.esalary)
      this.setState({esalaryError:error})
      
      }
     
      getResult = (e) => {
        e.preventDefault();
        this.setState({flag:true})
      
        let error=this.validateEsalary(this.state.esalary)
        this.setState({esalaryError:error})
    
        if(!error){
          this.setState({flag:true}); //validating all error is null
          let employee = new Empolyee();
          employee.setId(this.state.eid)
          employee.setName(this.state.ename)
          employee.setSalary(this.state.esalary)

          axios.delete("http://localhost:1212/delete-employee-salary/"+this.state.esalary)
              .then(() => {
                  document.getElementBySalary("ResultDiv").innerHTML = "<b>employee deleted successfully</b>";
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
      <label for="first">Enter Employee salary:</label>
      <input type='text'name="esalary" value={this.state.esalary} onChange={this.changeSalary}></input><br></br><br></br>
      <br></br><div><font color='red'><b>{this.state.esalaryError}</b></font></div> 
      
      <button class="btn btn-danger" onClick={this.getResult}>Delete</button>
      </form>
                {this.state.flag ? // check the condition to execute
      <div>
      <br></br>successfully deleted:{this.state.esalary}

      </div>
                :''
                }
      </div>
        );
      }

}
export default  DeleteBySalary;
