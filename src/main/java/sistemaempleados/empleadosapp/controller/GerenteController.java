package sistemaempleados.empleadosapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sistemaempleados.empleadosapp.model.Gerente;
import sistemaempleados.empleadosapp.services.IContribuyente;

public class GerenteController {

    @FXML
    private Button btnCalcularBonificacion;

    @FXML
    private Button btnRegistrarContribucion;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onCalcularBonificacion(ActionEvent event) {
        String nombre = txtNombre.getText();
        String id = txtId.getText();
        if (nombre == null || nombre.isEmpty() || id == null || id.isEmpty()) {
            txtResultado.setText("Nombre e ID son obligatorios");
            return;
        }
        Gerente gerente = new Gerente();
        // Si quieres guardar nombre e id, puedes usar setters o el constructor si lo extiendes
        // gerente.setNombre(nombre); gerente.setId(id); // Si existen los métodos
        double bonificacion = calcularBonificacion(gerente);
        txtResultado.setText("Bonificación para gerente: " + bonificacion);
    }

    @FXML
    void onRegistrarContribucion(ActionEvent event) {
        Gerente gerente = new Gerente();
        registrarContribucion(gerente);
    }

    public double calcularBonificacion(Gerente gerente) {
        if (gerente == null) return 0;
        // Bonificación base, puede ser extendida por subclases
        return 1000.0;
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
