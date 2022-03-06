package  codewithharry;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;


public class gui {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(420, 420);                       //window sise on the screen ....
        frame.setVisible(true);                           //window visivle on the screen .
        frame.setTitle("this is here title ");           // this is for title .
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to set close on x..
        frame.getContentPane().setBackground(Color.green);  //to set color with background.
        // also can be use   frame.getContentPane().setBackground(0,250,255);   for background color .
        frame.setResizable(true);            //to set resizable .
         
        JLabel lable=new JLabel();
        lable.setText("he bro ,this is lable class ");
        frame.add(lable);
     //   ImageIcon image=new ImageIcon("image.jpg")

    }
    
}
