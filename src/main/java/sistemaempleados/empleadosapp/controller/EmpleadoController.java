package sistemaempleados.empleadosapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sistemaempleados.empleadosapp.model.Empleado;

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
        Empleado empleado = new Empleado();
        empleado.setNombre(txtNombre.getText());
        empleado.setId(txtId.getText());

        txtResultado.setText(empleado.toString());
    }
}
