import javax.lang.model.element.Element;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.event.AncestorListener;
import javax.swing.event.MouseInputListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

class frame_1 implements ActionListener{

    JFrame frame;
    JTextField text;
    JButton jb1,jb2;
    void createframe ()
    {
        frame=new JFrame();
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        text=new JTextField();
        text.setBounds(100, 50, 300, 40);
        ////text.doLayout();
        frame.add(text);

        jb1=new JButton("click me ");
        jb1.addActionListener(this);
        
        jb1.setBounds(100,150, 120, 50);
        frame.add(jb1);


        jb2=new JButton("Clear");
        jb2.addActionListener(this);
        jb2.setBounds(250,150,120,50);
        frame.add(jb2);


        frame.setVisible(true);


        
    
    
    }
    
    public void actionPerformed(ActionEvent e)
    {  
        
      //  System.out.println("hi");
        if(e.getSource()==jb1)
        { 
            String name=text.getText();
            if(name.equals("")){
                JOptionPane.showMessageDialog(frame," There is not present ");  //if data is not present ....
            }
           else
           {
          // System.out.println("hello : "+name);
          JOptionPane.showMessageDialog(frame,"hello :"+name); //this is for print message on gui frame .....
           }
        }
        if(e.getSource()==jb2){
          text.setText("");
        }
    }
    
}
public class Main {
    public static void main(String[] args) {
        frame_1 text=new frame_1();
        text.createframe();
    }
    
}
