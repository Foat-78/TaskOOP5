package model;

public class Teacher extends User {

    private int teacherId;

    public Teacher(int teacherId, String fName, String name, String lastName) {
        super(fName, name, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId  +
                '}' + super.toString();
    }
}
