package views;

import Controllers.StudentsController;
import Entities.Students;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by monicaramirez on 5/10/15.
 */
public class TablePanel extends JPanel {

    //private DefaultTableModel tableModel;
    private JTable dataGrid;
    private Students students = new Students();
    private StudentsController cStudents = new StudentsController();

    public TablePanel( ) {
        initComponents();
    }

    public JTable getDataGrid() {
        return dataGrid;
    }

    public TablePanel setDataGrid(JTable dataGrid) {
        this.dataGrid = dataGrid;
        return this;
    }

    public void initComponents() {
        setBorder(BorderFactory.createTitledBorder("Data grid"));
        setLayout(new BorderLayout() );
        setDataGrid(new JTable());
        String[] col = {
                "ID Student",
                "Name",
                "Career",
                "Approved",
                "Average"
        };

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

        List<Students> list = new ArrayList<Students>();
        list = cStudents.listStudents();

        for (int i = 0; i < list.size(); i++){
            int id = list.get(i).getId();
            String name = list.get(i).getName();
            String career = list.get(i).getCareer();
            int creditsApproved = list.get(i).getNumberCreditsApprove();
            double average = list.get(i).getAverage();
            Object[] data = { id, name, career, creditsApproved, average };
            tableModel.addRow(data);
        }

        getDataGrid().setModel(tableModel);

        JScrollPane tableContainer = new JScrollPane(getDataGrid());
        tableContainer.setPreferredSize(new Dimension(500, 200));
        add( tableContainer, BorderLayout.CENTER );
    }
}
