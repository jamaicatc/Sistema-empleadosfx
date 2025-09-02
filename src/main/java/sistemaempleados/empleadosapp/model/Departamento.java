package sistemaempleados.empleadosapp.model;

import sistemaempleados.empleadosapp.model.builder.DepartamentoBuilder;

import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> listaEmpleados;

    public Departamento() {
    }

    public Departamento(String nombre,
                        String codigo,
                        List<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = listaEmpleados;
    }

    public static DepartamentoBuilder builder() {
        return new DepartamentoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

}
