package Views;

import Controllers.StudentsController;
import Entities.Students;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private ElementsPanel elementsPanel = new ElementsPanel();
    private TablePanel tablePanel = new TablePanel();
    private ButtonsPanel buttonsPanel = new ButtonsPanel( this );
    private ResultPanel resultPanel = new ResultPanel();
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
        box.add( tablePanel, BorderLayout.CENTER );
        box.add( resultPanel, BorderLayout.SOUTH );
        add(box);
    }

    public void executeAction( String action ){
        switch (action){
            case "save":
                String name = elementsPanel.getTxtName().getText();
                String career = elementsPanel.getTxtCareer().getText();
                int creditsApproved = Integer.parseInt( elementsPanel.getTxtNumberCreditApprove().getText() );
                double average = Double.parseDouble( elementsPanel.getTxtAverage().getText() );
                int listSize = cStudents.listStudents().size();
                int id = 0;
                if(listSize == 0){
                  id = 1;
                }else{
                   id = 1+cStudents.listStudents().get(cStudents.listStudents().size()-1).getId();
                }
                boolean resultSave = cStudents.saveStudent(new Students(id,name, career, creditsApproved, average));
                if(resultSave){
                    JOptionPane.showMessageDialog(null, "Success");
                    refreshGrid( );
                }else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
            case "delete":
                int row = tablePanel.getDataGrid().getSelectedRow();
                boolean resultDelete = cStudents.deleteStudent(row);
                if(resultDelete){
                    JOptionPane.showMessageDialog(null, "Success");
                    refreshGrid( );
                }else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
            case "filter":
                cStudents.filter(elementsPanel.getTxtName().getText(),
                        elementsPanel.getTxtCareer().getText(),
                        elementsPanel.getTxtNumberCreditApprove().getText(),
                        elementsPanel.getTxtAverage().getText());
                refreshFilterGrid();
                break;
            case "reset":
                refreshGrid();
                break;
        }

    }

    public void refreshGrid (){
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
        resultPanel.getShowResults().setText(cStudents.listStudents().size()+" Rows");
    }
    public void refreshFilterGrid (){

        String[] col = {
                "ID Student",
                "Name",
                "Career",
                "Approved",
                "Average"
        };

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

        for (int i = 0; i < cStudents.listFilters().size(); i++){
            int id = cStudents.listFilters().get(i).getId();
            String name = cStudents.listFilters().get(i).getName();
            String career = cStudents.listFilters().get(i).getCareer();
            int creditsApproved = cStudents.listFilters().get(i).getNumberCreditsApprove();
            double average = cStudents.listFilters().get(i).getAverage();
            Object[] data = { id, name, career, creditsApproved, average };
            tableModel.addRow(data);
        }

        tablePanel.getDataGrid().setModel(tableModel);
        resultPanel.getShowResults().setText(cStudents.listFilters().size()+" Rows");
    }

}

