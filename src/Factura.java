import java.util.Date;

/**
 * Clase que define el tipo de comprobante de pago Factura
 * 
 * @see Comprobante
 * @author Milton Mariños
 * @author lopez jose
 */
public class Factura extends Comprobante {
    private String codigo;
    private String ruc;
    private String razonSocial;
    private int contador;

    public Factura(Date fecha, String ruc, String razonSocial) {
        super(fecha);
        this.codigo = generarCodigo();
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }
    
    public String generarCodigo() {
        contador++;
        codigo = "FA000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }

    //GETTERS & SETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    
}
