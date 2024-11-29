import { Component } from "react";
// import Empolyee from "../model/Employee";
import axios from "axios";

class FindBySalary extends Component {
  constructor() {
    super();
    this.state = {
      flag: false,
      esalary: "",
      esalaryError: "",
      employee1: [],


    }
  }
  validateEsalary = (esalary) => {
    let re = /^[0-9]+$/;  //regular expression
    if (esalary=== '')
      return "Salary is required "
    else if (!re.test(esalary)) {
      return "Ivalid Salary"
    }
    else {
      return null
    }
  }


  changeSalary = (e) => {
    this.setState({ esalary: e.target.value })
    let error = this.validateEsalary(this.state.esalary)
    this.setState({ esalaryError: error })

  }

  getResult = (e) => {
    e.preventDefault();
    

    let error = this.validateEsalary(this.state.esalary)
    this.setState({ esalaryError: error })
    
    if (!error) {
      this.setState({ flag: true }); //validating all error is null
    


    // let employee = new Empolyee();
    // employee.setId(this.state.eid);
    // employee.setName(this.state.ename);
    // employee.setSalary(this.state.esalary);

    axios.get("http://localhost:1212/find-employee-salary/"+ this.state.esalary)
      .then((response) => {
        console.log(response.data);
        // document.getElementById("ResultDiv").innerHTML = "<b></b>";

        this.setState({ employee1: response.data })
      })
      .catch((error) => {
        console.error("There was an error saving the employee!", error);
      });
    }
  }
  render() {
    return (
      <div>
        <form  style={{height:'500px'}}>
                    <br></br>
                    <label   className="custom-label" for="first">Enter Employee Salary:</label>
                    <input type='text' name="esalary" value={this.state.esalary} onChange={this.changeSalary}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.esalaryError}</b></font></div>

                    <div  className="custom-label">Find Employee </div><br></br>
                    <button class="btn btn-success" onClick={this.getResult}>Find</button>
                  
                </form>
        <div id="ResultDiv">
        {this.state.flag ? // check the condition to execute
                    <div className="find-employee">
                        <br></br>Employee Id:{this.state.employee1.empId}
                        <br></br>Employee Name:{this.state.employee1.empName}
                        <br></br>Employee balance:{this.state.employee1.empSalary}
                    </div>
                    : ''

                }
        </div>
      </div>
    );
  }

}
export default FindBySalary;
