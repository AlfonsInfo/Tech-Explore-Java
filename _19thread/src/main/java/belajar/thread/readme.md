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


# Synchronized Method
- 

# Intrinsik Lock
- Synchronization di Java sebenarnya bekerja menggunakan lock
- Ketika kita melakukan synchronized method, secara otomatis java akan membuat intrinsic lock atau monitor lock
- Ketika synchronized method dipanggil oleh thread, thread akan melakukan mendapatkan intrinsic lock, setelah method selesai, maka thread akan mengembalikan intrinsic lock
- Semua ini terjadi secara otomatis di synchronized method

# Synchronized statement
- Saat kita menggunakan synchronized method, otomatis seluruh method di synchronization
- Kadang, misal kita hanya ingin melakukan synchronized pada bagian kode tertentu
- Untuk melakukan hal tersebut, kita bisa menggunakan synchronized statement.
- Namun ketika menggunakan synchronized statement, kita harus menentukan objek intrinsik lock sendiri


# Deadlock
- masalah yang bisa muncul saat kita melakukan synchronization
- Deadlock : kondisi thread saling menunggu satu sama lain.
- Karena saling menunggu, akhirnya terjadi deadlock, keadaan dimana semua thread tidak berjalan karena hanya menunggu lock.

# Solusi Deadlock
- Tidak ada solusi otomatis
- Harus diselesaikan oleh programmer yang membuat kode di java

# Thread Communication
- Dalam multithread programming, kadang sudah biasa ketika sebuah thread perlu menunggu thread lain menyelesaikan tugas tertentu, baru thread tersebut melakukan tugasnya
- sayangnya tidak ada cara otomatis komunikasi antar thread langsung
- programmer melakukan komunikasi secara manual

# Wait & Notify
- menunggu menggunakan loop tidak direkomendasikan ( karena membuagn resource cpu), ketika terjadi interrupt, loop tetap berjalan tanpa henti
- solusi : menggunakan method wait & notify
- wait() -> untuk menunggu
- notify() -> memberi tahu thread lain, data sudah tersedia


# NotifyAll
- Kadang ada kasus dimana sebuah lock ditunggu oleh banyak thread, notify() hanya memberi sinyal kepada 1 thread
- jika ingin mengirim sinyal ke semua thread, kita bisa menggunakanmethod notifyAll
 

# Timer
- Timer merupakan class untuk memfasilitasi eksekusi job secara async di masa depan
- Timer bisa di schedule berjalan 1x (delayed job) atau berjalan berulang kali (repeated job)

# High Level Concurrency Utilities
- Pada versi Java 5, Java merilis fitur bernama Concurrency Utilities fitur ini berisikan dukungan high level API untuk membuat aplikasi multithreaded lebih mudah.
- Concurrency Utilities memperkenalkan 3 package baru
  - java.util.concurrent
  - java.util.conccurent.atomic
  - java.util.conccurent.locks
- improvement dari low level concurrency.


# Kenapa butuh High Level API
- Management Thread secara manual bukanlah hal yang bijak.
- Manual , mudah terjadi kesalahan : Deadlock, Race Condition, Memory overflow (kebanyakan thread)
- Membuat menggunakan Low Level API : tidak produktif & dan fleksibel
- Yang biasa digunakan : Concurrency Utilities

---

# Threadpool
- Thread merupakan object yang mahal, memory 512 kb - 1 mb
- jika tidak mengatur penggunaan Thread, bisa menyebabkan error OutOfMemory
- Penggunaan Threadpool untuk management Thread
- Dengan ThreadPool, kita tidak perlu membuat kelas secara manula karena sudah diatur oleh threadpool
- threadpool bisa melakukan reusable thread
- threadpool di java dipresentasikan dalam class bernama Threadpoolexecutor

# Pengaturan Threadpool
- Ada beberapa yang perlu diperhatikan :
  - core pool : minimal thread yang akan dibuat ketika thread pool dibuat (mis 10)
  - max pool : maximal thread yang akan dibuat ketika thread yang akan dibuat
  - keep alive time : berapa lama thread akan dihapus, jika tidak bekerja
  - queue, antrian untuk menampung pekerjaan dikirim ke thread

# Eksekusi Runnable
- execute() -> milik threadpool
- otomatis data runnable akan dikirim ke queue threadpool untuk dieksekusi oleh thread yang ada di threadpool

# Menghentikan Threadpool
- ketika selesai menggunakan threadpool, menggunakan method shutdown() & shutdownNow()
- shutdown -> pekerjaan belum dikerjakan akan di ignore
- shutdownNow -> pekerjaannya akan direturnkan (return runnable)
- Jika menunggu pekerjaan selesai -> awaitTermination();