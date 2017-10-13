/**
 * Clase de coronel que hereda de Militar
 * @author Andres Urizar
 *
 */
public class Coronel extends Militar
{
	/**
	 * Devuelve el salario
	 * @return Salario
	 */
	public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    /**
     * Ejecuta una orden
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
