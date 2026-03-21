class generic_g<T>{
    private T data;  // it can store any type of object
    public void setData(T v){
        data = v;
    }
    public T getData(){
        return data;
    }
}
public class generic<T> {
    public static void main(String[] args) {
        generic_g<String> g = new generic_g();
        g.setData("hello");
        System.out.println(g.getData());
    }

    }

