package TqsStack;
import java.util.*;

public class TqsStack<T> {
    private LinkedList<T> stack;


    public TqsStack(){
        this.stack = new LinkedList<T>();
    }

    public void push(T element){
        this.stack.push(element);
    }

    public T pop(){
        return this.stack.pop();
    }

    public T peek(){
        if (this.stack.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.stack.peek();
    }

    public int size(){
        return this.stack.size();
    }

    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

}
