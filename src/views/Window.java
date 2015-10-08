package views;

import controllers.Students;

import javax.swing.*;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Window extends JFrame {

    private ElementsPanel elementsPanel = new ElementsPanel();
    private TablePanel tablePanel = new TablePanel();
    private ButtonsPanel buttonsPanel = new ButtonsPanel( this );

    public Window(){
        initComponents();
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
                Students students = new Students();
                break;
        }

    }

}
