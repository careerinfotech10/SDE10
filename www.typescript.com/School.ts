
import {Student} from "./Student";
class School{

  

   showStudent(){
    let stud =new Student(1,"santosh");
    stud.showData();
   }

}

var sc=new School();
sc.showStudent();