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
    private Date fecha;
    private static String MONEDA = "SOLES";

    /**
     * Constructor de la clase comprobante con todos los atributos.
     * 
     * @param fecha
     */
    public Comprobante(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public static String getMONEDA() {
        return MONEDA;
    }

}
