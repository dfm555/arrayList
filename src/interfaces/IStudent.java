package interfaces;

import Entities.Students;

import java.util.List;

/**
 * Created by monicaramirez on 8/10/15.
 */
public interface IStudent {

    public boolean saveStudent( Students students );
    public boolean editStudent( Students students);
    public boolean deleteStudent( int id);
    List<Students> listStudents();
}
