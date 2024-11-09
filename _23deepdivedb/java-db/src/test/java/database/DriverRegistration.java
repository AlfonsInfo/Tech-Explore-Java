package database;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.*;

public class DriverRegistration {

    @Test
    void testDriverRegistration() {
        // Test the driver registration
        Driver postgresDriver = new org.postgresql.Driver();
        try {
            DriverManager.registerDriver(postgresDriver);
        } catch (SQLException e) {
            Assertions.fail("Driver registration failed");
        }
    }


}
