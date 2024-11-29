import Department from "./Department";

export default class Empolyee{
    empId;
    empName;
    empSalary;
    department;
    depId;


    constructor(){
        this.empId=0
        this.empName="";
        this.empSalary=0;
        this.department=new Department();
        // this.depId=0;
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
    setDid(id){
        this.depId=id;
    }
}