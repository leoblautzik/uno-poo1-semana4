package monedero;

public class Monedero {
	
	private double dinero;
	
	public Monedero(double dineroInicial) {
		this.setDinero(dineroInicial);
	}
	
	public void ponerDinero(double dineroAingresar) {
		this.setDinero(this.getDinero() + dineroAingresar);
	}
	
	public void sacarDinero(double dineroAsacar) {
		if(dineroAsacar <= this.getDinero())
			this.setDinero(this.getDinero() - dineroAsacar);
		else System.out.println("No te alcanza, chabón");
		
	}
	
	public double consultarDineroDisponible() {
		return this.getDinero();
	}

	private double getDinero() {
		return dinero;
	}

	private void setDinero(double dinero) {
		this.dinero = dinero;
	}
	

}
