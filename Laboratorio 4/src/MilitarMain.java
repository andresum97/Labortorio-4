/**
 * Clase MilitarMain que es el principal
 * @author Andres Urizar
 *
 */
public class MilitarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Militar militar = new Militar();
		Soldado soldado = new Soldado();
		System.out.println("Horas de trabajo Militar: "+militar.getHoras());
		System.out.println("Salario Militar: "+militar.getHoras());
		System.out.println("Salario Militar: "+militar.getDiasVacaciones());
		System.out.println("Horas de trabajo Soldado: "+soldado.getHoras());
		System.out.println("Salario Soldado: "+soldado.getHoras());
		System.out.println("Salario Soldado: "+soldado.getDiasVacaciones());		
	}

}
