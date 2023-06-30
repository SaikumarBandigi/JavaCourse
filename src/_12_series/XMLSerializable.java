package _12_series;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XMLSerializable {
    public static void main(String[] args) {

        Student s1 = new Student(101, "SONU");
        Student s2 = new Student(102, "PRASHU");

        ArrayList<Student> s = new ArrayList<>();
        s.add(s1);
        s.add(s2);

        Room r = new Room();
        r.setStudentList(s);

        try {
            // Serialization

//            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Family.xml")));
//            x.writeObject(r);
//            x.close();

            // deSerialization

//            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Family.xml")));
//            Room room = (Room) x.readObject();
//            System.out.println(room);

            // or //

            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Family.xml")));
            Room room = (Room) x.readObject();

            List<Student> students = room.getStudentList();

            for(Student ss:students)
            {
                System.out.println(ss);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}