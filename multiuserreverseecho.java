import java.io.*;
import java.net.*;

public class multiuserreverseecho extends Thread{
    Socket stk;

    multiuserreverseecho(Socket st) {
        stk = st;
    }

    public void run() {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do{
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }while(!msg.equals("dne"));
        stk.close();
    }catch(Exception e){}
}
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2001);
        Socket stk;
        multiuserreverseecho mu;
        int count = 1;

        do{
            stk = ss.accept();
            System.out.println("Client conncted " + count++);
            mu = new multiuserreverseecho(stk);
            mu.start();

        }while(true);


    }
}
