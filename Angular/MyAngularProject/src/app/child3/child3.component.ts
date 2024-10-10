import { Component } from '@angular/core';

@Component({
  selector: 'app-child3',
  templateUrl: './child3.component.html',
  styleUrl: './child3.component.css'
})
export class Child3Component {
  flag:boolean;
  arr:string[]
  selectedItems:string=''
  myStyle:{}
  myClass:string
  

  constructor(){
    this.flag=true
    this.arr=["panda","lion","cat"]
    this.myStyle={"color":"green"}
    this.myClass="MyClass1"
  }

  changeFlag(){
    this.flag=!this.flag;
  }
  setSelectedItem(item:string){
    this.selectedItems=item
  }
  changeStyle(){
    this.myStyle={"color":"red","font-weight":"bold"}
  }

  changeClass(){
    this.myClass="MyClass2"
  }
 


}
