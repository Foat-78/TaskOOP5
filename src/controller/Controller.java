package controller;

import Service.DataService;
import View.StudentView;
import View.TeacherView;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class Controller {

    private StudentView sw = new StudentView();
    private DataService dataService = new DataService();
    public void createStudent(String fName, String name, String lastName){
        dataService.create(fName, name, lastName, Type.Student);
    }
    public void printStudent(){
        for (User iterable: dataService.getAllSnudent()) {
            sw.printOnConsole((Student)iterable);
        }
    }

    private TeacherView tv = new TeacherView();
    private DataService dataService1 = new DataService();
    public void createTeacher(String fName, String name, String lastName){
        dataService1.create(fName, name, lastName, Type.Teacher);
    }
    public void printTeacher() {
        for (User iterable1 : dataService1.getAllTeacher()) {
            tv.printOnConsole((Teacher) iterable1);
        }
    }
}