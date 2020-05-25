public class ProductoStock {

    private int stock;
    private int stockMin; // Stock minimo
    private double precioXU; // Precio por unidad
    private double precioXM; // Precio al por mayor
    // Referencias
    Producto producto;

    public ProductoStock(int stock, int stockMin, double precioXU, double precioXM, Producto producto) {
        this.stock = stock;
        this.stockMin = stockMin;
        this.precioXU = precioXU;
        this.precioXM = precioXM;
        this.producto = producto;
    }

    /**
     * Metodo que envia mensaje cuando el stock actual ha sido reducido al minimo
     * @return El 
     */

}
