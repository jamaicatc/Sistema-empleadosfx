package sistemaempleados.empleadosapp.model;

import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsigandos;

    public Proyecto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Empleado> getEmpleadosAsigandos() {
        return empleadosAsigandos;
    }

    public void setEmpleadosAsigandos(List<Empleado> empleadosAsigandos) {
        this.empleadosAsigandos = empleadosAsigandos;
    }
}
