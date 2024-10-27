import { Component } from "react";
import Customer from "../model/customer";
import axios from "axios";
import "./style.css"

class Delete extends Component{
    constructor() {
        super();
        this.state = {
            flag: false,
            cId: "",
            cIdError: "",
           
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
          


            axios.delete("http://localhost:3004/customers/"+this.state.cId)
            .then(() => {
                document.getElementById("ResultDiv").innerHTML = "<b>Customer Deleted Successfully</b>";
            })
            .catch((error) => {
                console.error("There was an error deleting the Customer!", error);
            });
        }
    }
    render() {
        return (
            <div>
                <form style={{height:'450px'}}>
                    <br></br>
                    <label  className="custom-label" for="first">Enter Customer Id:</label>
                    <input type='text' name="cId" value={this.state.cId} onChange={this.changeId}></input><br></br><br></br>
                    <br></br><div><font color='red'><b>{this.state.cIdError}</b></font></div>

                   

                    <button class="btn btn-danger" onClick={this.getResult}>Delete</button>
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
export default  Delete;
