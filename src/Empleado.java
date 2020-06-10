
/**
 * Clase que define a los objetos de tipo Empleado.
 * 
 * @see Persona
 * @author Milton Mariños
 */
public class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;
    private static int contador;

    private Libreria libreria;

    /**
     * Constructor con todos los atributos de la clase.
     * 
     * @param codigo
     * @param nombre
     * @param apellido
     * @param dni
     * @param direccion
     * @param telefono
     * @param email
     */
    public Empleado(String codigo, String nombre, String apellido, String dni, String direccion, String telefono,
            String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Genera un codigo que sirve como identificador unico del empleado. Esta
     * formado por las letras 'EM' + un numero cuyo valor no exede las 6 cifras.
     * 
     * @return Codigo del empleado
     */
    private String generarCodigo() {
        contador++;
        codigo = "EM000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }

    // GETTERS & SETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }

}
