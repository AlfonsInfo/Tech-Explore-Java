package belajar.database;

public class Constant {
    public static void printException(Exception e)
    {
        System.out.println(e.getMessage());
    }
    public class DatabaseLink
    {
        public static final String JDBC_URL = "jdbc:postgresql://localhost:5432/belajar";

        public static final String USERNAME  = "postgres";

        public static final String PASSWORD = "password";

    }

    public class Message
    {
        public static final String MESSAGE_SUCCESS = "Sukses Bosqu";

        public static final String MESSAGE_FAILED = "Gagal Bosqu";
    }
}
