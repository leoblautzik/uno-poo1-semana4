package monedero;

public class Test {

	public static void main(String[] args) {
		
		Monedero monederito = new Monedero(1000);
		
		monederito.ponerDinero(500);
		System.out.println(monederito.consultarDineroDisponible());
		
		monederito.sacarDinero(1600);
		monederito.ponerDinero(200);
		monederito.sacarDinero(1600);
		System.out.println(monederito.consultarDineroDisponible());
		
	}

}
