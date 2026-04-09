import java.io.*;
import java.net.*;

public class reverseechoclient {
    public static void main(String[] args) throws Exception{
        Socket st = new Socket("LocalHost", 2000);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));

        PrintStream ps = new PrintStream(st.getOutputStream());
        String msg;
        do{
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From server " + msg);
        }while(!msg.equals("dne"));
        st.close();
    }
}
