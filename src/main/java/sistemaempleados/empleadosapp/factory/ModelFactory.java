package sistemaempleados.empleadosapp.factory;

import sistemaempleados.empleadosapp.model.Empleado;
import sistemaempleados.empleadosapp.model.Gerente;

public class ModelFactory {
    public static Empleado crearEmpleado(String nombre, String id) {
        return new Empleado(nombre, id, null);
    }

    public static Gerente crearGerente(String nombre, String id) {
        return new Gerente(); // Se puede extender para pasar parámetros
    }
}
