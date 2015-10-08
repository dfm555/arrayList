package views;

import controllers.Students;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
/**
 * Created by monicaramirez on 5/10/15.
 */
public class TablePanel extends JPanel {

    //private DefaultTableModel tableModel;
    private JTable dataGrid;
    private Students students;

    public TablePanel( Students students) {
        initComponents();
        this.students = students;
        System.out.print( this.students.showStudents() );
    }

    public void initComponents() {
        setBorder(BorderFactory.createTitledBorder("Data grid"));
        setLayout(new BorderLayout() );
//        String[] col = {
//                "ID Student",
//                "Name",
//                "Career",
//                "Approved",
//                "Average"
//        };
//
//        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
//
//        for (int i = 0; i < students.showStudents().size(); i++){
//            int id = students.showStudents().get(i).getId();
//            String name = students.showStudents().get(i).getName();
//            String career = students.showStudents().get(i).getCareer();
//            int creditsApproved = students.showStudents().get(i).getNumberCreditsApprove();
//            double average = students.showStudents().get(i).getAverage();
//            Object[] data = { id, name, career, creditsApproved, average };
//            tableModel.addRow(data);
//        }
//
//        dataGrid = new JTable( tableModel );
//
//        JScrollPane tableContainer = new JScrollPane(dataGrid);
//        tableContainer.setPreferredSize(new Dimension(500, 200));
//        add( tableContainer, BorderLayout.CENTER );
    }
}
