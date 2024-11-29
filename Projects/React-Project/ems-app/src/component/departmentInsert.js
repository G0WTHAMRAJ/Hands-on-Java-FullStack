import { Component } from "react";
import axios from "axios";
import Department from "../model/Department";

class DepInsert extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            did: "",
            dname: "",
            department: "",
            didError: "",
            dnameError: ""

        }
    }
    validateDid = (did) => {
        let re = /^[0-9]+$/;  //regular expression
        if (did === '')
            return "Dep Id is required "
        else if (!re.test(did)) {
            return "Ivalid ID"
        }
        else {
            return null
        }
    }
    validateDname = (dname) => {
        let re = /^[a-z,A-z]+$/;  //regular expression
        if (dname === '')
            return "Dep Id is required "
        else if (!re.test(dname)) {
            return "Ivalid ID"
        }
        else {
            return null
        }
    }
    changeDid = (e) => {
        this.setState({ did: e.target.value })
        let error = this.validateDid(this.state.did)
        this.setState({ didError: error })

    }
    changeDname = (e) => {
        this.setState({ dname: e.target.value })
        let error = this.validateDname(this.state.dname)
        this.setState({ dnameError: error })
    }
    getResult = (e) => {
        e.preventDefault();
        this.setState({ flag: true })

        let error = this.validateDid(this.state.did)
      
        this.setState({ didError: error })

        let error1 = this.validateDname(this.state.dname)
        this.setState({ dnameError: error1 })

        if (!error && !error1) {
            this.setState({ flag: true }); //validating all error is null
            let department = new Department();
            department.setDepId(this.state.did)
            department.setDepName(this.state.dname)
            
            console.log(department);


            axios.post("http://localhost:1212/insert-department", department)
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
                    <label htmlFor="first">Enter Department Id:</label>
                    <input type='text' name="did" value={this.state.did} onChange={this.changeDid}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.didError}</b></font></div>

                    <label for="second">Enter Department Name:</label>
                    <input type='text' name="dname" value={this.state.dname} onChange={this.changeDname}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.dnameError}</b></font></div>






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
export default DepInsert;
