import { Component } from '@angular/core';

@Component({
  selector: 'app-factorail1',
  templateUrl: './factorail1.component.html',
  styleUrl: './factorail1.component.css'
})
export class Factorail1Component {
  number: number = 0;
  factorialTable: { number: number, factorial: number }[] = [];

  // Function to generate factorial table
  generateFactorialTable() {
    this.factorialTable = []; // Reset the table
    for (let i = 1; i <= this.number; i++) {
      this.factorialTable.push({
        number: i,
        factorial: this.calculateFactorial(i)
      });
    }
  }

  // Function to calculate factorial of a number
  calculateFactorial(num: number): number {
    if (num === 0 || num === 1) {
      return 1;
    } else {
      return num * this.calculateFactorial(num - 1);
    }
  }

}
