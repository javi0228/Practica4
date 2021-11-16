
package Controlador;

public class Nodo {
    
    private Object dato;
    private Nodo sig;
    
   public Nodo(Object dato){
        this.dato=dato;
        this.sig=null;
    }
    
    public Nodo getSiguiente(){
        return sig;
    }
    
    
   public Object getDato(){
        return dato;
    }
    
    public void setSig(Nodo sig){
        this.sig=sig;
        
        
    }
    
    
    
    
    
}
