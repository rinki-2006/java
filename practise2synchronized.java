class whitboard {
    String text;
    int noofstudent = 0;
    int count = 0;  // teacher turn

    public void attendance() {
        noofstudent++;
    }

    synchronized public void write(String t) {
        System.out.println("teacher is writing " + t);
        while (count != 0) {  // teacher wait
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
            text = t;  // teacher write
            count = noofstudent;
            notifyAll();
        }
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        String t  = text;
        count--;
        if (count == 0) {  // when count is zero it means all student write completely
            notify();  // then inform the teacher
        }
            return t;

        }
    }



class teacher extends Thread{
    whitboard w;
    String notes[] = {"Java is language", "It is OOPS", "It is Platform independent", "It supports thread", "ends"};
    teacher(whitboard w){
        this.w = w;
    }
    public void run(){
      for(int i = 0; i<notes.length; i++){
          w.write(notes[i]);
      }
    }
}
class student_3 extends Thread {
    String name;
    whitboard w;

    student_3(whitboard w, String name) {
        this.w = w;
        this.name = name;
    }

    public void run() {
        w.attendance();
        String text;

        do {
            text = w.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }
        while(!text.equals("ends"));

    }
}
public class practise2synchronized {
    public static void main(String[] args) {
        whitboard w = new whitboard();
        teacher t = new teacher(w);

        student_3 s = new student_3(w, "1. john");
        student_3 s2 = new student_3(w, "2. ajay");
        student_3 s3 = new student_3(w, "3. riya");
        student_3 s4 = new student_3(w, "4. rahul");

        t.start();
        s.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
