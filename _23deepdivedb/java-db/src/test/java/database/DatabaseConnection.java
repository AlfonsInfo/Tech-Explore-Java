package database;

import org.junit.jupiter.api.*;

public class DatabaseConnection {

    @Test
    void testDatabaseConnection() {
        String postgresUrl = "jdbc:postgresql://localhost:5432/media-social";
        String username = "postgres";
        String password = "password";
        try{
            java.sql.Connection connection = java.sql.DriverManager.getConnection(postgresUrl, username, password);
            System.out.println("Database connection successful");
            connection.close();
        } catch (java.sql.SQLException e) {
            Assertions.fail("Database connection failed");
        }
    }
    @Test
    void testDatabaseConnectionUsedMemory() {
        String postgresUrl = "jdbc:postgresql://localhost:5432/media-social";
        String username = "postgres";
        String password = "password";

        // Mendapatkan instance runtime untuk melihat penggunaan memori
        Runtime runtime = Runtime.getRuntime();

        // Memaksa garbage collection sebelum pengukuran untuk hasil yang lebih akurat
        System.gc();

        // Mengambil penggunaan memori sebelum membuka koneksi
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memori sebelum koneksi: " + bytesToMB(memoryBefore) + " MB");

        try (java.sql.Connection connection = java.sql.DriverManager.getConnection(postgresUrl, username, password)) {
            System.out.println("Database connection successful");

            // Memaksa garbage collection setelah koneksi dibuat
            System.gc();

            // Mengambil penggunaan memori setelah membuka koneksi
            long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Memori setelah koneksi dibuka: " + bytesToMB(memoryAfter) + " MB");

            // Menghitung perbedaan penggunaan memori
            long memoryUsed = memoryAfter - memoryBefore;
            System.out.println("Penggunaan memori saat membuka koneksi: " + bytesToMB(memoryUsed) + " MB");

            // Pastikan koneksi berhasil
            Assertions.assertNotNull(connection, "Koneksi ke database gagal.");

        } catch (java.sql.SQLException e) {
            // Jika terjadi kesalahan, test akan gagal dengan pesan kesalahan
            Assertions.fail("Database connection failed: " + e.getMessage());
        }

        // Memaksa garbage collection setelah koneksi ditutup
        System.gc();

        // Mengambil penggunaan memori setelah koneksi ditutup
        long memoryAfterClose = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memori setelah koneksi ditutup: " + bytesToMB(memoryAfterClose) + " MB");

        // Menghitung berapa banyak memori yang dibebaskan setelah koneksi ditutup
        long memoryFreed = memoryBefore - memoryAfterClose;
        System.out.println("Memori yang dibebaskan setelah koneksi ditutup: " + bytesToMB(memoryFreed) + " MB");
    }

    // Fungsi untuk mengkonversi bytes ke megabytes
    private double bytesToMB(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }

}
