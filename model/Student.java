package model;

import Service.DataService;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private Integer StudentId;
    private DataService service;
    private List<Student> students = new ArrayList<>();


    public Student(String firstName, String lastname, String middleName, Integer studentId) {
        super(firstName, lastname, middleName);
        StudentId = studentId;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public List<Student> getStudents() {
        for (User student: service.getStudent()){
            Student student1 = (Student) student ;
            students.add(student1);
        }
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                '}';
    }
}
