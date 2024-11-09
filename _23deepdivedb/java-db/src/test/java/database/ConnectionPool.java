package database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

public class ConnectionPool {

    HikariConfig getConfig() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        config.setUsername("postgres");
        config.setPassword("password");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        return config;
    }

    @Test
    void testConnectionPool() {
        HikariConfig config = getConfig();
        try {
            com.zaxxer.hikari.HikariDataSource dataSource = new HikariDataSource(config);
            System.out.println("Connection pool created");
            dataSource.close();
        } catch (Exception e) {
            e.printStackTrace();
}
    }
}