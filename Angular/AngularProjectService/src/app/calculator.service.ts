import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {
   
  getAddition(one:number,two:number):number{
    let sum =one+two
    return sum
  }
  getSubraction(one:number,two:number):number{
    let sub =one-two
    return sub
  }
}
