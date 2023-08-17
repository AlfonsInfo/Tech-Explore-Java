package iterasi.review1._1basic;

public class JavaMethod {

    //Instance Method -> akses atribut kelas
    class ContohInstance
    {
        private String nama;
        private String value;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    //Static Method -> bisa diakses dari kelas     //Constructor method -> method untuk membuat objek
    public static class ContohStaticMethod{

        private String attribute;

        public static int jumlahObjek;

        static {
            jumlahObjek = 0;
        }
        private ContohStaticMethod(String attribute)
        {
            this.attribute = attribute;
            jumlahObjek++;
        }


        public static ContohStaticMethod create(String attribute)
        {
            return new ContohStaticMethod(attribute);
        }
    }


    //Overloading -> bbrp method nama sama
    //Overriding -> implementasi dari method parent
    //Abstract method
    //Native Method


    public static void main(String[] args) {
        ContohStaticMethod contohStaticMethod  =  ContohStaticMethod.create("test");
        ContohStaticMethod contohStaticMethod1  =  ContohStaticMethod.create("test");
        ContohStaticMethod contohStaticMethod2  =  ContohStaticMethod.create("test");
        System.out.println(ContohStaticMethod.jumlahObjek);
    }
}
