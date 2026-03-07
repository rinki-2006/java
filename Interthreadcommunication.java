class My_data {
    int value;
    boolean flag = true;  //producer turn
    synchronized void set(int v){  // writing the value
        while (flag!=true) {  // producer wait
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        value = v;  // after assigning value then it consumer turn
        flag = false;  // consumer  turn
        notify();  // inform the other thread that it's your turn
    }
    synchronized int  get(){  // reading the value
        int x = 0;
        while(flag!=false){  //consumer wait
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        x = value;
        flag = true;  // producer turn
        notify();
         return x;
    }
}

class producer extends Thread{
    My_data data;  // reference of my_data
    producer(My_data d){
        data = d;
    }
    public void run(){
        int count = 0;
        while(count<10){
            data.set(count);
            System.out.println("Producer = " + count);
            count++;
        }
    }
}

class consumer extends Thread{
    My_data data;  // reference of my_data
    consumer(My_data d){
        data = d;
    }
    public void run(){
        int value = 0;
        while(value<10){
            value = data.get();
            System.out.println("Consumer = " + value);

        }
    }
}

public class Interthreadcommunication {
    public static void main(String[] args) {
        My_data data = new My_data();
        producer p = new producer(data);
        consumer c = new consumer(data);
        p.start();
        c.start();
    }
}
