package Service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> userList = new ArrayList<>();
    private final Integer count = 1;
    private User user;


    public void create(String firstName, String lastName, String middleName, Type type) {
        Integer id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, lastName, middleName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        boolean itsStudent = type.STUDENT == type;
        int lastId = 1;
        for (User user1 : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }


    public User getUserById(Integer id, Type type) {
        boolean itsStudent = type.STUDENT == type;
        User currentUser = null;
        for (User user1 : userList) {
            if (user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacherId() == id) {
                currentUser = user;
            }
            if (user instanceof Student && itsStudent && ((Student) user).getStudentId() == id) {
                currentUser = user;
            }

        }
        return currentUser;
    }

    private List<User> getUserList(){
        return userList;
    }

    public List<User> getStudent(){
        List<User> studentList = new ArrayList<>();
        for(User user: userList){
            if(user instanceof Student){
                studentList.add(user);
            }
        }
        return studentList;
    }

}
