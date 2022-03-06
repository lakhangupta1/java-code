import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
 
public class myclient 
{
public static void main(String[] args) 
{   
      try{

      Socket socket=new Socket("192.168.43.158", 1111); 



      OutputStream os=socket.getOutputStream();
      DataOutputStream dos=new DataOutputStream(os);
      String str="Hello server";
      dos.writeUTF(str);
         


      dos.flush();  


      InputStream is=socket.getInputStream();
      DataInputStream dis=new DataInputStream(is);
      String str1=dis.readUTF();
      System.out.println(str1);





      dos.close();
      dis.close();
      is.close();
      os.close();
      socket.close();
              

      }
      catch(Exception e)
      {

      System.out.println(e);

      }




}


}
