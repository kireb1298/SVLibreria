import java.util.Date;

/**
 * Clase que define al comprobante de pago.
 *
 * @author Milton Mariños
 * @author Piero Villarreal
 * @author lopez jose
 */
public class Comprobante {
    // Atributos
    private String codigo;
    private Date fecha;
    private String moneda;
    /**
     * Constructor de la clase comprobante con todos los atributos.
     * 
     * @param codigo
     * @param fecha
     * @param moneda
     */
    public Comprobante(String codigo, Date fecha, String moneda) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.moneda = moneda;
    }

    
    
}
