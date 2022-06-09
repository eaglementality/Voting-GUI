package VOTING.COM;

import javax.swing.*;

public class PresidentPage {
    private JPanel PresidentPanel;
    private JButton button1;
    private JButton button2;

    public JFrame PresidentFrame(){
        JFrame PresidentFrame = new JFrame();
        PresidentFrame.setContentPane(PresidentPanel);
        PresidentFrame.setBounds(80,30,720,640);
        PresidentFrame.setVisible(true);

     return PresidentFrame;
    }
}
