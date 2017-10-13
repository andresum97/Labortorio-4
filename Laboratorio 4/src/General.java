/**
 * Clase general que hereda de Militar
 * @author Andres Urizar
 *
 */
public class General extends Militar
{	
		/**
		 * Devuelve dias de vacaciones
		 * @return dias de vacaciones
		 */
	 	public int getDiasVacaciones() {
	        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
	    }
	 	/**
	 	 * Devuelve formulario de vacaciones
	 	 * @return formulario de vacaciones
	 	 */
	    public String getFormularioVacaciones() {
	        return "rosado";
	    }
	    /**
	     * Muestra mensaje de estrategia
	     */
	    public void planificaEstrategia() {
	        System.out.println("Llevaremos tres divisiones a la frontera!");
	    }
}
