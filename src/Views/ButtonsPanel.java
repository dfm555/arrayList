package Views;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by monicaramirez on 7/10/15.
 */
public class ButtonsPanel extends JPanel implements ActionListener {

    private static final long serialVersionUID = 8485671819128037146L;
    
	private JButton btnSave;
    private JButton btnDelete;
    private JButton btnFilter;
    private JButton btnResetFilter;
    private Window window;

    public ButtonsPanel( Window window) {
        this.window = window;
        initComponents();
    }

    public void initComponents() {
        setBorder( BorderFactory.createTitledBorder( "Actions" ) );
        setLayout( new GridLayout( 0,4 ) );
        btnSave = new JButton( "Save" );
        btnSave.setActionCommand( "save" );
        btnSave.addActionListener( this );
        btnDelete = new JButton( "Delete" );
        btnDelete.setActionCommand( "delete" );
        btnDelete.addActionListener( this );
        btnFilter = new JButton( "Filter" );
        btnFilter.setActionCommand("filter" );
        btnFilter.addActionListener(this);
        btnResetFilter = new JButton( "Reset filters" );
        btnResetFilter.setActionCommand("reset" );
        btnResetFilter.addActionListener(this);
        add( btnSave );
        add( btnDelete );
        add( btnFilter );
        add( btnResetFilter );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.executeAction( e.getActionCommand() );
    }
}
