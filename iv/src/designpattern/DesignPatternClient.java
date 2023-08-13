package designpattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DesignPatternClient {


    public static void main(String[] args) throws Exception {

        showSingletone();
//breakSingletoneByReflaction();
        breakSingltoneBySerilization();
    }

    public static void breakSingltoneBySerilization() throws Exception {


        //Serilization - process of convert object to serieza of byte

        Singletone s1 = Singletone.getInstance();
        FileOutputStream fo=new FileOutputStream("D:\\repo\\SDE10\\iv\\src\\designpattern\\sdoc.txt");
        ObjectOutputStream ob=new ObjectOutputStream(fo);

        ob.writeObject(s1);

        //Deserilization
        FileInputStream fi=new FileInputStream("D:\\repo\\SDE10\\iv\\src\\designpattern\\sdoc.txt");

        ObjectInputStream oi=new ObjectInputStream(fi);
        Singletone s2 = (Singletone) oi.readObject();
        System.out.println(s2.hashCode());


    }

    private static void showSingletone() throws Exception {
        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();

        System.out.println("S1 : "+s1.hashCode());
        System.out.println("S2 : "+s2.hashCode());
    }
    private static void breakSingletoneByReflaction() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singletone> singletone = Singletone.class.getDeclaredConstructor();
        singletone.setAccessible(true);

        Singletone s1 = singletone.newInstance();
        Singletone s2 = singletone.newInstance();
        Singletone s3 = singletone.newInstance();
        Singletone s4 = singletone.newInstance();

        System.out.println(s1.hashCode());

    }
}
