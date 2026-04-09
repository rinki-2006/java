// server side
import java.net.*;
import java.io.*;
public class reverseechoserver {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2000);
        Socket st = ss.accept();

        //for reading, it is character based stream
        //convert char to byte, we need a converter called input stream
        BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
        PrintStream ps = new PrintStream(st.getOutputStream());

        String msg;
        StringBuilder sb;
        do{
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }while(!msg.equals("dne"));
    }
}
