class Mythread2 extends Thread{
    public Mythread2(String name){
        super(name);
    }
    public void run() {
        int count = 1;
        while(count<=10){
            System.out.println(count++);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){  // whenever it is going to sleep may be
                                        // interrupted by some other thread
                System.out.println(e);
            }
        }
    }
}
public class threadmethod3 {

    public static void main(String[] args) {
        Mythread2 m = new Mythread2("My thread 2");
        m.start();
        m.interrupt();
    }
}
