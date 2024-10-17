import { Component } from '@angular/core';
import { Customer } from '../model/customer';
import { CustomerService } from './customer.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'CMS-App';
  customer:Customer;
  result:string=""
  customerArr:Customer[]=[];
  flag :boolean

  constructor(private custService:CustomerService){
    this.customer=new Customer();
    this.flag=false
  }
  insertCustomer(data:any){
    this.customer.id=data.id
    this.customer.custName=data.custName
    this.customer.custMail=data.custMail
    this.customer.custBalance=data.custBalance


    this.result=this.custService.insertCustomer(this.customer)
  }
  updateCustomer(data:any){
    this.customer.id=data.id
    this.customer.custName=data.custName
    this.customer.custMail=data.custMail
    this.customer.custBalance=data.custBalance
    

    this.result=this.custService.updateCustomer(this.customer)
  }
  deleteCustomer(data:any){
    this.result=this.custService.deleteCustomer(data.id);
  }

  findCustomer(data:any){
    let customer:Customer=this.custService.findCustomer(data.id);
    this.result="Customer Id : "+customer.id+" Customer Name : "+customer.custName+
    " Customer Mail : "+customer.custMail+" Customer Balance : "+customer.custBalance
  }
  findAllCustomer(){
    this.customerArr=this.custService.findAllCustomer();
    this.flag=true
    
  }
}

