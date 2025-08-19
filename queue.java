import java.util.*;
public class queue {
    public static void main(String[] args){
        Queue <Integer> queue1=new PriorityQueue<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        System.out.println("stack elements are:"+queue1);
        queue1.poll();
        System.out.println("stack elements are:"+queue1);
        System.out.println("display first element of queue:"+queue1.peek());
    }
}
