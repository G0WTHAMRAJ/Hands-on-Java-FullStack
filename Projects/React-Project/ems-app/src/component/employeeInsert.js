import { Component } from "react";
import Empolyee from "../model/Employee";
import axios from "axios";

class Insert extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            eid: "",
            ename: "",
            esalary: "",
            did:"",
            employee: "",
            department:"",
            eidError: "",
            didError:"",
            enameError: "",
            esalaryError: ""
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

    validateEname = (ename) => {
        let re = /^[A-Z,a-z]+$/;
        if (ename === '')
            return "Name is required"
        else if (!re.test(ename)) {
            return "Invaild Name"
        }
        else {
            return null
        }
    }


    validateSalary = (esalary) => {
        let re = /^[0-9]+$/;
        if (esalary === '')
            return "salary is required"
        else if (!re.test(esalary)) {
            return "Invaild salary"
        }
        else {
            return null
        }
    }
    validateDid = (did) => {
        let re = /^[0-9]+$/;
        if (did === '')
            return "salary is required"
        else if (!re.test(did)) {
            return "Invaild salary"
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
    changeName = (e) => {
        this.setState({ ename: e.target.value })
        let error = this.validateEname(this.state.ename)
        this.setState({ enameError: error })
    }
    changeSalary = (e) => {
        this.setState({ esalary: e.target.value })
        let error = this.validateSalary(this.state.esalary)
        this.setState({ esalaryError: error })
    }
    changeDid = (e) => {
        this.setState({ did: e.target.value })
        let error = this.validated(this.state.did)
        this.setState({ didError: error })
    }
    getResult = (e) => {
        e.preventDefault();
        this.setState({ flag: true })

        let error = this.validateEid(this.state.eid)
        this.setState({ eidError: error })

        let error1 = this.validateEname(this.state.ename)
        this.setState({ enameError: error1 })

        let error2 = this.validateSalary(this.state.esalary)
        this.setState({ esalaryError: error2 })

        let error3= this.validateDid(this.state.did)
        this.setState({ didError: error2 })


        if (!error && !error1 && !error2&&error3) {
            this.setState({ flag: true }); //validating all error is null
            let employee = new Empolyee();
            employee.setId(this.state.eid)
            employee.setName(this.state.ename)
            employee.setSalary(this.state.esalary)
            employee.setDid(this.state.did)

            axios.post("http://localhost:1234/create-employee", employee)
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
                    <label for="first">Enter Employee Id:</label>
                    <input type='text' name="eid" value={this.state.eid} onChange={this.changeId}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.eidError}</b></font></div>

                    <label for="second">Enter Employee Name:</label>
                    <input type='text' value={this.state.ename} name="ename" onChange={this.changeName}></input><br></br>
                    <br></br><div><font color='red'><b>{this.state.enameError}</b></font></div>


                    <label for="third">Enter Employee Salary:</label>
                    <input type='text' value={this.state.esalary} name="esalary" onChange={this.changeSalary}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.esalaryError}</b></font></div>

                    <label for="fourth">Enter Employee department:</label>
                    <input type='text' value={this.state.esalary} name="esalary" onChange={this.changeSalary}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.esalaryError}</b></font></div>

                    <button class="btn btn-success" onClick={this.getResult}>Insert</button>
                </form>
                {this.state.flag ? // check the condition to execute
                    <div class="insert">
                        <br></br>Employee Added Successfully
                    </div>

                    : ''

                }
                <div id="ResultDiv"></div>

            </div>
        );
    }
}
export default Insert