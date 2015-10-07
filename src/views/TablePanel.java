package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class TablePanel extends JPanel {

    //private DefaultTableModel tableModel;
    private JTable dataGrid;

    public TablePanel() {
        initComponents();
    }

    public void initComponents() {
        //setBorder(BorderFactory.createTitledBorder("Data grid"));
        setLayout(new GridLayout(1,1));
        String[] col = {
                "ID student",
                "Name",
                "Carer",
                "Approve",
                "Average"
        };
        Object object[][] = {
                { 111, "Duber", "Sistemas", 6, 4.5 }
        };

        dataGrid = new JTable( object, col );
        dataGrid.setFillsViewportHeight(true);
        add(new JScrollPane(dataGrid));
    }
}
