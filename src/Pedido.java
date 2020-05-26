/**
 * Clase que define los objetos de tipo Pedido. Esta conformado por el producto
 * y la cantidad a vender.
 * 
 * @author Milton Mariños
 */
public class Pedido {
    Producto producto;
    int cantidad;

    public Pedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double montoTotal(){
        if(cantidad > producto.getCantPrecioXM())
            return producto.getPrecioXM() * cantidad;
        return producto.getPrecioXU() * cantidad;
    }

}