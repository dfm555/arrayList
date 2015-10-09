import Controllers.StudentsController;
import Views.Window;

public class Main {
    static StudentsController controller = new StudentsController();
    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
    }
}
