package iterasi.review1._2javaoop.exception;

public class Main {

    public static class Testing
    {

        //Daftarkan pada kepala method , nama exceptionnya
        public void testing(int input) throws  InvalidPanjangLebarException , CustomException
        {
            if(input == 0)
            {
                //Karena ada ini => memungkinkan terjadi error tambahin keyword throws
                throw new InvalidPanjangLebarException();
            }else if(input ==1){
                throw new CustomException("Exception lagi ga si");
            }else{
                System.out.println("Aman Bos qu");
            }
            }
        }
    public static void main(String[] args) {
        System.out.println("Input Angka" );
        //Misalnya diinput kan 0
        int input = 0;
        try{
            //Jadi misalnya didalam kelasnya ada throws dan throw di main, atau diluarnya harus di handle ga si!!
            Testing testing = new Testing();
            testing.testing(0);
            testing.testing(1);
        }catch (InvalidPanjangLebarException e)
        {
            e.showMessage();
        }catch (CustomException e)
        {
            System.out.println(e.getMessage());
        }

    }


    public static void contohSatu()
    {
        try{
            throw new CustomException("Melempar Exception");
        }catch (CustomException e){
            System.out.println("Ditangkep exceptionnya : " + e.getMessage());
        }
    }
}
