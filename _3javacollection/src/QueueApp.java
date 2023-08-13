import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {

        //Implementasi menggunakan Array
        Queue<String> queue = new ArrayDeque<>(3);
        queue.offer("Alfons 3");
        queue.offer("Alfons 1");
        queue.offer("Alfons 2");

        for (String next = queue.poll(); next != null; next = queue.poll())
        {
            System.out.println(next);
        }
        //Kapasitas habis melakukan grow
        //Implementasi menggunakan LinkedList
        Queue<String> queue2 = new LinkedList<>();
        queue.offer("Alfons 3");
        queue.offer("Alfons 1");
        queue.offer("Alfons 2");

        for (String next = queue.poll(); next != null; next = queue.poll())
        {
            System.out.println(next);
        }
        //Implementasi menggunakan Comparable untuk pengurutan
        Queue<String> queue3 = new PriorityQueue<>();
        queue.offer("Alfons 3");
        queue.offer("Alfons 1");
        queue.offer("Alfons 2");

        for (String next = queue.poll(); next != null; next = queue.poll())
        {
            System.out.println(next);
        }
    }
}
