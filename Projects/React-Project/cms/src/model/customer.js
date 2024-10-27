export default class Customer{
    id;
    name;
    email;
    accNumber;
    phnNumber;
    balance;

    constructor(){
        this.id = 0;
        this.name = "";
        this.email = '';
        this.accNumber = 0;
        this.phnNumber = 0;
        this.balance = 0;
        
    }

    setId(id){
        this.id=id
    }
    setName(name){
        this.name=name
    }
    setEmail(email){
        this.email=email
    }
    setAccNumber(accNumber){
        this.accNumber=accNumber
    }
    setPhNumber(phnNumber){
        this.phnNumber=phnNumber
    }
    setBalance(balance){
        this.balance=balance
    }
}