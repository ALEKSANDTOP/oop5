package model;

public class Teacher extends User{

    private Integer TeacherId;

    public Teacher(String firstName, String lastname, String middleName, Integer teacherId) {
        super(firstName, lastname, middleName);
        TeacherId = teacherId;
    }

    public Integer getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(Integer teacherId) {
        TeacherId = teacherId;
    }
}
