package com.example.demo.database.legacypattern;

public class Constant {

    public Constant() {
    }

    public static class DbConstant{
        //setiap driver, memiliki standar format URL sendiri
        public static final String URL = Constant.DbConstant.DB_URL
                + Constant.DbConstant.PATH
                + Constant.DbConstant.DATABASE_NAME ;

        public static final String DB_URL = "jdbc:mysql://";
        public static final String PATH = "localhost:3306/";
        public static final String DATABASE_NAME = "ksp_object_persistence";
        public static final String DB_USERNAME = "root";
        public static final String DB_PASSWORD = "";
    }

}
