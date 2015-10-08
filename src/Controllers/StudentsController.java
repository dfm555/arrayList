package Controllers;

import Entities.Students;
import interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by monicaramirez on 8/10/15.
 */
public class StudentsController implements IStudent {

    List<Students> listAllStudent = new ArrayList<Students>();

    public StudentsController() {
    }

    @Override
    public boolean saveStudent(Students students) {
        boolean status = true;
        try {
            listAllStudent.add(students);
        }catch (Exception e){
            status = false;
        }
        return status;
    }

    @Override
    public boolean editStudent( Students students) {
        return false;
    }

    @Override
    public boolean deleteStudent( int id) {
        return false;
    }

    @Override
    public List<Students> listStudents() {
        return listAllStudent;
    }
}
