package Service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> listUsers = new ArrayList<>();


    public void create(String fName, String name, String lastName, Type type){
        int id = getId(type);
        if(Type.Student == type){
            Student student = new Student(id, fName, name, lastName);
            listUsers.add(student);
        }
        else if(Type.Teacher == type){
            Teacher teacher = new Teacher(id, fName, name, lastName);
            listUsers.add(teacher);
        }
    }

    public int getId(Type type){
        int id = 0;
        for (User user:listUsers) {
            if (user instanceof Teacher && Type.Teacher == type){
                id = ((Teacher)user).getTeacherId();
            }
            if (user instanceof Student && Type.Student == type){
                id = ((Student)user).getStudentId();
            }
        }
        return ++ id;
    }
    public List<User> getAllSnudent(){
        List<User> userList = new ArrayList<>();
        for (User user : listUsers) {
            if (user instanceof Student){
                userList.add(user);
            }
        }
        return userList;
    }

    public List<User> getAllTeacher(){
        List<User> userList1 = new ArrayList<>();
        for (User user : listUsers) {
            if (user instanceof Teacher){
                userList1.add(user);
            }
        }
        return userList1;
    }

}
