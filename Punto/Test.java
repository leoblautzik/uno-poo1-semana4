package punto;

public class Test {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(100, 200);
		Punto p2 = new Punto(400, 800);
		
		System.out.println(Punto.distancia(p1,p2));
		System.out.println(p1.distancia(p2));
		
		

	}

}
