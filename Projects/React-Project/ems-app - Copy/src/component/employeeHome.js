import { Component } from "react";

import { BrowserRouter, Routes,Route, Link } from "react-router-dom";
import "./style.css"
import Insert from "./employeeInsert";
import Update from "./employeeUpdate";
import Delete from "./employeeDelete";
import Find from "./employeeFind";
import FindAll from "./employeeFindAll";
import FindByName from "./employeeFindByName";
import FindBySalary from "./employeeFindBySalary";
import DeleteBySalary from "./employeeDeleteBySalary";
import DeleteByName from "./employeeDeleteByName";



class Home extends Component {
    render(){
        return (
        <BrowserRouter>
      <div class="link">
        <ul><li class="btn btn-success"><Link id="test" to="/insert">Insert</Link></li>
        <li class="btn btn-primary"><Link id="test" to="/update">Update</Link></li>
        <li class="btn btn-danger"><Link id="test" to="/delete">Delete</Link></li>
        <li class="btn btn-danger"><Link id="test" to="/deleteByName">DeleteBy Name</Link></li>
        <li class="btn btn-danger"><Link id="test" to="/deleteBySalary">DeleteBy Salary</Link></li>

        <li class="btn btn-info"><Link id="test" to="/find">Find</Link></li>
        <li class="btn btn-info"><Link id="test" to="/findByName">FindBy Name</Link></li>
        <li class="btn btn-info"><Link id="test" to="/findBySalary">FindBy Salary</Link></li>
        <li class="btn btn-info"><Link id="test" to="/findAll">FindAll</Link></li>
        </ul>
        </div>
        <Routes>
          <Route path="insert" element={<Insert></Insert>} />
          <Route path="update" element={<Update></Update>} />
          <Route path="delete" element={<Delete></Delete>} />
          <Route path="deleteByName" element={<DeleteByName></DeleteByName>} />
          <Route path="deleteBySalary" element={<DeleteBySalary></DeleteBySalary>} />

          <Route path="find" element={<Find></Find>} />
          <Route path="findByName" element={<FindByName></FindByName>} />
       
          <Route path="findBySalary" element={<FindBySalary></FindBySalary>} />
          <Route path="findAll" element={<FindAll></FindAll>} />
          </Routes>
          </BrowserRouter>
        );
        
    }
}
export  default Home;