package views;

import Controllers.StudentsController;
import Entities.Students;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private ElementsPanel elementsPanel = new ElementsPanel();
    private TablePanel tablePanel = new TablePanel();
    private ButtonsPanel buttonsPanel = new ButtonsPanel( this );
    StudentsController cStudents = new StudentsController();

    public Window(){
        initComponents();
    }

    public void initComponents() {
        tablePanel = new TablePanel();
        setTitle("Students Information");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        Box box = Box.createVerticalBox();
        box.add(elementsPanel, BorderLayout.NORTH);
        box.add(buttonsPanel, BorderLayout.CENTER );
        box.add( tablePanel, BorderLayout.SOUTH );
        add(box);
    }

    public void executeAction( String action ){
        switch (action){
            case "save":
                String name = elementsPanel.getTxtName().getText();
                String career = elementsPanel.getTxtCareer().getText();
                int creditsApproved = Integer.parseInt( elementsPanel.getTxtNumberCreditApprove().getText() );
                double average = Double.parseDouble( elementsPanel.getTxtAverage().getText() );
                int id = cStudents.listStudents().size() + 1;
                boolean result = cStudents.saveStudent(new Students(id,name, career, creditsApproved, average));
                if(result){
                    refreshGrid( );
                }else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
        }

    }

    public void refreshGrid (){
        //System.out.print( students.showStudents().size() );
        JOptionPane.showMessageDialog(null, "Success");
        String[] col = {
                "ID Student",
                "Name",
                "Career",
                "Approved",
                "Average"
        };

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

        for (int i = 0; i < cStudents.listStudents().size(); i++){
            int id = cStudents.listStudents().get(i).getId();
            String name = cStudents.listStudents().get(i).getName();
            String career = cStudents.listStudents().get(i).getCareer();
            int creditsApproved = cStudents.listStudents().get(i).getNumberCreditsApprove();
            double average = cStudents.listStudents().get(i).getAverage();
            Object[] data = { id, name, career, creditsApproved, average };
            tableModel.addRow(data);
        }

        tablePanel.getDataGrid().setModel(tableModel);
    }

}

