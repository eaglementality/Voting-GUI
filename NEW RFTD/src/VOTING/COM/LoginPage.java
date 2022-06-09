package VOTING.COM;

import VOTING.COM.admin.StudentPage;
import VOTING.COM.model.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class LoginPage {
    private JPanel framePanel;
    private JTextField nameField;
    private JTextField idField;
   // private JButton loginBtn;
    private JPasswordField passwordField;
    private JLabel titleLabel;
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel passwordLabel;
    private JPanel loginPanel;
    private JButton ADMINButton;
    private JButton STUDENTButton;
    private static JFrame loginFrame;


    public  LoginPage()  {
        ADMINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String text =  nameField.getText();
                String ID = idField.getText();
                String pass = passwordField.getPassword().toString();

                if (text.isEmpty()) {
                    if(ID.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Enter your Name,ID, and Password!!!");}
                     else if(pass.isEmpty()) {JOptionPane.showMessageDialog(null,"Password Empty");}
                    else{JOptionPane.showMessageDialog(null,"Name is Empty");}
                }
                else if(pass.isEmpty()){
                       if(text.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Enter your Name,ID and Password!!!"); }
                       else{JOptionPane.showMessageDialog(null,"Password Empty!!!");}
                    }
                else if( !text.equals("Jesse") ){
                    JOptionPane.showMessageDialog(null,"Invalid Name!!!");}
                else if(ID.length()>11){
                    JOptionPane.showMessageDialog(null,"Invalid ID!!!");}
                else if(ID.length()<9){
                    JOptionPane.showMessageDialog(null,"Invalid ID!!!");}
                else if(!ID.equals("01202834D") ){
                    JOptionPane.showMessageDialog(null,"Invalid ID");}
//                else if(!pass.equals("12345")){
//                        JOptionPane.showMessageDialog(null,"Incorrect Password");
//                    }
                else {

                    AdminPage positionPage = new AdminPage();
                    positionPage.frame();

                    loginFrame.dispose();
                }

         }
        });

STUDENTButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String name =  nameField.getText();
        String ID = idField.getText();
        String pass = passwordField.getPassword().toString();

        if (name.isEmpty()) {
            if(ID.isEmpty()){
                JOptionPane.showMessageDialog(null, "Fields are Empty!!!");}
            else if(pass.isEmpty()) {JOptionPane.showMessageDialog(null,"Password Empty");}
            else{JOptionPane.showMessageDialog(null,"Name is Empty");}
        }
        else if(pass.isEmpty()){
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fields are Empty!!!"); }
            else{JOptionPane.showMessageDialog(null,"Password Empty!!!");}
        }
        else if( !name.equals("Jesse Yeboah") &&!name.equals("Sani Adamu")&&!name.equals("Godwin Nyarkoh")&&!name.equals("Felix Adjei")&&!name.equals("Assem Alfred")&&!name.equals("Enoch Elliah")&&!name.equals("Awuni Godfred")&&!name.equals("Mohammed Tijani")&&!name.equals("Mohammed Razak")&&!name.equals("Martin Torkor")){


            JOptionPane.showMessageDialog(null,"Invalid Name!!!");
        }

        else if(ID.length()>11){
            JOptionPane.showMessageDialog(null,"Invalid ID!!!");}
        else if(ID.length()<9){
            JOptionPane.showMessageDialog(null,"Invalid ID!!!");}
        else if(!ID.equals("01202834D") && !ID.equals("01202356D")&& !ID.equals("01202490D")&& !ID.equals("01200309D")&& !ID.equals("01202042D")&& !ID.equals("01201513D")&& !ID.equals("012043513D")&& !ID.equals("01205336D")&& !ID.equals("01201118D")&& !ID.equals("01202727D")){
            JOptionPane.showMessageDialog(null,"Invalid ID");}
//                else if(!pass.equals("12345")){
//                        JOptionPane.showMessageDialog(null,"Incorrect Password");
//                    }
        else {
            StudentPage studentPage = new StudentPage();
            studentPage.frame();
//            PositionPage positionPage = new PositionPage();
//            positionPage.frame();


            loginFrame.dispose();
        }

//        StudentPage studentPage = new StudentPage();
//        studentPage.frame();
////            PositionPage positionPage = new PositionPage();
////            positionPage.frame();
//
//
//        loginFrame.dispose();
    }
});

    }

    public static JFrame Loginframe() {
        System.out.println(Data.getPres(1));
        loginFrame = new JFrame();
        loginFrame.setContentPane( new LoginPage().framePanel);
        loginFrame.setVisible(true);
        loginFrame.setBackground(Color.getColor("deep blue"));
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setBounds(80,30,720,640);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return loginFrame;
    }
    public static void main(String[] args) {
        Loginframe();
    }
}
