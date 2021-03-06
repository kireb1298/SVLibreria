/**
 * Clase que define los objetos de tipo Pedido. Esta conformado por el producto
 * y la cantidad a vender.
 * 
 * @author Milton Mariños
 */
public class Pedido {
    int cantidad;
    
    Producto producto;
    Cliente cliente;

    public Pedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double monto(){
        if(cantidad > producto.getCantPrecioXM())
            return producto.getPrecioXM() * cantidad;
        return producto.getPrecioXU() * cantidad;
    }

}