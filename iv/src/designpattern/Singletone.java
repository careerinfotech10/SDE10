package designpattern;

import java.io.Serializable;

public class Singletone implements Serializable {

    //Eager Initilization
//    final static   Singletone singletone=new Singletone();

    //Lazy initilization
    private static   Singletone singletone=null;
    private  Singletone() throws Exception {
        if(singletone!=null)
        {
            throw  new Exception("You are not allowed to create new object");
        }
        System.out.println("Hi I Am Constructor ");
    }

    public static Singletone  getInstance() throws Exception {
        if(singletone==null)
        {
            singletone= new Singletone();
        }
        return singletone;
    }

     public  Object readResolve()
     {
         return singletone;
     }

}
