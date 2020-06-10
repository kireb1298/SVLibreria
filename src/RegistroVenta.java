import java.util.HashSet;

public class RegistroVenta {
    private HashSet<Venta> ventas = new HashSet<Venta>();

    public RegistroVenta() {

    }

    public void add(Venta v) {
        ventas.add(v);
    }

    public void remove(Venta v) {
        ventas.add(v);

    }

    public Venta buscar(String c) {
        for (Venta v : ventas) {
            if (v.getCodigo().equals(c))
                return v;
        }
        return null;
    }
}