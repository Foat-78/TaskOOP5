package model;

import java.util.List;
/*
Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и
список Студентов
 */
public class StudentGroup{

    private Teacher teacher;
    private List <Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
