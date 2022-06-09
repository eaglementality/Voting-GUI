package VOTING.COM;


import javax.swing.*;
import java.awt.*;

public class progressPage extends LoginPage {
           JPanel panel2 = new JPanel();
            JPanel panel1 = new JPanel();
           JFrame frame = new JFrame("progress");
           JProgressBar bar = new JProgressBar();
           JLabel text2 = new JLabel("Welcome To ATU Voting System");
           JLabel text = new JLabel();
           JLabel image = new JLabel();
           ImageIcon imageIcon = new ImageIcon("C://Users//JESSE//Desktop//NEW RFTD//src//VOTING//COM//admin.jpg");
       public void ProgressBarDemo(){
           //panel1
           panel1.setBounds(101,650,900,200);
           panel1.setBackground(Color.WHITE);
           panel1.add(bar);
           panel1.add(text);
            //  progress bar
            bar.setValue(0);
            bar.setStringPainted(true);
            bar.setBorderPainted(true);
            bar.setBounds(50,50,200,50);
            bar.setFont(new Font("MV Boli",Font.BOLD,25));
            bar.setForeground(Color.green.darker());
            //text1 section
            text.setFont(new Font("chiller",Font.BOLD,56));
            text.setForeground(Color.blue.darker());
            text.getText();
            //text2 section
            text2.setFont(new Font("broadway",Font.BOLD,60));
            //image section
            image.setIcon(imageIcon);
            //frame section
            //frame.add();
            frame.add(panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(80,30,1500,757);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            fill();
        }


    public void fill() {
           int counter=0;

           while(counter<=100) {
               bar.setValue(counter);
               try {
                   Thread.sleep(50);
                   if(counter== 20){
                     text.setText("Wait");
                       Thread.sleep(1000);
                   }
                    if(counter== 40){
                       text.setText("Connecting to pages");
                        Thread.sleep(5000);
                   }
                    if(counter==60){
                        text.setText("Getting pages ready");
                    }
                    if(counter==80){
                        text.setText("loading");
                    }
                    if(counter==100){
                        text.setText("Complete");
                        Loginframe();
                        frame.dispose();
                    }
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               counter += 1;


           }
}
    public static void main(String[] args) {
           new progressPage().ProgressBarDemo();
    }


    }