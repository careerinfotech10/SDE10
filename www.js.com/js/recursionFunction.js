count=0;
function fun(){
count++;
    document.write(" <br>"+count);
    if(count<=10){
            fun();
    }
}




fun();