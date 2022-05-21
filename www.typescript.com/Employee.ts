class Employee{

name:string;
empId:number;
email:string;

setEmployeeData(name:string,empId:number,email:string){
    this.name=name;
    this.empId=empId;
    this.email=email;
}

showEmployeeData(){
    console.log("name : "+this.name +" empId "+this.empId+"email : "+this.email);
}


}

let emp1=new Employee();
emp1.setEmployeeData("Aditi",123,"aditi@gmail.com");
emp1.showEmployeeData();

let emp2=new Employee();
emp2.setEmployeeData("rahul",7891,"rahul@gmail.com");
emp2.showEmployeeData();