package VOTING.COM.admin;

import VOTING.COM.AdminPage;
import VOTING.COM.LoginPage;
import VOTING.COM.ResultPage;
import VOTING.COM.model.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentPage extends ResultPage {

    private static JFrame frame;
    private JPanel NorthPanel;
    public JPanel StudentMain_Panel1;
    private JPanel WestPanel;
    private JPanel EastPanel;
    private JPanel SouthPanel;
    private JPanel Center;
    private JButton Treasurerbtn;
    private JButton Presidentialbtn;
    private JButton Secretarialbtn;
    private JCheckBox checkBox1;
    private JButton PREVOTEBtn1;
    private JCheckBox checkBox2;
    private JButton PREVOTEBtn2;
    private JCheckBox checkBox6;
    private JButton TREVOTEBtn2;
    private JCheckBox checkBox7;
    private JButton TREVOTEBtn1;
    private JButton pressubmitbtn;
    private JButton treasubmitbtn;
    private JButton secvotebtn1;
    private JCheckBox checkBox3;
    private JButton secvotebtn2;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JButton secvotebtn3;
    private JButton secSubmitbtn;
    private JPanel CenterPanel;


    //public int display=0;
    public StudentPage() {
        WestPanel.setVisible(false);
        CenterPanel.setVisible(false);
        EastPanel.setVisible(false);
      //  SouthPanel.setVisible(false);
        NorthPanel.setVisible(true);
        Presidentialbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WestPanel.setVisible(true);
            }
        });
        Secretarialbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CenterPanel.setVisible(true);
                //WestPanel.setVisible(false);
            }
        });
        Treasurerbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EastPanel.setVisible(true);
            }
        });

        int display = 0;
        PREVOTEBtn1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
//                display+=1;
                checkBox1.setSelected(true);
                checkBox2.setSelected(false);
                PREVOTEBtn2.setEnabled(false);

                Data.addPres(1);

                PREVOTEBtn1.setEnabled(false);

//                new ResultPage().presCandidateField1.setText(String.valueOf());
            }

        });
        PREVOTEBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox2.setSelected(true);
                checkBox1.setSelected(false);
                PREVOTEBtn1.setEnabled(false);
                Data.addPres(2);
//                display+=1;
//                resultPage.presCandidateField2.setText(String.valueOf(display));
            }
        });
        secvotebtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Data.addSec(1);
            }
        });
        secvotebtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Data.addSec(2);
            }
        });
        secvotebtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Data.addSec(3);
            }
        });
        TREVOTEBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox6.setSelected(true);
                checkBox7.setSelected(false);

                Data.addTre(2);
            }
        });
        TREVOTEBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox7.setSelected(true);
                checkBox6.setSelected(false);

                Data.addTre(1);
            }
        });

        pressubmitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Presidentialbtn.setEnabled(false);
                WestPanel.setVisible(false);
            }
        });
        secSubmitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Secretarialbtn.setEnabled(false);
                CenterPanel.setVisible(false);
            }
        });
        treasubmitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Treasurerbtn.setEnabled(false);
                EastPanel.setVisible(false);
            }
        });
    }


    public static JMenuBar menubar(){
        //Menubar
        JMenuBar Menubar = new JMenuBar();

        //Menus on the menubar
        JMenu File = new JMenu("File");
              File.setForeground(Color.BLUE.darker());
        //JMenu Display = new JMenu("Display");
        JMenu Help = new JMenu("Help");
              Help.setForeground(Color.BLUE.darker());
        //MenuItems in File Menu
//        JMenuItem add = new JMenuItem("Add");
        JMenuItem exit = new JMenuItem("Exit");
                   exit.setForeground(Color.BLUE.darker());
        //MenuItems in Display Menu
     //   JMenuItem Result = new JMenuItem("Result");

        //MenuItems in Help Menu
        JMenuItem About = new JMenuItem("About");
                  About.setForeground(Color.BLUE.darker());
        //adding fileMenuitems to file menu
//        File.add(add);
        File.add(exit);

        //adding displaymenuitem to display menu
//        Display.add(Result);

        //adding Helpmenuitems to help menu
        Help.add(About);
//        Help.add(exit);
        // adding all menus to menubar
        Menubar.add(File);
//        Menubar.add(Display);
        Menubar.add(Help);
        Menubar.setBackground(Color.ORANGE.darker());
//        Result.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new ResultPage().resultframe();
//            }
//        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                frame().dispose();
                LoginPage.Loginframe();
                frame.dispose();
            }
        });

        return Menubar;

    }


    public static JFrame frame() {
        frame = new JFrame("STUDENT.PAGE");
        frame.setContentPane(new StudentPage().StudentMain_Panel1);
        frame.setVisible(true);
        frame.setBounds(80,30,1500,757);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(menubar());
        //frame.pack();
//        System.out.println(Data.getSec(1));
        return frame;
    }



    public static void main(String[] args) {
     /*  JFrame frame = new JFrame();
        frame.setContentPane(new PositionPage().MainPanel1);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(menubar());*/
        frame();
//        new PositionPage().frame();
    }

}
