// for safe varargs and functional interface
class My<T>{  // user defined generic class
    @SafeVarargs
    private void show(T...args){  // generic variable argument
        for(T x : args){
            System.out.println(x);
        }
    }
}
@FunctionalInterface
interface our{
    public void show();

}
public class annotation3 {
    public static void main(String[] args) {

    }
}
