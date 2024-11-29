export default class Empolyee{
    empId;
    empName;
    empSalary;

    constructor(){
        this.empId=0
        this.empName="";
        this.empSalary=0
    }
    setId(id){
        this.empId=id
    }
    setName(name){
        this.empName=name
    }
    setSalary(salary){
        this.empSalary=salary
    }
}