package VOTING.COM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AddPort {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton uploadButton;
    private JPanel ADDPORT;
    private JLabel picture;
    private JComboBox comboBox2;
    private JButton submitButton;
    private  static JFrame frame;
    public AddPort() {
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser =new JFileChooser();
                int returnValue = fileChooser.showSaveDialog(null);
                if(returnValue==JFileChooser.APPROVE_OPTION){
                    File selectedFile  = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(String.valueOf(selectedFile));
                    picture.setIcon(imageIcon);
                }
            }
        });

     
     
         maleRadioButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(maleRadioButton.isSelected()){
                   if(femaleRadioButton.isSelected()){
                       JOptionPane.showMessageDialog(null,"Bi-sexual beings are forbidden in this country");
                   }
                   else {
                          femaleRadioButton.setEnabled(false);
                   }
               }


           }
       });
       femaleRadioButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(femaleRadioButton.isSelected()) {
                   if (maleRadioButton.isSelected()) {
                       JOptionPane.showMessageDialog(null, "Bi-sexual beings are forbidden in this country");
                   } else {
                       maleRadioButton.setEnabled(false);
                   }
               }
           }
       });
        comboBox1.addItem("President");
        comboBox1.addItem("Secretary");
        comboBox1.addItem("Treasurer");

        comboBox2.addItem("Computer Science");
        comboBox2.addItem("Electrical Engineering");
        comboBox2.addItem("AI/Robotics");
        comboBox2.addItem("Marketing");
        comboBox2.addItem("LabTech");
        comboBox2.addItem("Cyber Security");
        comboBox2.addItem("Fashion");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                if(text1.isEmpty()){
                    if(text2.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Fields are empty!!");
                    }
                    else{ }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Submitted Successfully");
                    AdminPage.frame();
                    frame.dispose();
                     }

//                System.exit(0);
            }
        });

    }

    public  JFrame addport(){
      frame = new JFrame("ADMIN.PAGE");
      frame.setContentPane(new AddPort().ADDPORT);
      frame.setVisible(true);
      frame.setBounds(80,30,1500,757);
      frame.setLocationRelativeTo(null);
     // frame.setJMenuBar(menubar());
    return  frame;
    }
    public static void main(String[] args) {
       new AddPort().addport();
      }
}
