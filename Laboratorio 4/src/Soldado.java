/**
 * Clase Soldado que crea el objeto soldado que hereda de Militar
 * @author Andres Urizar
 *
 */
public class Soldado extends Militar
{
	/**
	 * Devuelve horas
	 * @return horas del soldado
	 */
	public int getHoras()
	{
		return super.getHoras()*2;
	}
	/**
	 * Devuelve salario
	 * @return salario
	 */
	public double getSalario()
	{
		return super.getSalario()-10000;
	}
	/**
	 * Devuelve dias de vacaciones
	 * @return dias de vacaciones
	 */
	public int getDiasVacaciones()
	{
		return super.getDiasVacaciones()/2;
	}
	/**
	 * Devuelve mensaje de orden
	 * @return mensaje de Orden
	 */
	public String recibeOrden()
	{
		return "Ordene mi general";
	}
}
