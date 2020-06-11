import java.util.HashSet;

public class RegistroProducto implements Sistema {
    HashSet<Producto> productos;

    public RegistroProducto() {
        productos = new HashSet<Producto>();
    }

    @Override
    public void add(Object e) {
        this.productos.add((Producto) e);

    }

    @Override
    public void remove(Object e) {
        this.productos.remove((Producto) e);

    }

    @Override
    public Producto buscar(String c) {
        for (Producto p : productos)
            if (p.getCodigo().equals(c))
                return p;
        return null;
    }

}