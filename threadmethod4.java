class My_thread extends Thread{
    public void run(){
        int count = 1;
        while(count <= 50) {
            System.out.println(count++);
        }
    }
}
public class threadmethod4 {
    public static void main(String[] args) {
    My_thread t = new My_thread();
    t.setDaemon(true);  // when terminate program will also terminate
    t.start();
//    try{
//        Thread.sleep(100);  // main sleep for 100ms so the value get printed
//    }
//    catch (Exception e){
//        System.out.println(e);
//    }

        // for the usage of join method
        try {
            t.join();  // wait for other thread
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
