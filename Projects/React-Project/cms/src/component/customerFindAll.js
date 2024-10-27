import { Component } from "react";
import axios from "axios";
import "./style.css"

class FindAll extends Component{
    constructor() {
        super();
        this.state = {
           customers:[],
           error:""

        }
    }
    getResult = (e) => {
        e.preventDefault();

        axios.get("http://localhost:3004/customers")
        .then((response) => {
          const customers= response.data;
          if (customers.length > 0) {
            this.setState({ customers, error: '' });
          } else {
            this.setState({ error: "No customers found." });
          }
          this.setState({ customer: customers });
  
        })
        .catch((error) => {
          console.error("There was an error fetching the customers!", error);
          this.setState({ error: "Error fetching the customers. Please try again." });
        });
        }
    render() {
        return (
            <div  style={{height:'500px'}}><br></br>
            <button class="btn btn-success" onClick={this.getResult}>Find All Customers</button>
            <div>
              {this.state.error && (
                <p style={{ color: "red" }}><b>{this.state.error}</b></p>
              )}
              {this.state.customers.length > 0 && (
                <table className="custom-table" border="2px" style={{ marginTop: "20px", width: "100%" }}>
                  <thead>
                    <tr>
                      <th>Customer ID</th>
                      <th>Customer Name</th>
                      <th>Customer Account No</th>
                    </tr>
                  </thead>
                  <tbody>
                    {this.state.customers.map((customer) => (
                      <tr key={customer.id}>
                        <td>{customer.id}</td>
                        <td>{customer.name}</td>
                        <td>{customer.accNumber}</td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              )}
            </div>
          </div>
        )
    }
}
export default FindAll