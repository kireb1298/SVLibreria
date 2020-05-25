/**
 * Clase que define los objetos de tipo Venta, la venta es realizada por
 * empleado y registrado el sistema de la libreria
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
