package com.ejemplo.bibliotecafx.dao;

import java.util.List;

public interface ILibroDao {
    public List<Libro> listarTodos();
    public void insertar(Libro libro);
    public void actualizar(Libro libro);
    public void eliminar(Integer id);

}
