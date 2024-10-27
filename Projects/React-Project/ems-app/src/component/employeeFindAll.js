import { Component } from "react";
import axios from "axios";

class FindAll extends Component {

  constructor() {
    super();
    this.state = {
      employees: [],
      error: ""
    }
  }
  getResult = (e) => {
    e.preventDefault();

    axios.get("http://localhost:3004/employees")
      .then((response) => {
        const employees = response.data;
        if (employees.length > 0) {
          this.setState({ employees, error: '' });
        } else {
          this.setState({ error: "No employees found." });
        }
        this.setState({ employee: employees });

      })
      .catch((error) => {
        console.error("There was an error fetching the employees!", error);
        this.setState({ error: "Error fetching the employees. Please try again." });
      });
  }


  render() {
    return (
      <div>
        <h1>Employee Management System</h1>
        <button class="btn btn-success" onClick={this.getResult}>Find All Employees</button>
        <div>
          {this.state.error && (
            <p style={{ color: "red" }}><b>{this.state.error}</b></p>
          )}
          {this.state.employees.length > 0 && (
            <table border="2px" style={{ marginTop: "20px", width: "100%" }}>
              <thead>
                <tr>
                  <th>Employee ID</th>
                  <th>Employee Name</th>
                  <th>Employee Salary</th>
                </tr>
              </thead>
              <tbody>
                {this.state.employees.map((employee) => (
                  <tr key={employee.id}>
                    <td>{employee.id}</td>
                    <td>{employee.name}</td>
                    <td>{employee.salary}</td>
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
export default FindAll;