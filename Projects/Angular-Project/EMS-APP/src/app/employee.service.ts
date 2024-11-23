import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';

@Injectable()
export class EmployeeService {
  url:string
  employee:Employee;
  employeeArr:Employee[]=[]

  constructor(private http:HttpClient) {
    this.url="http://localhost:1212/";
    this.employee=new Employee()
   }

   insertEmployee(employee:Employee){
    this.http.post(this.url+"create-employee",employee).subscribe();
    return "Empolyee object saved"
   }

   updateEmployee(employee:Employee){
    this.http.put(this.url+"update-employee",employee).subscribe();
    return "Employee Object Updated"
   }
   
   
   deleteEmployee(empId:number){
    this.http.delete(this.url+"delete-employee/"+empId).subscribe();
    return "Employee Object deleted";
   }
   
   findEmployee(empId:number){
 
    this.http.get<Employee>(this.url+"find-employee/"+empId).subscribe(emp =>this.employee=emp);

    return this.employee;
   }
   
   findAllEmployee(){
    this.http.get<Employee[]>(this.url+"findAll-employee").subscribe(empArr =>this.employeeArr=empArr);
    return this.employeeArr;
   } 
}
