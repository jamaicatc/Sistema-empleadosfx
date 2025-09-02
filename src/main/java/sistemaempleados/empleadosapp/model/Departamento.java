package sistemaempleados.empleadosapp.model;

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
    public void getCodigo(String codigo) {
        this.codigo = codigo;
    }
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}