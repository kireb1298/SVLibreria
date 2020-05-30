import java.util.Date;

/**
 * Clase que define al comprobante de pago.
 *
 * @author Milton Mariños
 * @author Piero Villarreal
 * @author Lopez Jose
 */
public class Comprobante {
    // Atributos
    private Date fecha;
    private String nombreCliente;
    private String apellidoCliente;
    private static String MONEDA = "SOLES";

    private Venta venta;
    /**
     * Constructor de la clase comprobante con todos los atributos.
     * 
     */
    public Comprobante() {
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

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
}
