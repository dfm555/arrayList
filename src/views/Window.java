package views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private TablePanel tablePanel = new TablePanel();

    public Window(){
        initComponents();
    }

    public void initComponents() {

        setTitle(" Students Information ");
        setSize(500, 500);
        setVisible(true);
        setLayout(new GridLayout(3, 1));
        add(tablePanel, BorderLayout.CENTER);
    }

}
