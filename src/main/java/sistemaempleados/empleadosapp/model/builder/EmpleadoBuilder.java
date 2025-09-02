package sistemaempleados.empleadosapp.model.builder;

import sistemaempleados.empleadosapp.model.Departamento;

public class EmpleadoBuilder{
    protected String nombre;
    protected String id;
    protected Departamento departamento;

    public EmpleadoBuilder nombre (String nombre) {
        this.nombre = nombre;
        return this;
    }
    public EmpleadoBuilder id (String id){
        this.id = id;
        return this;
    }
    public EmpleadoBuilder departamento (Departamento departamento) {
        this.departamento = departamento;
        return this;
    }
}