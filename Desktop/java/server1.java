import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
    public static void main(String[] args) {
          
        ServerSocket serversocket=new ServerSocket(3333);
        System.out.println("Server is vating for client:");
        Socket socket=serversocket.accept();

        System.out.println("client found");

        InputStream is=socket.getInputStream(); 
        DataInputStream dis=new DataInputStream(is);
        String str=dis.readUTF();
        System.out.println("Message from client :"+str); 
    
        
        String str1="Hello client ";
        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF(str1);


        




    }
}
