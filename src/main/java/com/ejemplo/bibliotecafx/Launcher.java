package com.ejemplo.bibliotecafx;

import com.ejemplo.bibliotecafx.conexion.ConexionDB;
import javafx.application.Application;

import java.sql.Connection;
import java.sql.SQLException;

public class Launcher {
    public static void main(String[] args) {
        try (Connection conn = ConexionDB.obtenerConexion()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexión exitosa a biblioteca_fx en el puerto 3307.");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}