// using thread class
public class multithreading extends Thread {
    public void run(){
        int i = 1;
        while(i<=5){
            System.out.println(i + " "+ "hello");
            i++;
        }
    }
    public static void main(String[] args) {
        multithreading t = new multithreading();
        t.start();
        int i = 1;
        while (i<=5){
            System.out.println(i + " " + "World");
            i++;
        }
    }

}
