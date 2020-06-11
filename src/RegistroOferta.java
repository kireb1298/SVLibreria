import java.util.HashSet;

public class RegistroOferta implements Sistema {
    private HashSet<Oferta> ofertas;

    public RegistroOferta() {
        ofertas = new HashSet<Oferta>();
    }

    @Override
    public void add(Object e) {
        ofertas.add((Oferta) e);

    }

    @Override
    public void remove(Object e) {
        ofertas.remove((Oferta) e);

    }

    /**
     * Realiza una busqueda utilizando el codigo de la oferta.
     * 
     * @param c Codigo de la oferta que deseas buscar.
     * @return Oferta encontrada con el codigo que se utilizo como parametro.
     */
    @Override
    public Oferta buscar(String c) {
        for (Oferta o : ofertas)
            if (o.getCodigo().equals(c))
                return o;
        return null;
    }
}