
import java.util.ArrayList;

/**
 * Esta clase contiene la informacion general de la libreria.
 * 
 * @author Milton Mariños
 */
public class Libreria {
    // Atributos
    private String ruc;
    private String nombre;
    private String direccion;
    private String region;
    private String distrito;
    private String telefono;

    private Inventario inventario;
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    /**
     * Constructor que contiene todos los atributos de la clase.
     * 
     * @param ruc
     * @param nombre
     * @param direccion
     * @param region
     * @param distrito
     * @param telefono
     */
    public Libreria(String ruc, String nombre, String direccion, String region, String distrito, String telefono) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.region = region;
        this.distrito = distrito;
        this.telefono = telefono;
    }

    /**
     * Metodo que registra los datos de un empleado en el sistema.
     * 
     * @param dni
     * @param nombre
     * @param apellido
     * @param direccion
     */
    public void addEmpleado(String dni, String nombre, String apellido, String direccion) {
        Empleado e = new Empleado(dni, nombre, apellido, direccion, this);
        empleados.add(e);
    }

    public void addVenta(Venta v) {
        ventas.add(v);
    }

    /**
     * Metodo que elimina a un empleado del sistema.
     * 
     * @param e Empleado a eliminar
     */
    public void delEmpleado(Empleado e) {
        empleados.remove(e);
    }

    /**
     * Metodo que elimina una venta del registro del sistema.
     * 
     * @param v Venta a eliminar
     */
    public void delVenta(Venta v) {
        ventas.remove(v);
    }

    /**
     * Metodo que realiza la busqueda de un empleado en base a su codigo
     * 
     * @param c codigo del Empleado que se desea buscar
     * @return Si el empleado es encontrado se devuelve la direccion en memoria, en
     *         caso contrario, se devuelve null.
     */
    public Empleado buscarE(String c) {
        for (Empleado e : empleados)
            if (e.getCodigo().equals(c))
                return e;
        return null;
    }

    // GETTERS & SETTERS
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Libreria [direccion=" + direccion + ", distrito=" + distrito + ", empleados=" + empleados + ", nombre="
                + nombre + ", region=" + region + ", ruc=" + ruc + ", telefono=" + telefono + "]";
    }

}