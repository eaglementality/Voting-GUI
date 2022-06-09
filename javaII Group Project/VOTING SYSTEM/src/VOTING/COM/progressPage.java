package VOTING.COM;


import javax.swing.*;
import java.awt.*;

public class progressPage extends LoginPage {
         JPanel panel1 = new JPanel();
       //  JPanel panel2 = new JPanel();
         JFrame frame = new JFrame("progress");
         JProgressBar bar = new JProgressBar();
         JLabel label = new JLabel();
         JLabel welcome = new JLabel();
         JSeparator separator = new JSeparator();

       public void ProgressBarDemo(){


           panel1.setLayout(new GridBagLayout() );
            bar.setValue(0);
            bar.setStringPainted(true);
            bar.setBounds(50,50,200,100);
            bar.setFont(new Font("MV Boli",Font.BOLD,25));
            bar.setForeground(Color.red);
            label.setFont(new Font("MV Boli",Font.BOLD,56));
            label.setForeground(Color.ORANGE.darker());
            label.getText();
            ImageIcon imageIcon = new ImageIcon("C://Users//JESSE//Desktop//javaII Group Project//VOTING SYSTEM//src//VOTING//COM//Pic//admin.jpg");
            welcome.setIcon(imageIcon);
            welcome.setLayout(new BorderLayout());
            panel1.add(welcome);
            panel1.add(label);
           panel1.add(separator);
            panel1.add(bar);
            panel1.setBackground(Color.BLUE.darker());

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
                     label.setText("Wait");
                       Thread.sleep(1000);
                   }
                    if(counter== 40){
                       label.setText("Connecting to pages");
                        Thread.sleep(5000);
                   }
                    if(counter==60){
                        label.setText("Getting pages ready");
                    }
                    if(counter==80){
                        label.setText("loading");
                    }
                    if(counter==100){
                        label.setText("Complete");
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