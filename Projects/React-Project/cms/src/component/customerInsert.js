import { Component } from "react";
import Customer from "../model/customer";
import axios from "axios";
import "./style.css"

class Insert extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            cId: "",
            cName: "",
            cEmail: "",
            cPhoneNo: "",
            cAccNo: "",
            cBalance: "",
            // customer: "",
            cIdError: "",
            cNameError: "",
            cEmailError: "",
            cPhoneNoError: "",
            cAccNoError: "",
            cBalanceError: ""

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


    validateCname = (cName) => {
        let re = /^[A-Z,a-z]+$/;
        if (cName === '')
            return "Name is required"
        else if (!re.test(cName)) {
            return "Invaild Name"
        }
        else {
            return null
        }
    }

    validateCemail = (cEmail) => {
        let re = /^[A-Z,a-z,@]+$/;
        if (cEmail === '')
            return "Email is required"
        else if (!re.test(cEmail)) {
            return "Invaild Email"
        }
        else {
            return null
        }
    }
    validateCphoneno = (cPhoneNo) => {
        let re = /^[0-9]+$/;  //regular expression
        if (cPhoneNo === '')
            return "phone number is required "
        else if (!re.test(cPhoneNo)) {
            return "Ivalid phone number"
        }
        else {
            return null
        }
    }
    validateCaccountno = (cAccNo) => {
        let re = /^[0-9]+$/;  //regular expression
        if (cAccNo === '')
            return "Account No is required "
        else if (!re.test(cAccNo)) {
            return "Ivalid Account Number"
        }
        else {
            return null
        }
    }



    validateCbalance = (cBalance) => {
        let re = /^[0-9]+$/;
        if (cBalance === '')
            return "salary is required"
        else if (!re.test(cBalance)) {
            return "Invaild balance"
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
    changeName = (e) => {
        this.setState({ cName: e.target.value })
        let error = this.validateCname(this.state.cName)
        this.setState({ cNameError: error })
    }
    changeEmail = (e) => {
        this.setState({ cEmail: e.target.value })
        let error = this.validateCemail(this.state.cEmail)
        this.setState({ cEmailError: error })
    }
    changeAccNo = (e) => {
        this.setState({ cAccNo: e.target.value })
        let error = this.validateCaccountno(this.state.cAccNo)
        this.setState({ cAccNoError: error })

    }
    changePhNo = (e) => {
        this.setState({ cPhoneNo: e.target.value })
        let error = this.validateCid(this.state.cPhoneNo)
        this.setState({ cPhoneNoError: error })

    }
    changeBalance = (e) => {
        this.setState({ cBalance: e.target.value })
        let error = this.validateCbalance(this.state.cBalance)
        this.setState({ cBalanceError: error })
    }
    getResult = (e) => {
        e.preventDefault();
        this.setState({ flag: true })

        let error = this.validateCid(this.state.cId)
        this.setState({ cIdError: error })

        let error1 = this.validateCname(this.state.cName)
        this.setState({ cNameError: error1 })

        let error2 = this.validateCemail(this.state.cEmail)
        this.setState({ cEmailError: error2 })

        let error3 = this.validateCaccountno(this.state.cAccNo)
        this.setState({ cAccNo: error3 })

        let error4 = this.validateCphoneno(this.state.cPhoneNo)
        this.setState({ cPhoneNoError: error4 })

        let error5 = this.validateCbalance(this.state.cBalance)
        this.setState({ cBalanceError: error5 })

        if (!error && !error1 && !error2 && !error3 && !error4 && !error5) {
            this.setState({ flag: true }); //validating all error is null
            let customer = new Customer();
            customer.setId(this.state.cId)
            customer.setName(this.state.cName)
            customer.setEmail(this.state.cEmail)
            customer.setPhNumber(this.state.cPhoneNo)
            customer.setAccNumber(this.state.cAccNo)
            customer.setBalance(this.state.cBalance)


            axios.post("http://localhost:3004/customers/", customer)
                .then(() => {
                    document.getElementById("ResultDiv").innerHTML = "<b>Customer saved successfully</b>";
                })
                .catch((error) => {
                    console.error("There was an error saving the employee!", error);
                });
        }
    }
    render() {
        return (
            <div>
                <form style={{ display: 'flex', flexDirection: 'column', gap: '0px', width: '300px' }}>
                    <br></br>
                    <label className="custom-label" for="first">Enter Customer Id:</label>
                    <input type='text' name="cId" value={this.state.cId} onChange={this.changeId}></input>
                    <div><font color='red'><b>{this.state.cIdError}</b></font></div>

                    <label className="custom-label" for="second">Enter Customer Name:</label>
                    <input type='text' value={this.state.cName} name="cName" onChange={this.changeName}></input>
                    <div><font color='red'><b>{this.state.cNameError}</b></font></div>

                    <label className="custom-label" for="third">Enter Customer Email:</label>
                    <input type='text' value={this.state.cEmail} name="cEmail" onChange={this.changeEmail}></input>
                    <div><font color='red'><b>{this.state.cEmailError}</b></font></div>

                    <label className="custom-label" for="four">Enter Customer Phone Number:</label>
                    <input type='text' value={this.state.cPhoneNo} name="cPhoneNo" onChange={this.changePhNo}></input>
                    <div><font color='red'><b>{this.state.cPhoneNoError}</b></font></div>

                    <label className="custom-label" for="five">Enter Customer Account Number:</label>
                    <input type='text' value={this.state.cAccNo} name="cAccNo" onChange={this.changeAccNo}></input>
                    <div><font color='red'><b>{this.state.cAccNoError}</b></font></div>

                    

                    <label className="custom-label" for="six">Enter Customer Balance:</label>
                    <input type='text' value={this.state.cBalance} name="cBalance" onChange={this.changeBalance}></input><br></br>
                    <div><font color='red'><b>{this.state.cBalanceError}</b></font></div>

                    <button class="btn btn-success" onClick={this.getResult} >Insert</button>
                </form>
                {this.state.flag ? // check the condition to execute
                    <div class="insert">
                        <br></br>
                    </div>

                    : ''

                }
                <div id="ResultDiv"></div>

            </div>
        )
    }
}

export default Insert;
