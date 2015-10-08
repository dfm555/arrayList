package views;

import controllers.Students;

import javax.swing.*;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private Students students = new Students();
    private ElementsPanel elementsPanel = new ElementsPanel();
    private TablePanel tablePanel = new TablePanel( students );
    private ButtonsPanel buttonsPanel = new ButtonsPanel( this );

    public Window(){
        initComponents();
        students.setId(1);
        students.setName("Name test");
        students.setCareer("Career test");
        students.setNumberCreditsApprove(40);
        students.setAverage(4.5);
        students.saveStudent(students);
    }

    public void initComponents() {
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
                    JOptionPane.showMessageDialog(null, "Success");
                }else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
        }

    }

}

