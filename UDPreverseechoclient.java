import java.net.*;
public class UDPreverseechoclient {
    public static void main(String[] args) throws Exception{
        // sending
        DatagramSocket ds = new DatagramSocket(2002);
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("LocalHost"), 2003);
        ds.send(dp);

        //receiving
        byte b[] = new byte[1024];
        dp = new DatagramPacket(b, 1024);
        ds.receive(dp);

        msg = new String(dp.getData()).trim();
        System.out.println("From server " + msg);
        ds.close();
    }
}
