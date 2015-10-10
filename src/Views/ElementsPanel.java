package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by monicaramirez on 5/10/15.
 */
@SuppressWarnings("unused")
public class ElementsPanel extends JPanel {

    private static final long serialVersionUID = 5554341506809539758L;
	
	private JTextField txtName;
    private JTextField txtCareer;
    private JTextField txtNumberCreditApprove;
    private JTextField txtAverage;
	private JLabel lblName;
    private JLabel lblCareer;
    private JLabel lblNumberCreditApprove;
    private JLabel lblAverage;

    public ElementsPanel() {
        initComponents();
    }

    public void initComponents() {
        setLayout( new GridLayout(2,4) );
        setBorder( BorderFactory.createTitledBorder( "Data Students" ) );
        add( lblName = new JLabel( "Name:", SwingConstants.LEFT ) );
        add( txtName = new JTextField());
        add( lblCareer = new JLabel( "Career:", SwingConstants.LEFT ) );
        add( txtCareer = new JTextField());
        add( lblNumberCreditApprove = new JLabel( "Credits Approve:",
                SwingConstants.LEFT ) );
        add( txtNumberCreditApprove = new JTextField());
        add( lblAverage = new JLabel( "Average:", SwingConstants.LEFT ) );
        add( txtAverage = new JTextField());

    }

    public JTextField getTxtName() {
        return txtName;
    }

    public ElementsPanel setTxtName(JTextField txtName) {
        this.txtName = txtName;
        return this;
    }

    public JTextField getTxtCareer() {
        return txtCareer;
    }

    public ElementsPanel setTxtCareer(JTextField txtCareer) {
        this.txtCareer = txtCareer;
        return this;
    }

    public JTextField getTxtNumberCreditApprove() {
        return txtNumberCreditApprove;
    }

    public ElementsPanel setTxtNumberCreditApprove(JTextField txtNumberCreditApprove) {
        this.txtNumberCreditApprove = txtNumberCreditApprove;
        return this;
    }

    public JTextField getTxtAverage() {
        return txtAverage;
    }

    public ElementsPanel setTxtAverage(JTextField txtAverage) {
        this.txtAverage = txtAverage;
        return this;
    }
}
