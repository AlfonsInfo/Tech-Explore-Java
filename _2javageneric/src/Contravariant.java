public class Contravariant {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Alfons");
        //Menggantikan objek dengan tipe spesifik dengan tipe umum
        //Object dengan tipe speisifk diisi oleh objek lebih umum
        //Supertype dapat menggantikan subtype!!
        MyData<? super String> myData = objectMyData;

        System.out.println(objectMyData);
        System.out.println(myData);
        processWrite(objectMyData);
        processWrite(myData);
        System.out.println(objectMyData);
        System.out.println(myData);
        processWrite(objectMyData);
        processWrite(myData);



        processRead(myData);
        //supertype dapat menggantikan subtype
        processRead(objectMyData);
    }

    public static  void processWrite(MyData<? super  String> myData)
    {
        //write
        myData.setData("Mamang");
    }

    public static  void processRead(MyData<? super String> myData)
    {
        System.out.println(myData.getData());
    }


}
