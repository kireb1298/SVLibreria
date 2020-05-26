public class Gerente extends Empleado {

    public Gerente(String dni, String nombre, String apellido, String direccion, Libreria libreria) {
        super(dni, nombre, apellido, direccion, libreria);
    }
    
    public void registrarProducto(String nombre, String descripcion, String marca, int stock, int stockMin,
            double precioXU, double precioXM, int cantPrecioXM){
        Producto p = new Producto(nombre, descripcion, marca, stock, stockMin, precioXU, precioXM, cantPrecioXM);
        this.getLibreria().getInventario().addProducto(p);
    }
}