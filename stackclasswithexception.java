class UnderflowException extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
class OverflowException extends Exception{
    public String toString(){
        return "Stack is full";
    }
}

class Stack{
    int size = 5;
    int top = -1;
    int S[];
    public Stack(int sz){
        size = sz;
        S = new int[sz];
    }
    public void push(int x) throws OverflowException{
        if(top == size-1){
            throw new OverflowException();
        }
        top++;
        S[top] = x;
    }
    public int pop() throws UnderflowException{
        int x = -1;
        if(top == -1){
            throw new UnderflowException();
        }
        x = S[top];
        top--;
        return x;

    }
}
public class stackclasswithexception {

    public static void main(String[] args) {
    Stack s = new Stack(5);
    try {
        s.push(20);
        s.push(30);
        s.push(20);
        s.push(30);
        s.push(20);
        s.push(30);
    }
    catch (OverflowException s2){
        System.out.println(s2);
    }
    try {
        System.out.println(s.pop());
    }
    catch (UnderflowException s3){
        System.out.println(s3);
    }
    }
}
