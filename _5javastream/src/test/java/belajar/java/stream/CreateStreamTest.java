package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream()
    {
        Stream<String> emptyStream  = Stream.empty();
        Stream<String> oneStream  = Stream.of("One");
        String data = null;
        Stream<String> nullStream  = Stream.ofNullable(data); //of biasa akan error

    }

    @Test
    void testCreateStreamArray()
    {
        Stream<String> arrayStream = Stream.of("Alfons","Ganteng");
        Stream<Integer> arrayStreamInt = Stream.of(1,2,3,3,14);

        //menjalankan stream

        arrayStream.forEach(s ->
        {
            System.out.println(s);
        });

    }

    @Test
    void testCreateStreamFromCollection(){
        Collection<String> collection = List.of("Alfons", "Ganteg");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        //* Stream tidak bisa digunakan lagi
        try{
            stringStream.forEach(System.out::println);
        }   catch (IllegalStateException e){
//            AssertionError(e)
            System.out.println("ini error dah dihandling tp boy");
        }
    }

    @Test
    void testCreateStreamIterate(){
        Stream<String> stream1 = Stream.generate(() -> "Alfons");
        Stream<String> stream2 = Stream.iterate("Alfons",s -> s.toUpperCase());
        Stream<Integer> stream3 = Stream.iterate(1, s -> s+1);
        //stream1.forEach(System.out::println);
        stream3.forEach(System.out::println);
    }

    @Test
    void createStreamBuild(){
            Stream.Builder<String> builder = Stream.builder();

            builder.accept("Alfons");
            builder.add("Setiawan").add("Jacub");

            Stream<String> stream = builder.build();

            stream.forEach(System.out::println);
    }

    //Stream Operation -> Filtering, Mapping, Sorting, Aggregation, Collection, Paralle Processing
    @Test
    void testMapStream()
    {
        List<String> names = List.of("Alfons","Setiawan", "Jacub");
        Stream<String> stream = names.stream();
        Stream<String> streamUpper = stream.map(String::toUpperCase);
        streamUpper.forEach(System.out::println);
    }

    @Test
    void testStreamPipeline(){
        List.of("Alfons","Ganteng","Banget","Woy").stream()
                .map(String::toUpperCase)
                .map(s -> "Mr " + s)
                .forEach(System.out::println);
    }

    @Test
    void testReuse()
    {
        //<Integer> bisa ditampung <Integer>
        //<T> bisa ditampung <T>
        List<Integer> listData= List.of(2,3,12312);
        Stream<Integer> integerStream = listData.stream();
    }
    
    @Test //Lazy
    void testIntermediateOperation()
    {
        Stream<String> listData= List.of("one", "two", "three").stream();
        //one ngalir, two ngalir, three ngalir satu satu boyy
        Stream<String> upperNames = listData.map(s -> {
            //Defaultnya ga muncul jika tidak di print, tetapi di print, otomatis dia muncul
            System.out.println("Change " + s + " to Upper casee");
            return s.toUpperCase();
        });
        upperNames.forEach(System.out::println);
    }

    @Test
    void testFlatMap()
    {
        List.of("Alfons", "Setiawan").stream()
                .map(String::toUpperCase)
                .flatMap(upper -> Stream.of(upper,upper.length()))
//                .flatMap(serializable -> serializable.)
                .forEach(System.out::println);
    }

    @Test
    void filteringGanjilOnly(){
        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(s-> s%2 != 0)
                .forEach(System.out::println);

    }

    @Test
    void duplicateFilter()
    {
        List.of("mantap","ayam","mantap").stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    void limitFilter()
    {
        List.of(1,2,323,13,2).stream().limit(4)
                .forEach(System.out::println);
    }

    @Test
    void skipFilter()
    {
        List.of(1,2,323,13,2).stream().skip(2)
                .forEach(System.out::println);
    }

    @Test
    void takeWhileFilter(){
        List.of(1,2,323,13,2,500).stream().takeWhile(integer -> 300>integer && integer <400)
                .forEach(System.out::println);
    }

    //FindAny
    //FindFirst
    
    //Ordering Operation
    
    @Test
    void testOrderingOperations()
    {
        List.of(1,2,323,13,2).stream().sorted()
                .forEach(System.out::println);
    }
    @Test
    void testCustomOrderingOperations()
    {
        Comparator<Integer> reverseComparator = Comparator.reverseOrder();
        List.of(1,2,323,13,2).stream().sorted(reverseComparator)
                .forEach(System.out::println);
    }

    //Max atau Min atau Total

    @Test
    void testMax(){
        List<Integer> numbers = List.of(1, 2, 323, 13, 2);

        Integer maxNumber = numbers.stream()
                .max(Comparator.comparingInt(value -> Integer.valueOf(value)))
                .orElse(0); // Default value in case the list is empty

        System.out.println("Maximum number: " + maxNumber);

    }

    @Test
    void collectStreamData()
    {
        Stream<String> stream = Stream.of("Apple", "Banana", "Orange", "Grapes", "Strawberry");

        List<String> collectedList = stream.collect(Collectors.toList());

        System.out.println("Collected List: " + collectedList);
    }


    @Test
    void GroupByCollection()
    {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Strawberry", "Blueberry");

        // Group fruits by their length
        Map<Integer, List<String>> groupedByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Fruits Grouped by Length: " + groupedByLength);
    }


    @Test
    void testSequential(){
        Stream.of(1,23,42,12,123,12)
                .forEach(integer -> {
                    System.out.println(Thread.currentThread().getName());
                });
    }

    @Test
    void testParalel(){
        Stream.of(1,23,42,12,123,12)
                .parallel()
                .forEach(integer -> {
                    System.out.println(Thread.currentThread().getName() + " : " +integer);
                });
    }
}
