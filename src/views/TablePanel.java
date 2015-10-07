package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class TablePanel extends JPanel {

    private DefaultTableModel tableDefaultModel;
    private JTable dataGrid;

    TablePanel() {
        initComponents();
    }

    public void initComponents() {
        String col[] = {
                "ID student",
                "Name",
                "Carer",
                "Approve",
                "Average"
        };
        tableDefaultModel = new DefaultTableModel( col, 0 );
        dataGrid = new JTable( tableDefaultModel );
    }
}
