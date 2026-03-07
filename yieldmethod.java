class yield2 extends Thread{
    public void run(){
        int count = 1;
        while(count<=50){
            System.out.println(count++ + "yield2");
        }
    }
}
public class yieldmethod {
    public static void main(String[] args) {
        yield2 y = new yield2();
        y.start();
        int count = 1;
        while (count <= 50) {
            System.out.println(count++ + " main");
            Thread.yield();  // it will allow other thread to run more time
        }

    }
}
