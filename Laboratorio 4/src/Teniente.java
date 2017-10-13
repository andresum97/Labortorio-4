/**
 * Clase Teniente que hereda de militar
 * @author Andres Urizar
 *
 */
public class Teniente extends Militar
{
	/**
	 * Toma orden del coronel
	 * @param texto
	 */
	public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }
}
