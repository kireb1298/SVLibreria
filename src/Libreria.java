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
    private String provincia;
    private String distrito;
    private String telefono;
    private String email;

    private RegistroEmpleado rEmpleado; 
    private Inventario inventario;
    private RegistroVenta rVenta;
    private RegistroReclamo rReclamo;

    /**
     * Constructor que inicializa todos los atributos del objeto.
     * 
     * @param ruc
     * @param nombre
     * @param direccion
     * @param region
     * @param provincia
     * @param distrito
     * @param telefono
     */
    public Libreria(String ruc, String nombre, String direccion, String region, String provincia, String distrito,
            String telefono) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.region = region;
        this.provincia = provincia;
        this.distrito = distrito;
        this.telefono = telefono;
        this.rEmpleado = new RegistroEmpleado();
        this.inventario = new Inventario();
        this.rVenta = new RegistroVenta();
        this.rReclamo = new RegistroReclamo();
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

}