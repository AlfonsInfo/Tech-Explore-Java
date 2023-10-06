# Thread
- Thread merupakan proses ringan, membuat Thread bukan berarti kita melakukan pekerjaan
- untuk membuat pekerjaan, kita perlu membuat object dari interface runnable, selanjutnya object runnable tersebut bisa kita berikan ke thread untuk dijalankan
- secara thread berjalan, dia akan async, artinya berjalan sendiri dan kode program kita akan berlanjut ke kode program selanjutnya
- perlu memanggil function start()

# Thread user
- user thread vs daemon thread

# Race ondition
- Problem yang sering terjadi dalam aplikasi concurrent dan parallel
- Terjadi ketika sebuah data diubah secara berbarengan, menyebabkan hasil akhir yang tidak sesuai dengan yang kita inginkan
- 