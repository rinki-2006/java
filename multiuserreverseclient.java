import java.io.*;
import java.net.*;

public class multiuserreverseclient {
    public static void main(String[] args) throws Exception{
        Socket stk = new Socket("LocalHost", 2001);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        do{
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From server " + msg);
        }while(!msg.equals("dne"));
        stk.close();
    }
}
