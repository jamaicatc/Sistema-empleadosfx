module sistemaempleados.empleadosapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens sistemaempleados.empleadosapp to javafx.fxml;
    exports sistemaempleados.empleadosapp;
    opens sistemaempleados.empleadosapp.controller;
    exports sistemaempleados.empleadosapp.controller;
//    opens sistemaempleados.empleadosapp.model;
//    exports sistemaempleados.empleadosapp.model;
}