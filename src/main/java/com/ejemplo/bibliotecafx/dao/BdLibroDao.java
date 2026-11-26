package com.ejemplo.bibliotecafx.dao;

import com.ejemplo.bibliotecafx.conexion.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BdLibroDao implements ILibroDao {

    public List<Libro> listarTodos() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT id, isbn, titulo, autor, categoria, anio_publicacion, copias FROM libro";
        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                libros.add(new Libro(
                        rs.getInt("id"),
                        rs.getString("isbn"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("categoria"),
                        rs.getInt("anio_publicacion"),
                        rs.getInt("copias")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }

    @Override
    public void insertar(Libro libro) {
            String sql = "INSERT INTO libro( id,  isbn,  titulo,  autor,  categoria,  anio_publicacion,  copias) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (Connection con = ConexionDB.obtenerConexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, libro.getId());
                ps.setString(2, libro.getIsbn());
                ps.setString(3, libro.getTitulo());
                ps.setString(4, libro.getAutor());
                ps.setString(5, libro.getCategoria());
                ps.setInt(6, libro.getAnio_publicacion());
                ps.setInt(7, libro.getCopias());
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    @Override
    public void actualizar(Libro libro) {
            String sql = "UPDATE libro SET isbn = ?, titulo = ?, autor = ?, categoria = ?, anio_publicacion = ?, copias = ? WHERE id = ?";
            try (Connection con = ConexionDB.obtenerConexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, libro.getIsbn());
                ps.setString(2, libro.getTitulo());
                ps.setString(3, libro.getAutor());
                ps.setString(4, libro.getCategoria());
                ps.setInt(5, libro.getAnio_publicacion());
                ps.setInt(6, libro.getCopias());
                ps.setInt(7, libro.getId());
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    @Override
    public void eliminar(Integer id) {
            String sql = "DELETE FROM libro WHERE id = ?";
            try (Connection con = ConexionDB.obtenerConexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
