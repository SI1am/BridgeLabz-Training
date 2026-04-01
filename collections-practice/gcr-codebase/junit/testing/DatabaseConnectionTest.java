// package Junit.Test.demo;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import Junit.Test.DatabaseConnection;

class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnection() {
        assertTrue(db.isConnected());
    }
}
