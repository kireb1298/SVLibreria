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
    private double cantPrecioXM; // Cantidad minima que se requiere para acceder al precio de por mayor
    private static int contador;

    /**
     * Constructor de la clase que contiene todos los atributos
     * 
     * @param nombre
     * @param descripcion
     * @param marca
     * @param stock
     * @param stockMin     Stock minimo
     * @param precioXU     Precio por unidad
     * @param precioXM     precio de la unidad al por mayor
     * @param cantPrecioXM Cantidad minima que se requiere para acceder al precio de
     *                     por mayor
     */
    public Producto(String nombre, String descripcion, String marca, int stock, int stockMin, double precioXU,
            double precioXM, double cantPrecioXM) {
        this.codigo = getCodigo();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.stockMin = stockMin;
        this.precioXU = precioXU;
        this.precioXM = precioXM;
        this.cantPrecioXM = cantPrecioXM;
    }

    /**
     * Genera un codigo que sirve como identificador unico del producto. Esta
     * formado por las letras 'PR' + un numero cuyo valor no exede las 6 cifras.
     * 
     * @return Codigo del producto
     */
    public static String generarCodigo() {
        contador++;
        String codigo = "PR000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }


    // Getters & Setters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public double getPrecioXU() {
        return precioXU;
    }

    public void setPrecioXU(double precioXU) {
        this.precioXU = precioXU;
    }

    public double getPrecioXM() {
        return precioXM;
    }

    public void setPrecioXM(double precioXM) {
        this.precioXM = precioXM;
    }

    public double getCantPrecioXM() {
        return cantPrecioXM;
    }

    public void setCantPrecioXM(double cantPrecioXM) {
        this.cantPrecioXM = cantPrecioXM;
    }

    

}
