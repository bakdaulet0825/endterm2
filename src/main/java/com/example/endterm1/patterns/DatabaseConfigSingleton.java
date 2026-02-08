package com.example.endterm1.patterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfigSingleton {

    private static DatabaseConfigSingleton instance;
    private Connection connection;
    private final String URL = "jdbc:postgresql://localhost:5432/endterm";
    private final String USER = "postgres"; // поменяй на своего пользователя
    private final String PASSWORD = "your_password"; // поменяй на пароль

    private DatabaseConfigSingleton() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static DatabaseConfigSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConfigSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
