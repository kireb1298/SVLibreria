import java.util.HashSet;

/**
 * Clase que almacena y administra la coleccion de empleados.
 * 
 * @author Milton Mariños
 */
public class RegistroEmpleado {
    private HashSet<Empleado> empleados = new HashSet<Empleado>();

    /**
     * Metodo que registra un empleado del sistema.
     * 
     * @param e Empleado a registrar
     */
    public void add(Empleado e) {
        empleados.add(e);
    }

    /**
     * Metodo que elimina a un empleado del sistema.
     * 
     * @param e Empleado a eliminar
     */
    public void remove(Empleado e) {
        empleados.remove(e);
    }

    /**
     * Metodo que realiza la busqueda de un empleado en base a su codigo.
     * 
     * @param c dni del empleado que desea buscar
     * @return Si el empleado es encontrado se devuelve la direccion en memoria, en
     *         caso contrario, se devuelve null.
     */
    public Empleado buscar(String c) {
        for (Empleado e : empleados)
            if (e.getCodigo().equals(c))
                return e;
        return null;
    }

    /**
     * Metodo que retorna el numero de empleados registrados en el sistema.
     * 
     * @return Numero de empleados registrados en el sistema
     */
    public int size() {
        return empleados.size();
    }
}