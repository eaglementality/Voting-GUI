package VOTING.COM;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class progression extends LoginPage {
//    private JProgressBar progressBar1 ;
    private JLabel textLabel;
    private JPanel panel ;
    private JProgressBar progressBar1;
    //    public JProgressBar progressBar = new JProgressBar();
    //int counter=0;

int counter = 0;
    public progression() {
//        progressBar1.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
                progressBar1.setValue(counter);
//                progressBar1.getValue();
                textLabel.getText();
                while (counter <= 100) {
                    progressBar1.setValue(counter);
                    //  progressBar1.setString(String.valueOf(counter));
                    try {
                        Thread.sleep(50);
                        if (counter == 20) {
                            textLabel.setText("Wait");
                            Thread.sleep(1000);
                        }
                        if (counter == 40) {
                            textLabel.setText("Connecting to pages");
                            Thread.sleep(5000);
                        }
                        if (counter == 60) {
                            textLabel.setText("Getting pages ready");
                        }
                        if (counter == 80) {
                            textLabel.setText("loading");
                        }
                        if (counter == 100) {
                            textLabel.setText("Complete");
                            Loginframe();
                            new Frame().dispose();
                        }
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                    counter += 1;

                }
            }
//        });
//    }


//    public void fill() {
//
//        //count value
//        while(counter<=100){
//            progressBar1.setValue(Integer.parseInt(String.valueOf(counter)));
//          //  progressBar1.setString(String.valueOf(counter));
//            try {
//                Thread.sleep(50);
//                if(counter== 20){
//                    textLabel.setText("Wait");
//                    Thread.sleep(1000);
//                }
//                if(counter== 40){
//                    textLabel.setText("Connecting to pages");
//                    Thread.sleep(5000);
//                }
//                if(counter==60){
//                    textLabel.setText("Getting pages ready");
//                }
//                if(counter==80){
//                    textLabel.setText("loading");
//                }
//                if(counter==100){
//                     textLabel.setText("Complete");
//                  Loginframe();
//                Frame().dispose();
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            counter += 1;
//
//
//        }
//    }

    private static JFrame Frame() {
    JFrame rame =new JFrame();
        rame.setContentPane(new progression().panel);

        rame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rame.setBounds(80,30,1500,757);
        rame.setVisible(true);
        rame.setLocationRelativeTo(null);
//        new progression().fill();
        return rame;
    }

    public static void main(String[] args) {
        Frame();

    }
}
