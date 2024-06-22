package Service;

import model.Student;
import model.StudentGroup;
import model.Teacher;


import java.util.ArrayList;
import java.util.List;

/*
Создать класс УчебнаяГруппаСервис,
в котором реализована функция(входные параметры - (Teacher, List<Strudent>)) формирования из
Студентов и Преподавателя УчебнойГруппы и возвращения его
 */
public class StudentGroupService {

    private StudentGroup studentGroup;
    private List <StudentGroup> studentGroups;

    public StudentGroupService() {
        this.studentGroups = new ArrayList();
    }

    public Teacher CreateGroup(Teacher teacher, List<Student> students){
        studentGroup = new StudentGroup(teacher, students);
        studentGroups.add(studentGroup);
        return studentGroup.getTeacher();
    }
}
