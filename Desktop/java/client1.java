import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client1 {
    public static void main(String[] args) {
        
        Socket socket=new Socket("192.168.43.158",3333);



        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        String str="Hello Server :";
        dos.writeUTF(str);

    }
}
