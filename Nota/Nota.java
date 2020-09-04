public class Nota{

    private int nota;

    public Nota(int valor){
        this.setNota(valor);
    }
    
    private int getValor(){
        return this.nota;
    }

    private void setNota(int valor){
        if(valor >= 0 && valor <=10)
            this.nota=valor;
        else System.out.println("Valor Incorrecto");
    }

    public int obtenerValor(){
        return this.getValor();
    }

    /*public boolean aprobado(){
      if (this.nota>=4 && this.nota<=10)
      return true;
      return false;
      }*/

    public boolean aprobado(){
        return (this.nota>=4 && this.nota<=10);
    }    
    
    public boolean desaprobado(){
        return !this.aprobado();
    }

    public void recuperar(int nuevoValor){
        if(nuevoValor>this.nota)
            setNota(nuevoValor);
    }


}
