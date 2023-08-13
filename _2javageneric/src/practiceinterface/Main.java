package practiceinterface;

//METHOD OBJEK IMPLEMENTASI DAPAT DIAKSES DARI INTERFACE
//POLIMORFISME DAN PENERAPAN INTERFACE DIJAVA
public class Main {


    public interface Human{
        public void makan();
        public void minum();
    }

    public static  class  Orkay implements Human
    {
        @Override
        public void makan() {
            System.out.println("Makan Enak Broo");
        }

        @Override
        public void minum() {
            System.out.println("Minuman Enak Broo");
        }
    }

    public static class OrangSederhana implements Human{
        @Override
        public void makan() {
            System.out.println("Makan Secukupnya");
        }

        @Override
        public void minum() {
            System.out.println("Minum secukupnya");
        }
    }
    public static void main(String[] args) {


        Human a = new Orkay();
        Human b = new OrangSederhana();

        System.out.println("Si Sultan");
        a.makan();
        a.minum();

        System.out.println("Si biasa-biasa aja");
        b.makan();
        b.minum();
    }
}
