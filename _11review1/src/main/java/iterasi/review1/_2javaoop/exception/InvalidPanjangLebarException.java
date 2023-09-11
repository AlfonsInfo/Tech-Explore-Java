package iterasi.review1._2javaoop.exception;

public class InvalidPanjangLebarException extends Exception{


    public void showMessage()
    {
        System.out.println("Panjang atau lebar tidak boleh == 0");
    }


}
