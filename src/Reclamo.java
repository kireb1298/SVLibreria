import java.sql.Date;
/**
 * Clase que define los Reclamos solicidados por los Clientes y verificados por el Comprobante de Pago.
 *
 * @author Piero Villarreal
 */
public class Reclamo {
    private String codigo;
    private String observacion;
    private Date fecha;
    private int contador;

    public Reclamo(String codigo, String observacion, int contador) {
        this.codigo = codigo;
        this.observacion = observacion;
        this.contador = contador;
    }
    
    /**
     * Genera un codigo que sirve como identificador unico del reclamo. Esta
     * formado por las letras 'RE' + un numero cuyo valor no exede las 6 cifras.
     *
     * @return Codigo del reclamo
     */
    private String generarCodigo() {
        contador++;
        codigo = "RE000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }
     public String getCodigo() {
        return codigo;
    }


    
    
    
    
    
    
}
