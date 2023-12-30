package com.example.demo.database.part;

//connection resource mahal
// membuka dan menutup database setiap request sangat mahal
// connection sangat lambat ketika pertama dibuka dan memakan memori

//Connction Pool : diawal dibuatkan banyak koneksi ke db, sehingga hanya lambat diawal ketika aplikasi berjalan, selanjutnya
// ketika ada request yg butuh saat connection pool, maka aksi akan diantrikan terlebih dhaulu

//Connection pool direpresentasikan javax.sql.DataSource
//Hikari CP -> Library Connection Pool
public class DatabaseDataSource {
}
