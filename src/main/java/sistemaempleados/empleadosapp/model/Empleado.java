package sistemaempleados.empleadosapp.model;

import sistemaempleados.empleadosapp.model.builder.EmpleadoBuilder;

public class Empleado{
    private String nombre;
    private String id;
    private Departamento departamento;

    public Empleado() {
    }

    public Empleado(String nombre,
                    String id,
                    Departamento departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }
    public static EmpleadoBuilder builder() {
        return new EmpleadoBuilder();
    }
    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    @Override
    public String toString() {
        return "Empleado: " + nombre + " | ID: " + id + (departamento != null ? " | Departamento: " + departamento.getNombre() : "");
    }

}