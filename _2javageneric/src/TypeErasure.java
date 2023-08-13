public class TypeErasure {
    public static void main(String[] args) {
        MyData stringData = new MyData("Alfons"); // tanpa informasi generic diisi dengan generic type

        //Saat tidak diberikan informasi generic tidak terjadi compile error
        //MyData<Integer> integerData =  stringData;
        //MyData<Integer> integerData =  (MyData<Integer>) stringData; //karena tidak ada informasi spesifik pada stringData unchecked cast terjadi
        //Integer integer =integerData.getData();

        //Saat Tampung sama tipe aman
        //MyData<String> tampungSamaJenis  = stringData;
    }
}
//Type erasure adalah proses dimana inforamsi tipe generik dihapus sistem kompilasi dan jenis informasi tipe tersebut tidak ada didalam kode
// yangdihasilkan oleh komppiler, ada yang kompatibel akibatnya

//Baiknya

