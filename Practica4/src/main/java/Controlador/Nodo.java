
package Controlador;

public class Nodo<E> {
    private Nodo<E> sig;
    private E principal;
   
   public Nodo(E p){
        this.sig=null;
        this.principal=p;
    }
    
    public Nodo<E> getSiguiente(){
        return sig;
    }
    
    
   public E getDato(){
        return principal;
    }
    
    public void setSig(Nodo<E> sig){
        this.sig=sig;   
    }
    
    public void setPrincipal(E p){
        this.principal = p;
    }
    
    
    
    
    
}
