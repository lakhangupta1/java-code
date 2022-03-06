import java.awt.BorderLayout;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class formainclient {

    private JFrame clientframe;
    private JTextArea ta; 
    private JScrollPane scrollpane;
    private JTextField tf;
    private  ServerSocket clientsocket;
    private Socket socket;
    String ipaddress;

   formainclient(){ 
    
    connettoserver();

     ipaddress=JOptionPane.showInputDialog("Enter IP Address");
     System.out.println(ipaddress);

   if(ipaddress!=null)
     {  
       

         
        clientframe=new JFrame("CLIENT");
        clientframe.setSize(350, 500);                   //this is for frame of chatting application .
        clientframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                      
        
    
       ta=new JTextArea();                ///this is for textarea ....
       ta.setEditable(false);
      scrollpane=new JScrollPane(ta);     //this is for scroll in which textarea are present ..
      clientframe.add(scrollpane);         //and also all things are presnet on frame ..
     //ie.    textarea+scrollpane  ..
     
    
    
     tf=new JTextField();             //this is for textfield where we wright somethings .
     clientframe.add(tf   ,   BorderLayout.SOUTH);
    
    
     clientframe.setVisible(true);        //to display on the screen .

         }


     }   
     
     
   


   public void connettoserver(){ 

    try{ 
       
   // System.out.println(ipaddress);

    socket=new Socket(ipaddress,1111);

    }
    catch(Exception e){

        System.out.println(e);

    }


   }

    
}
