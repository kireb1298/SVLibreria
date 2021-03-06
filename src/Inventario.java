import java.util.ArrayList;

/**
 * Clase que define el registro de productos, categorias y ofertas que pertenecen a
 * la Libreria.
 * 
 * @author Milton Mariños
 */
public class Inventario {
    // Rerefencias
    // Coleccion de productos
    ArrayList<Producto> productos = new ArrayList<Producto>();
    ArrayList<Oferta> ofertas = new ArrayList<Oferta>();

    // Coleccion de categorias
    ArrayList<Categoria> categorias;

    /**
     * Registra un producto utilizando el constructor completo de la clase.
     * 
     * @param nombre
     * @param descripcion
     * @param marca
     * @param stock       Cantidad de unidades del producto.
     * @param stockMin    Cantidad minima de unidades del producto en el almacen.
     * @param precioXU    Precio por unidad.
     * @param precioXM    Precio al por mayor.
     */
    public void addProducto(Producto p) {
        productos.add(p);
    }

    public void addCategoria(Categoria c) {
        categorias.add(c);

    }

    public void addOferta(Oferta o) {
        ofertas.add(o);
    }

    public void remProducto(Producto p) {
        productos.add(p);
    }

    public void remCategoria(Categoria c) {
        categorias.remove(c);
    }

    public void remOferta(Oferta o) {
        ofertas.remove(o);
    }

    /**
     * Realiza una busqueda utilizando el codigo del producto.
     * 
     * @param c Codigo del producto que deseas buscar.
     * @return Persona encontrada con el codigo que se utilizo como parametro.
     */
    public Producto buscarPr(String c) {
        for (Producto p : productos)
            if (p.getCodigo().equals(c))
                return p;
        return null;
    }

    /**
     * Realiza una busqueda utilizando el codigo de la categoria.
     * 
     * @param c Codigo de la categoria que deseas buscar.
     * @return Categoria encontrada con el codigo que se utilizo como parametro.
     */
    public Categoria buscarCa(String c) {
        for (Categoria e : categorias)
            if (e.getCodigo().equals(c))
                return e;
        return null;
    }

    /**
     * Realiza una busqueda utilizando el codigo de la oferta.
     * 
     * @param c Codigo de la oferta que deseas buscar.
     * @return Oferta encontrada con el codigo que se utilizo como parametro.
     */
    public Oferta buscarOf(String c) {
        for (Oferta o : ofertas)
            if (o.getCodigo().equals(c))
                return o;
        return null;
    }
}
