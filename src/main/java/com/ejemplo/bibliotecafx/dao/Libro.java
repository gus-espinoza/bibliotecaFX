package com.ejemplo.bibliotecafx.dao;

public class Libro {

    private Integer id;
    private String isbn;
    private String titulo;
    private String autor;
    private String categoria;
    private Integer anio_publicacion;
    private Integer copias;

    public Libro() {
    }

    public Libro(Integer id, String isbn, String titulo, String autor, String categoria, Integer anio_publicacion, Integer copias) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anio_publicacion = anio_publicacion;
        this.copias = copias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(Integer anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", anio=" + anio_publicacion +
                ", copias=" + copias +
                '}';
    }
}
