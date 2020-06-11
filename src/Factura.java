

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

    public Factura(String ruc, String razonSocial) {
        super();
        this.codigo = generarCodigo();
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }
    
    /**
     * Genera un codigo que sirve como identificador unico del empleado. Esta
     * formado por las letras 'CFA' + un numero cuyo valor no exede las 6 cifras.
     * 
     * @return Codigo de la Factura
     */
    public String generarCodigo() {
        contador++;
        codigo = "CFA000000";
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
