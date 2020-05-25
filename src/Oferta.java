import java.sql.Date;

/**
 * Clase que define las Ofertas que se aplican unicamente a las Categorias
 * registradas en el inventario.
 *
 * @author Milton Mariños
 */
public class Oferta {

    private String codigo;
    private String descripcion;
    private double descuento;
    private Date fechaI;
    private Date fechaF;
    private boolean status;
    private static int contador;

    public Oferta(String descripcion, double descuento, Date fechaI, Date fechaF) {
        this.codigo = generarCodigo();
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
    }

    /**
     * Genera un codigo que sirve como identificador unico de la oferta. Esta
     * formado por las letras 'OF' + un numero cuyo valor no exede las 6 cifras.
     *
     * @return Codigo de la oferta
     */
    private String generarCodigo() {
        contador++;
        codigo = "OF000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }

    public String getCodigo() {
        return codigo;
    }

}
