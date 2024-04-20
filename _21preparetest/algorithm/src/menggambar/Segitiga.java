package menggambar;

public class Segitiga {
    public static void main(String[] args) {
        //segitiga1(5);
        //segitiga2(5);
//        segitiga1Pola(5);
        segitiga1Refactor(5);
    }

    //*
    //**
    //***
    public static void segitiga1(int factor ){
        for(int baris = 0; baris < factor ; baris ++ ){
            //* semakin lama selisi antara kolom dan baris semakin besar
            for (int kolom =  0  ; kolom <= baris ;kolom ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ****
    // ***
    // **
    // *
    public static void segitiga2(int factor){
        for(int baris = 0; baris <= factor ; baris ++ ){
            //* semakin lama selisi antara kolom dan baris semakin besar
            for (int kolom =  5  ; kolom >= baris ;kolom --){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void segitiga1Pola(int factor ){
        for(int baris = 0; baris < factor ; baris ++ ){
            //* semakin lama selisi antara kolom dan baris semakin besar
            for (int kolom =  0  ; kolom <= baris ;kolom ++){
                if(kolom == 0){
                    //batas kiri
                    System.out.print("-");
                }else if(kolom == baris){
                    //batas kanan
                    System.out.print("-");
                }else if(baris == (factor-1)) {
                    //batas bawah?
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void segitiga1Refactor(int factor ){
        for(int baris = 0; baris < factor ; baris ++ ){
            //* semakin lama selisi antara kolom dan baris semakin besar
            for (int kolom =  0  ; kolom <= baris ;kolom ++){
                if(kolom == 0 || kolom == baris || baris == (factor-1)){
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
//*

