package iterasi.review1._1basic;

public class FlowControl {

    public static class PerfomSelection{

        //if -else
        public static void maxBetween2(int a, int b)
        {
            if(a>b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }

        public static String predicateNilai(int nilai){
            String predicate = (nilai > 75) ?  "Bagus" : "Jelek";
            return predicate;
        }
    }

    public static class PerfomIteration{
        public static void tampilTotal(int ...args)
        {
            int count = 0;
            for (int arg : args)
            {
                    count+=arg;
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        FlowControl.PerfomIteration.tampilTotal(2,3,4,5,6); //For, ForEach, While, Do While
        FlowControl.PerfomSelection.maxBetween2(3,4); // if , if-else, if-else-if,switch, ternary
        System.out.println(FlowControl.PerfomSelection.predicateNilai(79));
    }
}
