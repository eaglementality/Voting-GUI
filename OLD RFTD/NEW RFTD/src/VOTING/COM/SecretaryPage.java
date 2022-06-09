package VOTING.COM;

import javax.swing.*;

public class SecretaryPage {
    private JButton Secretarybtn1;
    private JButton Secretarybtn2;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel SecretaryPanel;
    private JButton Secretarybtn3;
    private JTextField textField3;
    private JButton button1;

    public JFrame SecretaryFrame (){
        JFrame secretaryFrame = new JFrame();
        secretaryFrame.setContentPane(SecretaryPanel);
        secretaryFrame.setVisible(true);
        secretaryFrame.setLocationRelativeTo(null);
        secretaryFrame.setBounds(80,30,720,640);
        return secretaryFrame;
    }

    /*public JPanel getSecretaryPanel() {
        return SecretaryPanel;
    }*/
}
