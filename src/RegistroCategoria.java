import java.util.HashSet;

public class RegistroCategoria implements Sistema {

    private HashSet<Categoria> categorias;

    public RegistroCategoria() {
        categorias = new HashSet<Categoria>();
    }

    @Override
    public void add(Object e) {
        categorias.add((Categoria) e);

    }

    @Override
    public void remove(Object e) {
        categorias.remove((Categoria) e);
    }

    /**
     * Realiza una busqueda utilizando el codigo de la categoria.
     * 
     * @param c Codigo de la categoria que deseas buscar.
     * @return Categoria encontrada con el codigo que se utilizo como parametro.
     */
    public Categoria buscar(String c) {
        for (Categoria e : categorias)
            if (e.getCodigo().equals(c))
                return e;
        return null;
    }

}