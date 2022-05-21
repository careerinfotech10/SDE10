
// parameter 
//parametrized function 
function addition( num:number, num2:number){
     var add:number=num+num2;
    console.log("addition of two no is : "+add);

}

// addition(200,300);
// addition(100,200);

function studentInformation(rollNumber:number,email?:string){

    console.log("show rollnumber"+rollNumber);
    console.log("show email "+email);

}

function multipleNumbers(...num1:number[]){
    console.log(num1);
}

multipleNumbers(100,3,4,5,6,7,8,9);