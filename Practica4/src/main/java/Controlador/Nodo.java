
package Controlador;

public class Nodo<E> {
    
    private Object dato;
    private Nodo<E> sig;
    private E principal;
    
   public Nodo(Object dato){
        this.dato=dato;
        this.sig=null;
    }
   
   public Nodo(Object dato, E p){
        this.dato=dato;
        this.sig=null;
        this.principal=p;
    }
    
    public Nodo<E> getSiguiente(){
        return sig;
    }
    
    
   public Object getDato(){
        return dato;
    }
    
    public void setSig(Nodo<E> sig){
        this.sig=sig;   
    }
    
    public E getPrincipal(){
        return principal;
    }
    
    public void setPrincipal(E p){
        this.principal = p;
    }
    
    
    
    
    
}
