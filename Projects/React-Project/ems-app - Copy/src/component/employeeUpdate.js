import { Component } from "react";
import axios from "axios";
import Empolyee from "../model/Employee";  // Corrected typo in Employee

class Update extends Component {
  constructor() {
    super();
    this.state = {
      flag: false,
      eid: "",
      ename: "",
      esalary: "",
      employee: "",
      eidError: "",
      enameError: "",
      esalaryError: ""
    };
  }

  validateEid = (eid) => {
    let re = /^[0-9]+$/;  // Regular expression for numbers
    if (eid === '')
      return "Id is required";
    else if (!re.test(eid)) {
      return "Invalid ID";
    }
    else {
      return null;
    }
  }

  validateEname = (ename) => {
    let re = /^[A-Za-z]+$/;  // Regular expression for names
    if (ename === '')
      return "Name is required";
    else if (!re.test(ename)) {
      return "Invalid Name";
    }
    else {
      return null;
    }
  }

  validateSalary = (esalary) => {
    let re = /^[0-9]+$/;  // Regular expression for salary (numbers)
    if (esalary === '')
      return "Salary is required";
    else if (!re.test(esalary)) {
      return "Invalid Salary";
    }
    else {
      return null;
    }
  }

  changeId = (e) => {
    this.setState({ eid:e.target.value });
    let error = this.validateEid(this.state.eid);
    this.setState({ eidError: error });
  }

  changeName = (e) => {
    this.setState({ ename:e.target.value });
    let error = this.validateEname(this.state.ename);
    this.setState({ enameError: error });
  }

  changeSalary = (e) => {
    this.setState({ esalary:e.target.value });
    let error = this.validateSalary(this.state.esalary);
    this.setState({ esalaryError: error });
  }

  getResult = (e) => {
    e.preventDefault();

    let error = this.validateEid(this.state.eid);
    let error1 = this.validateEname(this.state.ename);
    let error2 = this.validateSalary(this.state.esalary);

    this.setState({
      eidError: error,
      enameError: error1,
      esalaryError: error2
    });

    if (!error && !error1 && !error2) {
      this.setState({ flag: true });  // All validation passed
      
      let employee = new Empolyee();
      employee.setId(this.state.eid);
      employee.setName(this.state.ename);
      employee.setSalary(this.state.esalary);
      console.log(employee);

      axios.put("http://localhost:1212/update-employee", employee)
        .then(() => {
          document.getElementById("ResultDiv").innerHTML = "<b>Object saved</b>";
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
          <label htmlFor="first">Enter Employee Id:</label>
          <input type='text' name="eid" value={this.state.eid} onChange={this.changeId}></input><br></br><br></br>
          <div><font color='red'><b>{this.state.eidError}</b></font></div>

          <label htmlFor="second">Enter Employee Name:</label>
          <input type='text' name="ename" value={this.state.ename} onChange={this.changeName}></input><br></br><br></br>
          <div><font color='red'><b>{this.state.enameError}</b></font></div>

          <label htmlFor="third">Enter Employee Salary:</label>
          <input type='text' name="esalary" value={this.state.esalary} onChange={this.changeSalary}></input><br></br><br></br>
          <div><font color='red'><b>{this.state.esalaryError}</b></font></div>

          <button class="btn btn-success" onClick={this.getResult}>Update</button>
        </form>

        {this.state.flag ?
          <div>
            <br></br>Employee Id: {this.state.eid}
            <br></br>Employee Name: {this.state.ename}
            <br></br>Employee Salary: {this.state.esalary}
            <br></br>updated Successfully
          </div>
          : ''
        }
      </div>
    );
  }
}

export default Update;
