package VOTING.COM;

import javax.swing.*;

public class TreasurePages {

    private JButton button1;
    private JTextField textField1;
    private JPanel TreasurerPanel;

    public JFrame TreasurerFrame (){
        JFrame TreasurerFrame = new JFrame();
        TreasurerFrame.setContentPane(TreasurerPanel);
        TreasurerFrame.setVisible(true);
        TreasurerFrame.setLocationRelativeTo(null);
        TreasurerFrame.setBounds(80,30,720,640);
        return TreasurerFrame;
    }
}
