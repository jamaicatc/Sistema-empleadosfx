package sistemaempleados.empleadosapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sistemaempleados.empleadosapp.model.Empleado;
import sistemaempleados.empleadosapp.factory.ModelFactory;
import sistemaempleados.empleadosapp.services.IContribuyente;

public class EmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarEmpleado(ActionEvent event) {
        agregarEmpleado();
    }

    @FXML
    void initialize() {

    }

    private void agregarEmpleado() {
        String nombre = txtNombre.getText();
        String id = txtId.getText();
        if (nombre == null || nombre.isEmpty() || id == null || id.isEmpty()) {
            txtResultado.setText("Nombre e ID son obligatorios");
            return;
        }
        Empleado empleado = ModelFactory.crearEmpleado(nombre, id);
        txtResultado.setText(empleado.toString());
    }

    public void registrarContribucion(IContribuyente contribuyente) {
        if (contribuyente == null) {
            txtResultado.setText("No se puede contribuir: objeto nulo");
            return;
        }
        contribuyente.contribuir();
        txtResultado.setText("Contribución registrada correctamente");
    }
}
