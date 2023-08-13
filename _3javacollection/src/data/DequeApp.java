package data;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

//Konkrit implementasi : LinkedList dan ArrayDeque
//Dequeue extends queue
public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.addAll(Arrays.asList("Mantap","Woy","Alfons","Jago Banget"));
        Deque<String> stringDeque2 = new LinkedList<>();
        stringDeque2.addAll(Arrays.asList("Mantap","Woy","Alfons","Jago Banget"));

        stringDeque.removeFirst();
        stringDeque.removeLast();
        stringDeque2.offerLast("JAGO BANGET");

        for (String e : stringDeque)
        {
            System.out.println(e);
        }for (String e : stringDeque2)
        {
            System.out.println(e);
        }
    }
}
