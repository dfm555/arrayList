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
    private JButton btnEdit;
    private JButton btnDelete;
    private JButton btnFilter;
    private Window window;

    public ButtonsPanel( Window window) {
        this.window = window;
        initComponents();
    }

    public void initComponents() {
        setBorder( BorderFactory.createTitledBorder( "Actions" ) );
        setLayout( new GridLayout( 1,4 ) );
        btnSave = new JButton( "Save" );
        btnSave.setActionCommand( "save" );
        btnSave.addActionListener( this );
        btnEdit = new JButton( "Edit" );
        btnEdit.setActionCommand( "edit" );
        btnEdit.addActionListener( this );
        btnDelete = new JButton( "Delete" );
        btnDelete.setActionCommand( "delete" );
        btnDelete.addActionListener( this );
        btnFilter = new JButton( "Filter" );
        btnFilter.setActionCommand("filter" );
        btnFilter.addActionListener(this);
        add( btnSave );
        add( btnEdit );
        add( btnDelete );
        add( btnFilter );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.executeAction( e.getActionCommand() );
    }
}
