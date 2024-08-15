import java.util.*;
public class Q {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(3);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());

        //Priority Queue
        System.out.println("-----------------------------------------------------------------------------------------------");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(7);
        pq.add(5);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
