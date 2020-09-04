public class Test{

    public static void main(String [] args){

       TarjetaBaja myBaja = new TarjetaBaja(100);
       myBaja.pagarViajeEnSubte();
       myBaja.cargar(20);
       System.out.println(myBaja.obtenerSaldo());

       // seguir probando todos los métodos de la class

    }
}
