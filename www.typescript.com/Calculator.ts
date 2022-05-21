class Calculator{

    num1:number=10;
    num2:number=20;

    mult(){
        console.log("mult is :: "+this.num1* this.num2);
    }

    division(){
        var div=this.num1/this.num2;

        console.log("division "+div);
    }

    addition(){

      
        console.log("addition of two no is "+(this.num1+this.num2));
    }

    subtraction(){

        var sub=this.num1-this.num2;
        console.log("substractin of two no is "+sub);

    }

   

}

let obj=new Calculator();
let obj1=new Calculator();
obj1.mult();
obj.addition();
obj.addition();

obj.addition();


