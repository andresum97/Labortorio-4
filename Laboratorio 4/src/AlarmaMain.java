
public class AlarmaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		alarmaIncendio.m1();                  // emergencia 1
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		System.out.println(alarmaIncendio);   // emergencia Ring…Ring…Ring…Ring	
		/**Alarma miReloj = new Alarma(); 
		System.out.println(miReloj); 
		miReloj.m1(); 
		miReloj.m2();		*/
	}
}
