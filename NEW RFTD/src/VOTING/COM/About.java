package VOTING.COM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About  {
    private JPanel mainPanel;
    private JButton exitButton;
    private static JWindow frame;
    public About() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // AdminPage.frame();
                frame.dispose();
            }
        });
    }

    public static  JWindow show(){
         frame = new JWindow();
        frame.setContentPane(new About().mainPanel);
        frame.pack();
        frame.setVisible(true);
return frame;
    }

    public static void main(String[] args) {
        show();
    }
}
