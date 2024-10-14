import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from '../model/Employee';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css'
})
export class ReactiveFormComponent {
  EmployeeForm=new FormGroup({
    eid:new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
    ename:new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
    esalary:new FormControl('',[Validators.required,Validators.pattern('[0-9]+')])
    
  })

  employee:Employee;
  flag:boolean;

  constructor(){
    this.flag=false;
    this.employee=new Employee()
  }

  onClickSubmit(data:any){
    this.employee.eid=data.eid;
    this.employee.ename=data.ename;
    this.employee.esalary=data.esalary;
    this.flag=true
  }

  get eid(){
    return this.EmployeeForm.get('eid')
  }
  get ename(){
    return this.EmployeeForm.get('ename')
  }

  get esalary(){
    return this.EmployeeForm.get('esalay')
  }


}
