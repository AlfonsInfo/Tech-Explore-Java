public class Covariant {

    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Alfons");
        //Kemampuan menganggap tipe spesifik menjadi tipe yang lebih umum
        //Mengunakan objek dengan tipe spesifik sebagai pengganti objek yang tipe lebih umum
        process(stringMyData);

        //MyData<Object> objectMyData = stringMyData; //Tida bisa karena readonly
    }

    //Covariant ? extends Object only read only getData //Jika <? extends ...> dilakukan di class itu bounded type parameter
    public static  void process(MyData<? extends Object> myData)
    {
        System.out.println(myData.getData());
        //Jika bisa set data maka perubahan tipe data berbahaya
        //myData.setData(1);
    }
    //ReadOnly -> type safety
}
