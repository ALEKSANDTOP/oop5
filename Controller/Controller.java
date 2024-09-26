package Controller;

import Service.DataService;
import model.*;
import view.StudentView;
import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupService service1 = new StudyGroupService();

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getStudentList(){
        List<User> list = service.getStudent();
        for (User user : list){
            Student student = (Student) list;
            view.printOnConsole(student);
        }
    }
    public void createGroup(Teacher teacher, List<Student> list1){
        service1.createGroup(teacher, list1);
    }

}
