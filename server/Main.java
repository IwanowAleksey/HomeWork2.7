package ru.geekbrains.homework7.server;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            new Server();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
