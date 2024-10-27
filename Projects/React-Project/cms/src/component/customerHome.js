import { Component } from "react";
import { BrowserRouter,Route,Routes,Link } from "react-router-dom";
import Insert from "./customerInsert";
import Delete from "./customerDelete";
import Update from "./customerUpdate";
import Find from "./customerFind";
import FindAll from "./customerFindAll";
import "./style.css";



class Home extends Component{
    render(){
        return (
          <div class="home">
             <h1>Customers Bank Management System</h1>
            <BrowserRouter>
            <div class="link" >
              <ul><li class="btn btn-success"style={{ border: '2px solid black', margin: '10px' }}><Link id="test" to="/insert">Insert</Link></li>
              <li class="btn btn-primary"style={{ border: '2px solid black', margin: '10px' }}><Link id="test" to="/update">Update</Link></li>
              <li class="btn btn-danger"style={{ border: '2px solid black', margin: '10px' }}><Link id="test" to="/delete">Delete</Link></li>
      
              <li class="btn btn-info"style={{ border: '2px solid black', margin: '10px' }}><Link id="test" to="/find">Find</Link></li>
              <li class="btn btn-info"style={{ border: '2px solid black', margin: '10px' }}><Link id="test" to="/findAll">FindAll</Link></li>
              </ul>
              </div>
              <Routes>
                <Route path="insert" element={<Insert></Insert>} />
                <Route path="update" element={<Update></Update>} />
                <Route path="delete" element={<Delete></Delete>} />
                <Route path="find" element={<Find></Find>} />
                <Route path="findAll" element={<FindAll></FindAll>} />
                </Routes>
                </BrowserRouter>
                <div className="marquee-container">
                        <p className="marquee-text">WELCOME TO BIWW</p>
                    </div>
        
                </div>
              );
              
        
        }
       
}
export default Home;