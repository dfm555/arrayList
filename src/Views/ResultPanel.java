package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 8/10/15.
 */
public class ResultPanel extends JPanel{
    JLabel showResults;

    public ResultPanel() {
        initComponents();
    }

    public JLabel getShowResults() {
        return showResults;
    }

    public void setShowResults(JLabel showResults) {
        this.showResults = showResults;
    }

    public void initComponents(){
        setBorder( BorderFactory.createTitledBorder( "Results" ) );
        setLayout( new GridLayout( 1,1 ) );
        add(showResults = new JLabel("0 rows", SwingConstants.CENTER));
    }
}
