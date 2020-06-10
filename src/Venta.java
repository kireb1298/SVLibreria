import java.util.ArrayList;

/**
 * Clase que define los objetos de tipo Venta
 * 
 * @author Milton Mariños
 */
public class Venta {
    private String codigo;
    private String fecha;
    private double subTotal;
    private double impuesto;
    private double descuento;
    private double total;
    private static double igv;
    private static int contador;

    Empleado empleado;
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    Comprobante comprobante;

    public Venta() {
        this.codigo = generarCodigo();
        this.subTotal = calcSubTotal();
    }

    private String generarCodigo() {
        contador++;
        codigo = "VE000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }

    public void addPedido(Pedido p) {
        pedidos.add(p);
    }

    public double calcSubTotal(){
        double monto = 0;
        for(Pedido p : pedidos){
            monto += p.monto();
        }
        return monto;
    }

    public String getCodigo() {
        return codigo;
    }


    
}
