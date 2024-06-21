import controller.Controller;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("FSD", "dsa", "WER");
        controller.createStudent("FSD1", "dsa1", "WER1");
        controller.createStudent("FSD2", "dsa2", "WER2");
        controller.createStudent("FSD3", "dsa3", "WER3");
        controller.createStudent("FSD4", "dsa4", "WER4");
        controller.printStudent();
        System.out.println("*********************");

        Controller controller1 = new Controller();
        controller1.createTeacher("poi", "vxvsd", "jhjkl");
        controller1.createTeacher("poi1", "vxvsd1", "jhjkl1");
        controller1.createTeacher("poi2", "vxvsd2", "jhjkl2");
        controller1.createTeacher("poi3", "vxvsd34", "jhjkl3");
        controller1.createTeacher("poi4", "vxvsd4", "jhjkl4");
        controller1.printTeacher();
    }
}