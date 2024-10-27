import { Component } from "react";
import Empolyee from "../model/Employee";
import axios from "axios";

class Find extends Component {
  constructor() {
    super();
    this.state = {
      flag: false,
      eid: "",
      eidError: "",
      employee1: [],


    }
  }
  validateEid = (eid) => {
    let re = /^[0-9]+$/;  //regular expression
    if (eid === '')
      return "Id is required "
    else if (!re.test(eid)) {
      return "Ivalid ID"
    }
    else {
      return null
    }
  }


  changeId = (e) => {
    this.setState({ eid: e.target.value })
    let error = this.validateEid(this.state.eid)
    this.setState({ eidError: error })

  }

  getResult = (e) => {
    e.preventDefault();
    this.setState({ flag: true })

    let error = this.validateEid(this.state.eid)
    this.setState({ eidError: error })
    
    if (!error) {
      this.setState({ flag: true }); //validating all error is null
    }


    let employee = new Empolyee();
    employee.setId(this.state.eid);
    employee.setName(this.state.ename);
    employee.setSalary(this.state.esalary);

    axios.get("http://localhost:3004/employees/" + this.state.eid)
      .then((response) => {
        this.setState({ employee1: response.data })
        document.getElementById("ResultDiv").innerHTML = "<b>Object saved</b>";
      })
      .catch((error) => {
        console.error("There was an error saving the employee!", error);
      });
  }
  render() {
    return (
      <div>
        <form>
          <label for="first" >Enter Employee Id:</label>
          <input type='text' name="eid" value={this.state.eid} onChange={this.changeId}></input><br></br><br></br>
          <br></br><div><font color='red'><b>{this.state.eidError}</b></font></div>

          <button class="btn btn-success" onClick={this.getResult}>Find</button>
        </form>
        {this.state.flag ? // check the condition to execute
          <div>
            <br></br>Employee Id:{this.state.employee1.id}
            <br></br>Employee Name:{this.state.employee1.name}
            <br></br>Employee Salary:{this.state.employee1.salary}
          </div>
          : ''
        }
      </div>
    );
  }

}
export default Find;
