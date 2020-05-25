/**
 * Clase que define los objetos de tipo Venta. La venta es realizada por
 * un empleado y la referencia es guardada en la clase Libreria.
 * 
 * @author Milton Mariños
 */
public class Venta {
    private String codigo;
    private double subTotal;
    private double impuesto;
    private double total;
    private static double igv;
    private static int contador;

    Empleado empleado;
    Cliente cliente;

    private String generarCodigo() {
        contador++;
        codigo = "VE000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }
}
