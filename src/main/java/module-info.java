module sistemaempleados.empleadosapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens sistemaempleados.empleadosapp to javafx.fxml;
    exports sistemaempleados.empleadosapp;
}