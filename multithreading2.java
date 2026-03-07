// by runnable
public class multithreading2 implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i + " " + "Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        multithreading2 m = new multithreading2();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while (i<=5){
            System.out.println(i + " " + "World");
            i++;
        }


            }
        }


