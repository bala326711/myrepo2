import java.util.*;
public class stack {
    public static void main(String[] args){
        Stack <Integer> stack1=new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println("stack elements are:"+stack1);
        stack1.pop();
        System.out.println("stack elements are:"+stack1);
        System.out.println("display top element of stack:"+stack1.peek());
    }
}
