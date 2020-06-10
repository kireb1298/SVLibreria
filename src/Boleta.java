import java.util.Date;

/**
 * 
 * @see Comprobante
 * @author Milton Mariños
 * @author Piero Villarreal
 */
public class Boleta extends Comprobante {
        private String codigo;
        private String dni;
        private static int contador;

        public Boleta(String dni) {
                super();
                this.codigo = generarCodigo();
                this.dni = dni;
        }

        public String generarCodigo() {
                contador++;
                codigo = "CFA000000";
                return codigo.substring(0, 8 - String.valueOf(contador).length()) + contador;
        }
}
