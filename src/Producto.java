/**
 * Esta clase define a los objetos de tipo Producto
 * 
 * @author Milton Mariños
 */
public class Producto {

    // Atributos
    private String codigo;
    private String nombre;
    private String descripcion;
    private String marca;
    private int stock;
    private int stockMin; // Stock minimo
    private double precioXU; // Precio por unidad
    private double precioXM; // Precio al por mayor
    private static int contador;

    /**
     * Constructor basico del producto
     * 
     * @param nombre
     * @param descripcion
     * @param marca
     */
    public Producto(String nombre, String descripcion, String marca) {
        this.codigo = generarCodigo();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    /**
     * Constructor completo del producto.
     * 
     * @param nombre
     * @param descripcion
     * @param marca
     * @param stock       Cantidad de unidades del producto.
     * @param stockMin    Cantidad minima de unidades del producto en el almacen.
     * @param precioXU    Precio por unidad.
     * @param precioXM    Precio al por mayor.
     */
    public Producto(String nombre, String descripcion, String marca, int stock, int stockMin, double precioXU,
            double precioXM) {
        this.codigo = generarCodigo();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.stockMin = stockMin;
        this.precioXU = precioXU;
        this.precioXM = precioXM;
    }

    /**
     * Genera un codigo que sirve como identificador unico del producto. Esta
     * formado por las letras 'PR' + un numero cuyo valor no exede las 6 cifras.
     * 
     * @return Codigo del producto
     */
    private String generarCodigo() {
        contador++;
        codigo = "PR000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }

    public String getCodigo() {
        return codigo;
    }
}
