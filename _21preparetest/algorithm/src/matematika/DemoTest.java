package matematika;

import java.util.*;

public class DemoTest {
    public static void main(String[] args) {
        
    }
    
    public int solution(int[] A){
        boolean hasNegativeValue = Arrays.stream(A).anyMatch(x -> x < 0);
        if(hasNegativeValue){
            return 1;
        }else{
            List<Integer> list = new ArrayList<>();
            for (int num : A) {
                list.add(num);
            }
            for(int i = 1 ; i <= A.length ; i++){
                if(!list.contains(i)){
                    return i;
                }
            }
            return Collections.max(list);
        }
    }
}
