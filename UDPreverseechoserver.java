import java.net.*;
public class UDPreverseechoserver {
    public static void main(String[] args) throws Exception{
        //receiving
        DatagramSocket ds = new DatagramSocket(2003);
        byte b[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, 1024);
        ds.receive(dp);

        //sending
        String msg = new String(dp.getData()).trim();
        System.out.println("From client " + msg);

        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();
        dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("LocalHost"),2002);
        ds.send(dp);
        ds.close();

    }
}
