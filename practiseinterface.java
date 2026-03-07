class phone{
    void call(){
        System.out.println("Call feature");
    }
    void sms(){
        System.out.println("sms feature");
    }
}
interface camera{
    void click();
    void record();
}
interface musicplayer{
    void play();
    void pause();
    void stop();
}
class smartphone extends phone implements camera, musicplayer{
    void vediocall(){
        System.out.println("Vedio call feature");
    }
    public void click() {
        System.out.println("click feature");
    }
    public void record(){
        System.out.println("Record feature");
    }
    public void play(){
        System.out.println("Play feature");
    }
    public void pause(){
        System.out.println("Pause feature");
    }
    public void stop(){
        System.out.println("Stop feature");
    }
}
public class practiseinterface {
    public static void main(String[] args) {
        phone p = new smartphone();
        p.call();
        p.sms();
        camera c = new smartphone();
        c.click();
        c.record();
        musicplayer m = new smartphone();
        m.pause();
        m.play();
        m.stop();
    }
}
