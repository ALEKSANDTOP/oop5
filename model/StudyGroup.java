package model;

import Service.DataService;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
     private Teacher teacher;
     private List<User> studentList = new ArrayList<>();

    public StudyGroup(Teacher teacher, DataService service) {
        this.teacher = teacher;
        studentList = service.getStudent();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }
}
