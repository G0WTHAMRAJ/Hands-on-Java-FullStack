import { Injectable } from '@angular/core';
import { Customer } from '../model/customer';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  url:string
  customer:Customer;
  customerArr:Customer[]=[]

  constructor(private http:HttpClient) {
    this.url="http://localhost:3005/customers/";
    this.customer=new Customer()
   }

   insertCustomer(customer:Customer){
    this.http.post(this.url,customer).subscribe();
    return "Customer saved"
   }

   updateCustomer(customer:Customer){
    this.http.put(this.url+customer.id,customer).subscribe();
    return "Customer Updated"
   }
   
   deleteCustomer(eid:number){
    this.http.delete(this.url+eid).subscribe();
    return "Customer deleted";
   }
   
   findCustomer(eid:number){
 
    this.http.get<Customer>(this.url+eid).subscribe(cust =>this.customer=cust);
    return this.customer;
   }
   findAllCustomer(){
    this.http.get<Customer[]>(this.url).subscribe(custArr =>this.customerArr=custArr);
    return this.customerArr;
   }
   
}
