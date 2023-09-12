# Solid Pattern
- A principle of Object-Oriented Programming
- Perancangan kelas yang baik memiliki jaminan code program lebih mudah untuk dipelihara
- Perancangan kelas yang baik dapat membuat program menjadi lebih lentur
- Pattern ini berdasarkan 2 komponen utama prinsip perancangan
  - Coupling : ketergantungan antar kelas
  - Cohesion :  1 unit code / 1 task
    
  
    
# Single Responsibility Principle
- A class should have one reason to change
- if a class contains more than one concept it should divided into 2 classes


# Integration Segregation Principle
- Clients should not be forced to depend upon interfaces that they dont use
- Kelas tidak kohesif  jika mengimplementasi fat interface
- Memecah interface menjadi interface-interface kecil


# Dependency Inversion Principle
- High level modules should not depend upon low level modules
- Both should depend upon abstractions
- High levle modules connect to low level modules via a Interfaces

# Liskov's Substitution Principle
- Prinsip Substitusi Liskov mengatakan bahwa jika Anda memiliki sebuah kelas induk (superclass) dan sebuah kelas anak (subclass) yang merupakan turunan dari kelas induk tersebut, maka objek dari kelas anak harus dapat digunakan sebagai pengganti objek dari kelas induk tanpa menyebabkan masalah dalam program. Dengan kata lain, objek dari kelas anak harus memiliki semua perilaku yang diharapkan dari kelas induk dan tidak boleh mengubah atau membatasi perilaku yang ada.
- Kelas anak harus mematuhi semua kontrak pada kelas induk



# Apakah Solid Wajib ? 
- Dalam pemrograman project besar, kita pasti kemungkinan besar berkolaborasi, oleh karena itu
- butuh mengikuti standard / best practice 



# KISS principle ( Keep It Simple Stupid)
# Principle You Aren't Gonna Need it (YAGNI)