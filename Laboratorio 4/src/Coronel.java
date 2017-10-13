
public class Coronel extends Militar
{
	public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
