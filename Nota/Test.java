public class Test{

    public static void main(String[] args){

        Nota parcial1Ana = new Nota(3);
        Nota parcial1Javier =new Nota(7);

        System.out.println(parcial1Ana.obtenerValor());
        System.out.println(parcial1Ana.aprobado()); 
        System.out.println(parcial1Javier.aprobado()); 
        
        parcial1Ana.recuperar(8);
        
        
        System.out.println(parcial1Ana.aprobado()); 


    }

}
