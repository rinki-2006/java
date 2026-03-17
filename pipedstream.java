// same as question which we do in multithreading for achieving synchronization
import java.io.*;

class producer_a extends Thread{
    OutputStream f;
    producer_a(OutputStream fo){
        f = fo;
    }
    public void run(){
        int count = 1;
        while(true){
            try {
                f.write(count);
                f.flush();  // to ensure data is sent to other side
                // if we write synchronization for one by one the code become lengthy so we use sleep
                Thread.sleep(10);

                System.out.println("Producer " + count);
                System.out.flush();
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class consumer_a extends Thread{
    InputStream i;
    consumer_a(InputStream io){
        i = io;
    }
    public void run(){
        int x;
        while(true){
            try {
                x = i.read();
                System.out.println("Consumer " + x);
                System.out.flush();
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
public class pipedstream {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        // connect this pipe two_way to write this
//        pis.connect(pos);
        pos.connect(pis);
        producer_a p = new producer_a(pos);
        consumer_a c = new consumer_a(pis);

        p.start();
        c.start();
    }
}
