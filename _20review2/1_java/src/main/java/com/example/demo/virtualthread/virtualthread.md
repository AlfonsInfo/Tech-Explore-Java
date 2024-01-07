Virtual Thread adalah salah satu fitur baru yang ada Java 21
Virtual Thread diajukan menggunakan proposal JEP 444
https://openjdk.org/jeps/444
Virtual Thread adalah thread ringan yang secara dramatis meringankan beban ketika membuat aplikasi yang membutuhkan concurrency yang tinggi


Thread di Java sebenarnya adalah wrapper Thread di Sistem Operasi
Artinya pembuatan Thread di Java sama mahalnya dengan Thread di OS
Satu thread biasanya bisa memakan konsumsi memory sebesar 1-2MB, sehingga kita tidak bisa membuat terlalu banyak Thread, misal sampai jutaan, karena bisa mendapat masalah kehabisan memory
Oleh karena keterbatasan ini, Virtual Thread diajukan
Virtual Thread konsepnya sama seperti Goroutine di Golang atau Coroutine di Kotlin


Virtual Thread sendiri tetap akan berjalan diatas Thread, namun yang membedakan adalah, kita tidak butuh membuat Thread secara manual, karena itu dikelola oleh JVM
Virtual Thread akan dijalankan dalam ForkJoinPool Thread, sehingga Virtual Thread akan berjalan diatas Thread yang berjumlah total seperti jumlah CPU Core yang kita gunakan
Karena Virtual Thread sangat ringan, oleh karena itu kita bisa buat sampai jutaan Virtual Thread secara mudah tanpa harus takut kehabisan memory
