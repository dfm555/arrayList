package views;

import controllers.Students;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private Students students = new Students();
    private ElementsPanel elementsPanel = new ElementsPanel();
    private TablePanel tablePanel = new TablePanel();
    private ButtonsPanel buttonsPanel = new ButtonsPanel( this );

    public Window(){
        initComponents();
    }

    public void initComponents() {
        students.setId(1);
        students.setName("Name test");
        students.setCareer("Career test");
        students.setNumberCreditsApprove(40);
        students.setAverage(4.5);
        tablePanel = new TablePanel(students);
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
                int id = students.showStudents().size() + 1;
                students.setId(id);
                students.setName(name);
                students.setCareer(career);
                students.setNumberCreditsApprove(creditsApproved);
                students.setAverage(average);
                boolean result = students.saveStudent(students);
                if(result){
                    refreshGrid();
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

        for (int i = 0; i < students.showStudents().size(); i++){
            int id = students.showStudents().get(i).getId();
            String name = students.showStudents().get(i).getName();
            String career = students.showStudents().get(i).getCareer();
            int creditsApproved = students.showStudents().get(i).getNumberCreditsApprove();
            double average = students.showStudents().get(i).getAverage();
            Object[] data = { id, name, career, creditsApproved, average };
            tableModel.addRow(data);
        }

        for (int i = 0; i < students.showStudents().size(); i++){
            System.out.print(students.showStudents().get(i).getId());
            System.out.print(students.showStudents().get(i).getName());
            System.out.print(students.showStudents().get(i).getCareer());
            System.out.print("\n");
        }

        //tablePanel.getDataGrid().setModel(tableModel);
    }

}

