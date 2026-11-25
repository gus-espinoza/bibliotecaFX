package com.ejemplo.bibliotecafx.dao;

import java.util.List;

public interface ILIbroDao {
    public List<Libro> listarTodos();
    public void insertar();
    public void actualizar();
    public void eliminar();

}
