
public class AlarmaEmergencia extends Alarma
{
	public void m1() {
		System.out.println("emergencia 1");
	}
	 
	public void m2() {
		super.m1();
		super.m2();
	}
	 
	public String toString() {
		m1();
		return super.toString();
	}
}
