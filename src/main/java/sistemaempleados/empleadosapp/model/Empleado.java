package sistemaempleados.empleadosapp.model;

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

}
