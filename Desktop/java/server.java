import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class server 
{


    private JFrame serverframe;
    private JTextArea ta; 
    private JScrollPane scrollpane;
    private JTextField tf;
    private  ServerSocket serversocket;
    private InetAddress inet_Address;


    server()
    { 
        
        serverframe=new JFrame("SERVER");
        serverframe.setSize(350, 500);                   //this is for frame of chatting application .
        serverframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                      
        

       ta=new JTextArea();                ///this is for textarea ....
       ta.setEditable(false);
      scrollpane=new JScrollPane(ta);     //this is for scroll in which textarea are present ..
      serverframe.add(scrollpane);         //and also all things are presnet on frame ..
     //ie.    textarea+scrollpane  ..
     


     tf=new JTextField();             //this is for textfield where we wright somethings .  
     /*
     tf.addActionListener(new ActionListener() { 
    
        public void  actionPerformed(ActionEvent e){
            System.out.println("Hiiiiiiiiiiiiiii");
         }

     });
     */
    /*
     tf.addActionListeners(new ActionListener() {
         public void actionPerformed(ActionEvent e){
             System.out.println("hiiiiiiiiiiii");

         }
         
     });               */


     serverframe.add(tf   ,   BorderLayout.SOUTH); 



     serverframe.setVisible(true);        //to display on the screen .
                               
    } 




    public void watingforclient(){
        
          try{   

        String ipaddress=getIpaddress();

          serversocket=new ServerSocket(1111); 
          ta.setText("Toconnet with server please provide ip_address!"+ipaddress);
          serversocket.accept();
          ta.setText("client connetcted!");
          ta.append("------------------------------------------------------");


          }
          catch (Exception e){
              System.out.println(e);
          }

    }



    public String  getIpaddress(){
        String ip_Address="";
       try{
        inet_Address=InetAddress.getLocalHost();
        ip_Address=inet_Address.getHostAddress();
       
 
       }
       catch(Exception e){
           System.out.println(e);
       }
       return ip_Address;
    }


    


}
