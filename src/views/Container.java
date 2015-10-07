package views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
public class Container extends JFrame {

    public Container(){
        initComponents();
    }

    public void initComponents() {

        setTitle(" Students Information ");
        setLayout( new GridLayout( 3,1 ) );
        setSize( 500, 500 );
        setVisible( true );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        add(new TablePanel());
    }

}
