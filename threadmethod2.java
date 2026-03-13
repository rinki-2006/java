class MyThread extends Thread{
    public MyThread(String name){
        super(name);
//        setPriority(Thread.MAX_PRIORITY);
//        setPriority(Thread.MIN_PRIORITY);
        setPriority(Thread.MIN_PRIORITY + 3);

    }
}
public class threadmethod2 {
    public static void main(String[] args) {
        MyThread m = new MyThread("My thread 1");
        System.out.println("ID = " + m.getId());
        System.out.println("Name = " + m.getName());
        System.out.println("Priority = " + m.getPriority());  // give by default(5) if we cannot
        // mention any priority
        System.out.println("State = " + m.getState());
        m.start();
        System.out.println("State = " + m.getState());
        System.out.println("Alive = " + m.isAlive());
    }
}
