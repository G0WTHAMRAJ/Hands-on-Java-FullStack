import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MyAngularProject';

  name : string;
  age :number;
  image : string;
  width :number;
  height:number;
  btn1:string;
  btn2:string;
  fname:string=""
  flag:boolean

  constructor(){
    this.name ="gowtham"
    this.age=22;
    this.image="./lion.jpg"
    this.width=250
    this.height=250
    this.btn1="change value"
    this.btn2="change Image"
    this.flag=true
  }
  getAddition(a:number,b:number):number{
    let sum =a+b;
    return sum;
  }
  changeValue(){
    this.name="raj"
  }
  changeImg(){
    if(this.image=="./lion.jpg"){
      this.image="./panda.jpg"
    }
    else{
      this.image="./lion.jpg";
    }

  }
  
}
