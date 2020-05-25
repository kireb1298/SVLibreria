/**
 *@author Milton Mariños 
 */
public class Categoria {
    private String codigo;
    private String nombre;
    private String descripcion;
    private static int contador;

    public Categoria(String nombre, String descripcion) {
        this.codigo = generarCodigo();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    private String generarCodigo(){
        contador++;
        codigo = "CA000000";
        return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
}
