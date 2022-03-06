
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class tictactoebysirji implements ActionListener
{
     int count=0;
     boolean win=false;
     String str,str2; 
     Color color1;

    JFrame frame;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    tictactoebysirji()
    {
        frame=new JFrame("This is tictactoegame  ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3));
          

        jb1=new JButton();
        jb1.addActionListener(this);
        frame.add(jb1);

        jb2=new JButton();
        jb2.addActionListener(this);
        frame.add(jb2);
        jb1.setEnabled(true);

        jb3=new JButton();
        jb3.addActionListener(this);
        frame.add(jb3);

        jb4=new JButton();
        jb4.addActionListener(this);
        frame.add(jb4);

        jb5=new JButton();
        jb5.addActionListener(this);
        frame.add(jb5);

        jb6=new JButton();
        jb6.addActionListener(this);
        frame.add(jb6);

        jb7=new JButton();
        jb7.addActionListener(this);
        frame.add(jb7);

        jb8=new JButton();
        jb8.addActionListener(this);
        frame.add(jb8);

        jb9=new JButton();
       jb9.addActionListener(this);
        frame.add(jb9);
        


    }
   
    public static void main(String[] args) { 
         userpanel us=new  userpanel();
        tictactoebysirji   tic=new tictactoebysirji();
    }


    public void actionPerformed(ActionEvent e){ 
        
        count++;
       if(count%2==0){
       
        str="x";
        color1=Color.red;


       }
       else{
        str="0";
        color1=Color.yellow;


       }




        if(e.getSource()==jb1){
            jb1.setBackground(color1);
            jb1.setText(str);
            Font f=new Font("Arrival",1,140);
            jb1.setFont(f);
            jb1.setEnabled(false);

        }
        if(e.getSource()==jb2){
            jb2.setBackground(color1);
            jb2.setText(str);
           jb2.setFont(new Font("arrival",1,140));
           jb2.setEnabled(false);
        }

        if(e.getSource()==jb3){
            jb3.setBackground(color1);
            jb3.setText(str);
           jb3.setFont(new Font("arrival",1,140));
           jb3.setEnabled(false);
        }

        if(e.getSource()==jb4){
            jb4.setBackground(color1);
            jb4.setText(str);
           jb4.setFont(new Font("arrival",1,140));
           jb4.setEnabled(false);
        }

        if(e.getSource()==jb5){
            jb5.setBackground(color1);
            jb5.setText(str);
           jb5.setFont(new Font("arrival",1,140));
           jb5.setEnabled(false);
        }

        if(e.getSource()==jb6){
            jb6.setBackground(color1);
            jb6.setText(str);
           jb6.setFont(new Font("arrival",1,140));
           jb6.setEnabled(false);
        }

        if(e.getSource()==jb7){
            jb7.setBackground(color1);
            jb7.setText(str);
           jb7.setFont(new Font("arrival",1,140));
           jb7.setEnabled(false);
        }

        if(e.getSource()==jb8){
            jb8.setBackground(color1);
            jb8.setText(str);
           jb8.setFont(new Font("arrival",1,140));
           jb8.setEnabled(false);
        }

        if(e.getSource()==jb9){
            jb9.setBackground(color1);
            jb9.setText(str);
           jb9.setFont(new Font("arrival",1,140));
           jb9.setEnabled(false);
        }

        winningposibility();
    }
    void winningposibility(){
        if(jb1.getText()==jb2.getText()&&jb2.getText()==jb3.getText()&&jb1.getText()!=""){
          //  JOptionPane.showMessageDialog(frame,str+" wins"); 
           str2=str;
          win=true;


        }
        else if(jb4.getText()==jb5.getText()&&jb5.getText()==jb6.getText()&&jb5.getText()!=""){
            str2=str;
           // JOptionPane.showMessageDialog(frame,str+" wins"); 
           win=true;

        }
        else if(jb7.getText()==jb8.getText()&&jb8.getText()==jb9.getText()&&jb9.getText()!=""){
            //JOptionPane.showMessageDialog(frame,str+" wins"); 
            str2=str;
            win=true;

        }
        else if(jb1.getText()==jb4.getText()&&jb4.getText()==jb7.getText()&&jb7.getText()!=""){
           // JOptionPane.showMessageDialog(frame,str+" wins"); 
           str2=str;
           win=true;

        }
        else if(jb2.getText()==jb5.getText()&&jb5.getText()==jb8.getText()&&jb8.getText()!=""){
           // JOptionPane.showMessageDialog(frame,str+" wins");
           str2=str;
           win=true;

        }
        else if(jb3.getText()==jb6.getText()&&jb6.getText()==jb9.getText()&&jb9.getText()!=""){
            //JOptionPane.showMessageDialog(frame,str+" wins"); 
            str2=str;
            win=true;

        }
        else if(jb1.getText()==jb5.getText()&&jb5.getText()==jb9.getText()&&jb1.getText()!=""){
          //  JOptionPane.showMessageDialog(frame,str+" wins"); 
          str2=str;
             win=true;

        }
        else if(jb3.getText()==jb5.getText()&&jb5.getText()==jb7.getText()&&jb7.getText()!=""){
           // JOptionPane.showMessageDialog(frame,str+" wins");     
           str2=str;
              win=true;

        }
        else{
              win=false;
        }
        whowins();
    }
    void whowins(){
        if(win==true){
            JOptionPane.showMessageDialog(frame,str2+" wins");  
            restartgame();
        }
        else if(win==false&&count==9){
            JOptionPane.showMessageDialog(frame,"Game is Draw");
            restartgame();

        }
    } 

    void restartgame(){
        int i=JOptionPane.showConfirmDialog(frame,"Do you want to restart");

        if(i==0){
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText(""); 
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");


            buttonsetEbeling(true);
            str="";
            count=0;
            win=false;
           
              jb1.setBackground(null);
              jb2.setBackground(null);
              jb3.setBackground(null);
              jb4.setBackground(null);
              jb5.setBackground(null);
              jb6.setBackground(null);
              jb7.setBackground(null);
              jb8.setBackground(null);
              jb9.setBackground(null);
            

        }
        else if(i==1){

           System.exit(0);

        }
        else{

             buttonsetEbeling(false);



        }
    }
    void  buttonsetEbeling(boolean b){
            jb1.setEnabled(b);
            jb2.setEnabled(b);
            jb3.setEnabled(b);
            jb4.setEnabled(b);
            jb5.setEnabled(b);
            jb6.setEnabled(b);
            jb7.setEnabled(b);
            jb8.setEnabled(b);
            jb9.setEnabled(b);
    }

    
} 
class userpanel implements ActionListener {

    JFrame frame;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb;


    userpanel(){

       frame=new JFrame();
       frame.setSize(600,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true); 
       frame.setLayout(null);

       jl1=new JLabel("Enter the first user ");
       jl1.setBounds(80,80,150,50);
       frame.add(jl1);  


       jt1=new JTextField();
       jt1.setBounds(200,50,250,40);
       frame.add(jt1);


       jl2=new JLabel("Enter the first user ");
       jl2.setBounds(100,100,150,50);
       frame.add(jl2);  


       jt2=new JTextField();
       jt2.setBounds(250,900,250,40);
       frame.add(jt2); 


       jb=new JButton("Start Game ");
       jb.setBounds(200,280, 150, 50); 
       jb.addActionListener(this);
       frame.add(jb);

       
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==jb)
        {


        String player1=jt1.getText();
        String player2=jt2.getText();



        }
        
    }
}
