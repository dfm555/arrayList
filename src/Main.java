import Controllers.StudentsController;
import Entities.Students;
import views.Window;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static StudentsController controller = new StudentsController();
    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
    }
}
