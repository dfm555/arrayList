package Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class TablePanel extends JPanel {

	private static final long serialVersionUID = -5852342325735259853L;
	
	//private DefaultTableModel tableModel;
    private JTable dataGrid;
//    private Students students = new Students();
//    private StudentsController cStudents = new StudentsController();

    public TablePanel() {
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
        getDataGrid().setModel(tableModel);
        JScrollPane tableContainer = new JScrollPane(getDataGrid());
        tableContainer.setPreferredSize(new Dimension(500, 200));
        add( tableContainer, BorderLayout.CENTER );
    }
}
