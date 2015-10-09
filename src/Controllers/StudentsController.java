package Controllers;

import Entities.Students;
import Interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by monicaramirez on 8/10/15.
 */
public class StudentsController implements IStudent {

    List<Students> listAllStudent = new ArrayList<Students>();
    List<Students> filterList = new ArrayList<Students>();
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
    public boolean deleteStudent( int row) {
        boolean status = true;
        try {
            listAllStudent.remove(row);
        }catch (Exception e) {
            status = false;
        }
        return status;
    }

    @Override
    public List<Students> listStudents() {
        return listAllStudent;
    }

    public List<Students> listFilters() {
        return filterList;
    }

    public void filter(String name, String career, String credits, String average) {
        filterList.clear();
        Boolean flag = false;
        for (Students students: listAllStudent){
            if (!name.isEmpty() && students.getName().contains(name)){
                flag = true;
            }
            if (!career.isEmpty() && students.getCareer().contains(career)){
                flag = true;
            }
            if (!credits.isEmpty()){
                if (students.getNumberCreditsApprove()==(Integer.parseInt(credits))){
                flag = true;
                }
            }
            if (!average.isEmpty()){
                if (students.getAverage()==(Double.parseDouble(average))) {
                    flag = true;
                }
            }

            if(flag == true){
                filterList.add(students);
            }
        }
    }
}
