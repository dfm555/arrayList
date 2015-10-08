package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by monicaramirez on 7/10/15.
 */
public class ButtonsPanel extends JPanel implements ActionListener {

    private JButton btnSave;
    private Window window;

    public ButtonsPanel( Window window) {
        this.window = window;
        initComponents();
    }

    public void initComponents() {
        setBorder( BorderFactory.createTitledBorder( "Actions" ) );
        setLayout( new GridLayout( 1,4 ) );
        add( btnSave = new JButton( "Save" ) );
        add( btnSave = new JButton( "Edit" ) );
        add( btnSave = new JButton( "Delete" ) );
        add( btnSave = new JButton( "Filter" ) );
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
