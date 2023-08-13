public class WildCard {
    public static void main(String[] args) {
        printLength(new MyData<>(100));
        printLength(new MyData<>("Alfons"));
        printLength(new MyData<>(true));
    }
    //Wild Card -> params bisa diisi dengan data apaun
    public static void printLength(MyData<?> data)
    {
        System.out.println(data.getData());
    }
}
