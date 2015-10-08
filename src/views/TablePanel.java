package views;

import javax.swing.*;
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
        setBorder(BorderFactory.createTitledBorder("Data grid"));
        setLayout(new BorderLayout() );
        String[] col = {
                "ID Student",
                "Name",
                "Career",
                "Approve",
                "Average"
        };
        Object object[][] = {
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },
                { 111, "Duber", "Sistemas", 6, 4.5 },



        };

        dataGrid = new JTable( object, col );

        JScrollPane tableContainer = new JScrollPane(dataGrid);
        tableContainer.setPreferredSize(new Dimension(500, 200));
        add( tableContainer, BorderLayout.CENTER );
    }
}
