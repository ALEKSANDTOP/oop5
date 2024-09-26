package model;

import Service.DataService;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private final DataService service = new DataService();
    private List<User> listGroup;
    private Student student;
    private final List<Student> list = student.getStudents();


    public List<User> createGroup(Teacher teacher, List<Student> list1){
        List<User> list = new ArrayList<>();
        list.add(teacher);
        list.addAll(service.getStudent());
        return list;
    }
}
