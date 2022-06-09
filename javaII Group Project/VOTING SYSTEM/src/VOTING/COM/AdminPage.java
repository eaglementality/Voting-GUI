package VOTING.COM;

import VOTING.COM.admin.StudentPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class AdminPage {
    public JPanel MainPanel1;
    private JPanel NorthPanel;
    private JPanel WestPanel;
    private JPanel EastPanel;
    private JPanel SouthPanel;
    private JPanel Center;
    private JButton Presidentialbtn;
    private JButton Secretarialbtn;
    private JButton Treasurerbtn;
    private JCheckBox checkBox1;
    private JButton PREVOTEBtn1;
    private JCheckBox checkBox2;
    private JButton PREVOTEBtn2;
    private JCheckBox checkBox3;
    private JButton SECVOTEBtn1;
    private JCheckBox checkBox4;
    private JButton SECVOTEBtn2;
    private JCheckBox checkBox5;
    private JButton SECVOTEBtn3;
    private JCheckBox checkBox6;
    private JButton TREVOTEBtn1;
    private JCheckBox checkBox7;
    private JButton TREVOTEBtn;
    private static JFrame frame;
public int display=0;

//    public AdminPage() {
//
//
////        WestPanel.setVisible(false);
////        Center.setVisible(false);
////        EastPanel.setVisible(false);
////        SouthPanel.setVisible(false);
////        NorthPanel.setVisible(true);
////        Presidentialbtn.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                WestPanel.setVisible(true);
////
////            }
////        });
////        Secretarialbtn.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                Center.setVisible(true);
////                WestPanel.setVisible(false);
////            }
////        });
////        Treasurerbtn.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                EastPanel.setVisible(true);
////                SouthPanel.setVisible(true);
////                Center.setVisible(false);
////            }
////        });
////
////        PREVOTEBtn1.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
//////            checkBox1.setSelected(true);
//////            checkBox2.setSelected(false);
////            display+=1;
////
////           }
////        });
////        PREVOTEBtn2.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
//////                checkBox2.setSelected(true);
//////                checkBox1.setSelected(false);
////                display+=1;
////
////            }
////        });
////        TREVOTEBtn1.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                checkBox6.setSelected(true);
////                checkBox7.setSelected(false);
////            }
////        });
////        TREVOTEBtn.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                checkBox7.setSelected(true);
////                checkBox6.setSelected(false);
////            }
////        });
//
//    }


    AdminPage(){
        System.out.println(1);
    }

    public static JMenuBar menubar(){
    //Menubar
    JMenuBar Menubar = new JMenuBar();

    //Menus on the menubar
    JMenu File = new JMenu("File");
    File.setMnemonic(KeyEvent.VK_F);

    JMenu Display = new JMenu("Display");
    Display.setMnemonic(KeyEvent.VK_D);

    JMenu Help = new JMenu("Help");
    Help.setMnemonic(KeyEvent.VK_H);

    //MenuItems in File Menu
    JMenuItem add = new JMenuItem("Add");
        add.setMnemonic(KeyEvent.VK_A);
    JMenuItem exit = new JMenuItem("Exit");
    exit.setMnemonic(KeyEvent.VK_X);
    exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

    //MenuItems in Display Menu
    JMenuItem Result = new JMenuItem("Result");
    Result.setMnemonic(KeyEvent.VK_R);

    //MenuItems in Help Menu
    JMenuItem About = new JMenuItem("About");
    About.setMnemonic(KeyEvent.VK_A);

    //adding fileMenuitems to file menu
    File.add(add);
    File.add(exit);

    //adding displaymenuitem to display menu
    Display.add(Result);

    //adding Helpmenuitems to help menu
    Help.add(About);

    // adding all menus to menubar
    Menubar.add(File);
    Menubar.add(Display);
    Menubar.add(Help);

    Result.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ResultPage().resultframe();
        }
    });
About.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JWindow window = new JWindow();
        JPanel panel = new JPanel();
        JLabel pic = new JLabel();
        JLabel label = new JLabel("Jesse Owusu Yeboah \n Sani Adamu\n Godwin Nyarkoh\n Felix Adjei\n Assem Alfred\n Enoch elliah\nAwuni Godfred\n Jeffin Ackwah ");
        panel.add(label);
        panel.add(pic);
        ImageIcon imageIcon = new ImageIcon("C:UsersJESSEDesktopjavaII Group ProjectVOTING SYSTEMsrcVOTINGCOMPicbig_hero_6_characters-wallpaper.jpg");

    }

});
    add.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new AddPort().addport();
        }
    });
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            LoginPage.Loginframe();
            frame.dispose();
        }
    });
    return Menubar;

}


    public static JFrame frame() {
       frame = new JFrame("ADMIN.PAGE");
//      frame.setContentPane(new StudentPage().StudentMain_Panel1);
      frame.setVisible(true);
      frame.setBounds(80,30,1500,757);
      frame.setLocationRelativeTo(null);
      frame.setJMenuBar(menubar());
      //frame.pack();
      return frame;
    }



    public static void main(String[] args) {
     /*  JFrame frame = new JFrame();
        frame.setContentPane(new PositionPage().MainPanel1);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(menubar());*/

        frame();
    }


}

