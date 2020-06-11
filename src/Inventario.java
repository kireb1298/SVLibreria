import java.util.ArrayList;

/**
 * Clase que define el registro de productos, categorias y ofertas que
 * pertenecen a la Libreria.
 * 
 * @author Milton Mariños
 */
public class Inventario {
    private RegistroProducto registroP;
    private RegistroCategoria registroC;
    private RegistroOferta registroO;

    public Inventario() {
        registroP = new RegistroProducto();
        registroC = new RegistroCategoria();
        registroO = new RegistroOferta();
    }
}
