import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        /** ITERABLES */
        Iterable<String> iterable = List.of("Alfons", "Setiawan", "jacub");
        /** karena Iterable bukan List<> tidak implement Collection maka tidak bisa add dkk </>*/
        for(var name : iterable)
        {
            System.out.println(name);
        }

        /** Array biasa juga bisa melakukan perulangan namun tidak memiliki kontrak deingan iterables
        int[] array2 = {2,3,4,5};
        for(int e : array2)
        {
            System.out.println(e);
        }*/

        /** COLLECTION */
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("Alfons");
        arrayList.add("Mantap");
        arrayList.add("Woyy");
        arrayList.addAll(List.of("Yoi", "My", "Man"));

        arrayList.remove("Alfons");
        arrayList.removeAll(List.of("Yoi","My"));

        for (var e : arrayList)
        {
            System.out.println(e);
        }
        System.out.println(arrayList.contains("Mantap"));
        System.out.println(arrayList.containsAll(Arrays.asList("Man","Mantap")));

        /** LIST
         * Iterable<-Collction<-List<-AL dan LK
         * Implementasinya ada  : ArrayList dan LinkedList
         * Array List */
        List<Integer> array = new ArrayList<>();
        List<Integer> array2 = new LinkedList<>();


        /** List.replaceAll() */
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <100 ; i++)
        {
            numbers.add(i);
        }

        numbers.replaceAll(integer -> {
            return integer * 10;
        });

        for (Integer i : numbers)
        {
            System.out.println(i)   ;
        }

        //Default Method yang disediakan Java

        //Literator -> partisi collection


        //Konversi ke array
        List<String> stringList = List.of("Mantap","Alfons","Yoo");

        Object[] objects = stringList.toArray();
        String[] strings = stringList.toArray(new String[]{});
    }
}