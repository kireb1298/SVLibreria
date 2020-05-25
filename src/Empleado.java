

/**
 * Clase que define a los objetos de tipo Empleado.
 * 
 * @see Persona
 * @author Milton Mariños
 */
public class Empleado extends Persona {
    private String codigo;
    private static int contador;

    private Libreria libreria;

    /**
     * Constuctor de la clase empleado con todos sus atributos.
     * 
     * @param dni
     * @param nombre
     * @param apellido
     * @param direccion
     * @param codigo
     */
    public Empleado(String dni, String nombre, String apellido, String direccion, Libreria libreria) {
        super(dni, nombre, apellido, direccion);
        this.libreria = libreria;
        this.codigo = generarCodigo();
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


    public void realizarVenta(){
        Venta v = new Venta();
        
    }
    //GETTERS & SETTERS
    public String getCodigo() {
        return codigo;
    }

}
