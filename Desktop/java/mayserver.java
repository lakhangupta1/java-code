import java.net.ServerSocket;
import java.io.*;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.*;
public class mayserver { 


public static void main(String[] args) 
{      
    try{
    ServerSocket socketserver=new ServerSocket(1111);
    System.out.println("Server is wating ");



    Socket socket=socketserver.accept();
    System.out.println("clientfound ");



    InputStream is=socket.getInputStream(); 
    DataInputStream dis=new DataInputStream(is);
    String str=dis.readUTF();
    System.out.println("Message from client :"+str); 

    
    String str1="Hello client ";
    OutputStream os=socket.getOutputStream();
    DataOutputStream dos=new DataOutputStream(os);
    dos.writeUTF(str1);




    dis.close();
    dos.close();
    dos.flush();
    os.close();
    is.close();
   socket.close();
    socketserver.close();


    }
    catch(Exception e)
    {
      System.out.println(e);

    }



}

}
