package com.ejemplo.bibliotecafx.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    //private static final String URL = "jdbc:mysql://localhost:3306/baseprueba?serverTimezone=UTC";
    private static final String URL = "jdbc:mysql://127.0.0.1:3307/biblioteca_fx?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

