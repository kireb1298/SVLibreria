import java.util.HashSet;

public class RegistroReclamo implements Sistema {
    private HashSet<Reclamo> reclamos;

    public RegistroReclamo() {
        this.reclamos = new HashSet<Reclamo>();
    }

    @Override
    public void add(Object e) {
        reclamos.add((Reclamo) e);

    }

    @Override
    public void remove(Object e) {
        reclamos.remove((Reclamo) e);

    }

    @Override
    public Reclamo buscar(String c) {
        for (Reclamo r : reclamos)
            if (r.getCodigo().equals(c))
                return r;
        return null;
    }

}