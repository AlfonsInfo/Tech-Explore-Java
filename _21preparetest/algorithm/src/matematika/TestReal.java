package matematika;

import java.util.ArrayList;
import java.util.List;

public class TestReal {

    public String solution(int[] A) {
        // Implement your solution here
        //Ubah int[] ke ArrayList agar lebih mudah diolah
        List<Integer> arrayListA =  mapToArrayList(A);
        String result = "";
        for(int i = 0 ; i < arrayListA.size() ; i ++ ){
            Integer var1 = arrayListA.get(i);
            Integer var2 = arrayListA.get(i+1);
            boolean same = var1.equals(var2);
            boolean lebihBesar = var1 > var2;
            boolean lebihKecil = var1 < var2;
            if(same){
                result+="=";
            }else if(lebihBesar){
                result+=">";
            }else if(lebihKecil){
                result+="<";
            }
        }
        return result;
    }

    public  ArrayList<Integer> mapToArrayList(int[] A){
        ArrayList<Integer> list = new ArrayList<>();
        for(int number : A){
            list.add(number);
        }
        return list;
    }
}
