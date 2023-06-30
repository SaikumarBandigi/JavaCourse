package _12_series;

import java.util.List;

public class Room {


    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    @Override
    public String toString() {
        return "Room{" +
                "studentList=" + studentList +
                '}';
    }
}
