import { Component } from "react";
// import Empolyee from "../model/Employee";
import axios from "axios";

class FindByName extends Component {
  constructor() {
    super();
    this.state = {
      flag: false,
      ename: "",
      enameError: "",
      employee1: [],


    }
  }
  validateEname = (ename) => {
    let re = /^[A-z,a-z]+$/;  //regular expression
    if (ename === '')
      return "Name is required "
    else if (!re.test(ename)) {
      return "Ivalid Name"
    }
    else {
      return null
    }
  }


  changeName = (e) => {
    this.setState({ ename: e.target.value })
    let error = this.validateEname(this.state.ename)
    this.setState({ enameError: error })

  }

  getResult = (e) => {
    e.preventDefault();
    

    let error = this.validateEname(this.state.ename)
    this.setState({ enameError: error })
    
    if (!error) {
      this.setState({ flag: true }); //validating all error is null
    


    // let employee = new Empolyee();
    // employee.setId(this.state.eid);
    // employee.setName(this.state.ename);
    // employee.setSalary(this.state.esalary);

    axios.get("http://localhost:1212/find-employee-name/"+ this.state.ename)
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
                    <label className="custom-label" for="first">Enter Employee Name:</label>
                    <input type='text' name="ename" value={this.state.ename} onChange={this.changeName}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.enameError}</b></font></div>

                    <div  className="custom-label">Find Employee </div><br></br>
                    <button class="btn btn-success" onClick={this.getResult}>Find</button>
                  
                </form>
        <div id="ResultDiv">
        {this.state.flag ? // check the condition to execute
                    <div className="find-employee">
                        console.log(employee1);
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
export default FindByName;
