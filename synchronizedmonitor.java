class Mydata{
    synchronized public void display(String str){
        for(int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        }
    }

class Mythread extends Thread{
    Mydata d;
    Mythread(Mydata d){
        this.d = d;
    }
    public void run(){
        d.display("hello world");
    }
}
class Mythread1 extends Thread{
    Mydata d;
    Mythread1(Mydata d){
        this.d = d;

    }
    public void run(){
       d.display(" welcome");
    }
}
public class synchronizedmonitor {
    public static void main(String[] args) {
        Mydata d2 = new Mydata();
        Mythread t = new Mythread(d2);
        Mythread1 t2 = new Mythread1(d2);
        t.start();
        t2.start();
    }
}
