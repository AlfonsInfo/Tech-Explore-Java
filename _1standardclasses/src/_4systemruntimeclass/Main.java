package _4systemruntimeclass;

public class Main {
    public static void main(String[] args) {
//        System.out.println(System.getenv("APP"));
//        System.gc(); //Garbagae Collection
//        System.exit(1);
//        System.out.println("Hello");

        Runtime r = Runtime.getRuntime();
        System.out.println("Available Processor : " + r.availableProcessors());
        System.out.println("Free Memori : "+ r.freeMemory());
        System.out.println("Total Memori : " + r.totalMemory());
        System.out.println("Max Memori : " + r.maxMemory());
        r.gc(); // jarang dipelrukan karna sistem gc JVM memiliki algoritma gc yang canggih
    }
}
