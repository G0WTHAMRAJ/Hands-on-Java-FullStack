import { Component } from "react";
import Customer from "../model/customer";
import axios from "axios";
import "./style.css"

class Find extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            cId: "",
            cIdError: "",
            customer1: []


        }
    }
    validateCid = (cId) => {
        let re = /^[0-9]+$/;  //regular expression
        if (cId === '')
            return "Id is required "
        else if (!re.test(cId)) {
            return "Ivalid ID"
        }
        else {
            return null
        }
    }


    changeId = (e) => {
        this.setState({ cId: e.target.value })
        let error = this.validateCid(this.state.cId)
        this.setState({ cIdError: error })

    }

    getResult = (e) => {
        e.preventDefault();
        this.setState({ flag: true })

        let error = this.validateCid(this.state.cId)
        this.setState({ cIdError: error })



        if (!error) {
            this.setState({ flag: true }); //validating all error is null
            let customer = new Customer();
            customer.setId(this.state.cId)
            customer.setName(this.state.cName)
            customer.setEmail(this.state.cEmail)
            customer.setPhNumber(this.state.cPhNo)
            customer.setBalance(this.state.cBalance)

            axios.get("http://localhost:3004/customers/" + this.state.cId)
                .then((response) => {
                    this.setState({ customer1: response.data })
                    document.getElementById("ResultDiv").innerHTML = "<b></b>";
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
                    <label   className="custom-label" for="first">Enter Customer Id:</label>
                    <input type='text' name="cId" value={this.state.cId} onChange={this.changeId}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.cIdError}</b></font></div>

                    <div  className="custom-label">Find Customer Balance</div><br></br>
                    <button class="btn btn-success" onClick={this.getResult}>Find</button>
                    {this.state.flag ? // check the condition to execute
                    <div className="find-employee">
                        <br></br>Customer Id:{this.state.customer1.id}
                        <br></br>customer Name:{this.state.customer1.name}
                        <br></br>customer balance:{this.state.customer1.balance}
                    </div>
                    : ''

                }
                </form>
              
                <div id="ResultDiv"></div>

            </div>
        )
    }

}

export default Find;
