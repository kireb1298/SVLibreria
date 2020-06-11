import java.util.HashSet;

public class RegistroVenta implements Sistema {
    private HashSet<Venta> ventas = new HashSet<Venta>();

    public RegistroVenta() {

    }

    public void add(Object v) {
        ventas.add((Venta) v);
    }

    public void remove(Object v) {
        ventas.add((Venta) v);

    }

    public Venta buscar(String c) {
        for (Venta v : ventas) {
            if (v.getCodigo().equals(c))
                return v;
        }
        return null;
    }
}