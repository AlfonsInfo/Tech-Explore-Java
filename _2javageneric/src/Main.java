public class Main {

    //CONTOH BUKAN GENERIC
    public static class Data{
        private Object data;

//        public Data(Object data) {
//            this.data = data;
//        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    //CONTOH SEDERHANA GENERIC
    public static class DataGeneric<T> //tidak harus T
    {
        private T Data;

        public T getData() {
            return Data;
        }

        public void setData(T data) {
            Data = data;
        }
    }

    public static void main(String[] args) {

        //NON Generic
        Data dataString = new Data();
        dataString.setData("Alfons");
        //HARUS CASTING , SEBAGAI VARIABLE PUN HARUS DICASTING
        String value = (String) dataString.getData();


        //Generic
        DataGeneric<String> dataGeneric = new DataGeneric<>();
        dataGeneric.setData("Alfons");
        value = dataGeneric.getData();

        //Generic Lagi
        MyData<String> genericString = new MyData<>("Alfons");
        MyData<Integer> genericInt = new MyData<>(3); //Harus object
        MyData<Boolean> genericBool = new MyData<>(true); //kadang diamond parameter harus diisi juga ketika bersifat ambigu


        //Multiple Generic
        Pair<Integer, String> pair1 = new Pair<>(1,"Mantap");
        Pair<String, Integer> pair2 = new Pair<>("Mantap",3);

        System.out.println(pair1);
        System.out.println(pair2);

        String[] names = {"Budi", "Ucup"};
        Integer[] values = {2,3,3,43};
        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.<Integer>count(values));


        //Invariant -> tipe-tipe generik dianggap berbeda dan tidak dapat diubah satu sama lain terlepas hubungan pewarisan atau polimorfisme
        MyData<String> data1 = new MyData<>("1");
        //MyData<Object> data2 = data1;
        //Dan sebaliknya
        //doIt(data1); tidak diizinkan juga BISA BACA <> pada fungsi-fungsi bawaan java/framework



        //COVARIANT

    }

    //<> menentukan tipe data parmas
    public static void doIt(MyData<Object> objectMyData)
    {

    }


}

