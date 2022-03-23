function getResult(){
    //it is for reading value from html page input box
    mark=document.getElementById('mark').value;
    if(mark>40){
//it is for writing value to html page output
document.getElementById('ans').innerHTML="You are passed with marks "+mark;
    }
    else{
//it is for writing value to html page output
document.getElementById('ans').innerHTML="You are failed with mark : "+mark;
    }
    
}


function getResultGradeWise(){
    mark=document.getElementById('mark').value;
    if(mark>90){
        document.getElementById('ans').innerHTML="A+";
    }
    else if(mark>85){
document.getElementById('ans').innerHTML="A";
    }
    else if(mark>75){
document.getElementById('ans').innerHTML="B+";
    }
else if(mark>60){
document.getElementById('ans').innerHTML="B";
}
else if(mark>55){
    document.getElementById('ans').innerHTML="C";
}
else if(mark>40){
    document.getElementById('ans').innerHTML="D";
}

    else{
      document.getElementById('ans').innerHTML="Well You are failed";  
    }
}

function hotelMenu(){

    choice=document.getElementById('mark').value;
   
    switch(choice){

        case "1":
            document.getElementById('ans').innerHTML="Welcome to Veg Menu !!";
            break;
            case "2":
                document.getElementById('ans').innerHTML="Welcome to Non-Veg Menu!!!";
                break;
                default:
                    document.getElementById('ans').innerHTML="Menu Not Available !!!";

    }
}

function multiple(){

    mark=document.getElementById('mark').value;

    if(mark<100 && mark>90){
        
    }
}