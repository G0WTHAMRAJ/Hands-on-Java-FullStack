import { Component } from "react";
import Empolyee from "../model/Employee";
import axios from "axios";

class Delete extends Component{
    constructor() {
        super();
        this.state = {
            flag:false,
            eid: "",
            employee:"",
            eidError:"",
        
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
      
    
      changeId = (e) =>{
        this.setState({eid:e.target.value})
        let error=this.validateEid(this.state.eid)
      this.setState({eidError:error})
      
      }
     
      getResult = (e) => {
        e.preventDefault();
        this.setState({flag:true})
      
        let error=this.validateEid(this.state.eid)
        this.setState({eidError:error})
    
        if(!error){
          this.setState({flag:true}); //validating all error is null
          let employee = new Empolyee();
          employee.setId(this.state.eid)
          employee.setName(this.state.ename)
          employee.setSalary(this.state.esalary)

          axios.delete("http://localhost:3004/employees/"+this.state.eid)
              .then(() => {
                  document.getElementById("ResultDiv").innerHTML = "<b>employee deleted successfully</b>";
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
      <label for="first">Enter Employee Id:</label>
      <input type='text'name="eid" value={this.state.eid} onChange={this.changeId}></input><br></br><br></br>
      <br></br><div><font color='red'><b>{this.state.eidError}</b></font></div> 
      
      <button class="btn btn-danger" onClick={this.getResult}>Delete</button>
      </form>
                {this.state.flag ? // check the condition to execute
      <div>
      <br></br>successfully deleted:{this.state.eid}

      </div>
                :''
                }
      </div>
        );
      }

}
export default  Delete;
