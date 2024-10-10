import { Injectable } from '@angular/core';

@Injectable()
export class FactorialService {
  
  getFactorialValues(n:number):number[]{
    let result:number[]=[];
    for(let k =1;k<=n;k++){
      let fact:number=1;
      for(let i =1;i<=k;i++){
        fact=fact*i
      }
      result[k-1]=fact
    }
    return result
  }
}
