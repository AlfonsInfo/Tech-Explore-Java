package menggambar;

public class Persegi {
    public static void main(String[] args) {
        //basicPersegi(); // idenya linear
        //persegi2();
        //persegi3();
        //persegi4();
    }

    private static void persegi3() {
        for(int i = 0 ; i < 5 ;i++){
            for(int j = 0 ;j < 5 ; j++){
                if(j%2 == 0) {
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    private static void persegi4() {
        for(int i = 0 ; i < 5 ;i++){
            for(int j = 0 ;j < 5 ; j++){
                if(i%2 == 0 || j%2 == 0) {
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    private static void persegi2() {
        //*****
        //-----
        // dst
        for(int i = 0 ; i < 5 ;i++){
            for(int j = 0 ;j < 5 ; j++){
                if(i%2 == 0) {
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    private static void persegi() {
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0 ; i < 5 ;i++){
            for(int j = 0 ;j < 5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
