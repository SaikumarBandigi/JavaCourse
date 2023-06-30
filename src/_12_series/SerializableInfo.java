package _12_series;

import java.io.*;
/*

Object Serialization
Serializable interface(marker interface) makes work with objects

when you want to store state of an object we use ObjectOutputStream since java is security.
by default java doesn't allow object to be saved

its main purpose is store state of an object.

 */
public class SerializableInfo {
    public static void main(String[] args) throws Exception {


        Save s = new Save();
        s.i = 10;

        File f = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Obj.txt");
        FileOutputStream ff = new FileOutputStream(f);
        //DataOutputStream d = new DataOutputStream(ff);

        ObjectOutputStream o = new ObjectOutputStream(ff);
        o.writeObject(s);

//
//        File f = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Obj.txt");
//
//        FileInputStream ff = new FileInputStream(f);
//
//        ObjectInputStream o = new ObjectInputStream(ff);
//        Save save = (Save) o.readObject();
//        System.out.println(save.i);

    }
}

class Save implements Serializable {
    int i;
}
