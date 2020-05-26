import java.sql.Date;
/**
 * Clase que define al comprobante de pago.
 *
 * @author Milton Mariños
 * 
 * Atributos del comprobante de pago.
 * @autor Piero Villarreal
 */
public class Comprobante {
    private String codigo;
    private Date fecha;
    private String moneda;

    public Comprobante(String codigo, Date fecha, String moneda) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.moneda = moneda;
    }    
    
}
