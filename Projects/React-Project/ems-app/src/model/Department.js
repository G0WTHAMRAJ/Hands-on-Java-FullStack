export default class Department{
    depId ;
    depName;

    constructor(){
        this.depId=0;
        this.depName="";
    }

    setDepId(id){
        this.depId=id;
    }
    setDepName(name){
        this.depName=name;
    }
}