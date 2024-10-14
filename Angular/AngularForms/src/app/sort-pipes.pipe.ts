import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sortPipes'
})
export class SortPipesPipe implements PipeTransform {
  transform(value: any[],args:string):any[]{
    let res:any[]=[]
    if(args==='ascending'){
       value.sort();
    }
    if(args==='decending'){
       value.sort().reverse();
    }
    if(args==='reverse'){
       value.reverse();
    }
    return res;
  }
  

  
  }


