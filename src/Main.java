import Controllers.StudentsController;
import Entities.Students;
import views.Window;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static StudentsController controller = new StudentsController();
    public static void main(String[] args) {
        //Window window = new Window();
        //window.setVisible(true);
        arrayPopulate();
        listArray();
    }

    public static void arrayPopulate () {
        Students students = new Students();
        students.setId(1);
        students.setName("1");
        students.setCareer("1");
        students.setNumberCreditsApprove(5);
        students.setAverage(4);
        controller.saveStudent(students);
        students.setId(2);
        students.setName("2");
        students.setCareer("2");
        students.setNumberCreditsApprove(5);
        students.setAverage(4);
        controller.saveStudent(students);
        students.setId(3);
        students.setName("3");
        students.setCareer("3");
        students.setNumberCreditsApprove(5);
        students.setAverage(4);
        controller.saveStudent(students);
    }

    public static void listArray() {

        List<Students> list = controller.listStudents();
        for (Students student: list) {
            System.out.println("id"+student.getId() );
            System.out.println("name"+student.getName() );
            System.out.println("Career"+student.getCareer() );
            System.out.println("Credits"+student.getNumberCreditsApprove() );

        }



    }


}
