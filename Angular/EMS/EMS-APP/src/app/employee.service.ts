import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';

@Injectable()
export class EmployeeService {
  url:string
  employee:Employee;
  employeeArr:Employee[]=[]

  constructor(private http:HttpClient) {
    this.url="http://localhost:3004/employees/";
    this.employee=new Employee()
   }

   insertEmployee(employee:Employee){
    this.http.post(this.url,employee).subscribe();
    return "Empolyee object saved"
   }

   updateEmployee(employee:Employee){
    this.http.put(this.url+employee.id,employee).subscribe();
    return "Employee Object Updated"
   }
   
   deleteEmployee(eid:number){
    this.http.delete(this.url+eid).subscribe();
    return "Employee Object deleted";
   }
   
   findEmployee(eid:number){
 
    this.http.get<Employee>(this.url+eid).subscribe(emp =>this.employee=emp);
    return this.employee;
   }
   findAllEmployee(){
    this.http.get<Employee[]>(this.url).subscribe(empArr =>this.employeeArr=empArr);
    return this.employeeArr;
   }
}
