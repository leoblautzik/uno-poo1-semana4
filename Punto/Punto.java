package punto;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
		
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean estaSobreX() {
		return (this.getY() == 0);
	}
	
	public boolean estaSobreY() {
		return (this.getX() == 0);
	}
	
	public boolean esElOrigen() {
		return this.estaSobreX() && this.estaSobreY();		
	}

	public double distancia(Punto otroPunto) {
		return Math.sqrt(Math.pow(this.x - otroPunto.x, 2)+
				Math.pow(this.y - otroPunto.y, 2));
	}
	
	public static double distancia(Punto unPunto, Punto otroPunto) {
			return Math.sqrt(Math.pow(unPunto.x - otroPunto.x,2) + 
				Math.pow(unPunto.y - otroPunto.y,2));
	}
	
	
}
