package views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private ElementsPanel elementsPanel = new ElementsPanel();
    private TablePanel tablePanel = new TablePanel();
    private ButtonsPanel buttonsPanel = new ButtonsPanel();

    public Window(){
        initComponents();
    }

    public void initComponents() {
        setTitle("Students Information");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 500);
        setLocationRelativeTo(null);
        //add(tablePanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);
        //add(tablePanel, BorderLayout.SOUTH);
    }

}
