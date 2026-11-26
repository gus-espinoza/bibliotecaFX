package com.ejemplo.bibliotecafx.controller;

import com.ejemplo.bibliotecafx.dao.BdLibroDao;
import com.ejemplo.bibliotecafx.dao.Libro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Objects;

public class BibliotecaController {
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtIsbn;
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtAutor;
    @FXML
    private ComboBox cmbCategorias;
    @FXML
    private TextField txtAnioPubliacion;
    @FXML
    private TextField txtCopiasDisponibles;
    @FXML
    private TextField txtBuscar;
    @FXML
    private TableView <Libro>tableLibro;
    @FXML
    private TableColumn <Object, Object>colId;
    @FXML
    private TableColumn <Object, Object>colIsbn;
    @FXML
    private TableColumn <Object, Object>colTitulo;
    @FXML
    private TableColumn <Object, Object>colAutor;
    @FXML
    private TableColumn <Object, Object>colCategorias;
    @FXML
    private TableColumn <Object, Object>colAnioPublicacion;
    @FXML
    private TableColumn <Object, Object>colCopiasDisponibles;
    @FXML
    private Label lblMensaje;
    @FXML
    private Label lblResumen;

    private final BdLibroDao dao = new BdLibroDao();


    ObservableList<Libro> listaLibros = FXCollections.observableArrayList();
    @FXML
    public void initialize(){
        cmbCategorias.getItems().addAll("Programacion",
                                                    "Ficcion",
                                                    "Historia",
                                                    "Ciencia",
                                                    "Arte");
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colIsbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colCategorias.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colAnioPublicacion.setCellValueFactory(new PropertyValueFactory<>("anio_publicacion"));
        colCopiasDisponibles.setCellValueFactory(new PropertyValueFactory<>("copias"));
        cargarProductos();
    }
    private void cargarProductos(){
        tableLibro.getItems().setAll(dao.listarTodos());

    }
    @FXML
    private void onBuscar() {

    }

    @FXML
    private void onVerTodos() {

    }

    @FXML
    private void onGuardar( ) {

    }
    @FXML
    private void onActualizar( ) {

    }

    @FXML
    private void onEliminar( ) {

    }

    @FXML
    private void onLimpiar( ) {

    }
}
