package VOTING.COM;

import VOTING.COM.admin.StudentPage;
import VOTING.COM.model.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultPage {
    public JPanel framePanel;
    private JPanel northPanel;
    private JLabel resultLabel;
    private JPanel centerPanel;
    private JLabel presidentCandidate1;
    private JLabel presidentCandidate2;
    private JLabel voteLabel1;
    private JLabel voteLabel2;
    private JLabel nameLabel1;
    private JLabel nameLabel2;
    private JLabel secretaryCandidate1;
    private JLabel presidentLabel;
    private JLabel secretaryLabel;
    private JLabel secretaryCandidate2;
    private JLabel nameLabel4;
    private JLabel secretaryCandidate3;
    private JLabel voteLabel3;
    private JLabel voteLabel4;
    private JLabel voteLabel5;
    private JLabel treasurerLabel;
    private JLabel treasurerCandidate1;
    private JLabel treasurerCandidate2;
    private JLabel voteLabel7;
    private JLabel voteLabel6;
    private JLabel nameLabel3;
    private JLabel nameLabel6;
    private JLabel nameLabel7;
    private JLabel nameLabel5;
    private JLabel programLabel1;
    private JLabel levelLabel1;
    private JLabel programLabel3;
    private JLabel programLabel4;
    private JLabel programLabel2;
    private JLabel levelLabel4;
    private JLabel levelLabel3;
    private JLabel programLabel6;
    private JLabel programLabel7;
    private JLabel programLabel5;
    private JLabel levelLabel6;
    private JLabel levelLabel7;
    private JLabel levelLabel5;
    private JLabel levelLabel2;
    private JTextField presVote1;
    private JTextField presVote2;
    private JTextField secVote1;
    private JTextField secVote2;
    private JTextField secVote3;
    private JTextField treVote1;
    private JTextField treVote2;
    private JTextField textField1;
    private JButton button1;

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

                // LoginPage.Loginframe();
               // frame.dispose();
            }
        });

        return Menubar;

    }

    public  JFrame resultframe (){
//       presCandidateField1.getText();
//        presCandidateField2.getText();
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(framePanel);
        frame.setBounds(30,30,1500,740);

//        presCandidateField1.setText(String.valueOf(Data.getSec(1)));
//        presCandidateField2.setText(String.valueOf(Data.getSec(2)));



//        System.out.println(Data.getSec(1));


        presVote1.setText(String.valueOf(Data.getPres(1)));
        presVote2.setText(String.valueOf(Data.getPres(2)));

        secVote1.setText(String.valueOf(Data.getSec(1)));
        secVote2.setText(String.valueOf(Data.getSec(2)));
        secVote3.setText(String.valueOf(Data.getSec(3)));

        treVote1.setText(String.valueOf(Data.getTre(1)));
        treVote2.setText(String.valueOf(Data.getTre(2)));

        return frame;
    }

    public static void main(String[] args) {
        ResultPage page = new ResultPage();
        page.resultframe();

        page.presVote1.setText(String.valueOf(Data.getPres(1)));
        page.presVote2.setText(String.valueOf(Data.getPres(2)));

        page.secVote1.setText(String.valueOf(Data.getSec(1)));
        page.secVote2.setText(String.valueOf(Data.getSec(2)));
        page.secVote3.setText(String.valueOf(Data.getSec(3)));

        page.treVote1.setText(String.valueOf(Data.getTre(1)));
        page.treVote2.setText(String.valueOf(Data.getTre(2)));


    }


}
