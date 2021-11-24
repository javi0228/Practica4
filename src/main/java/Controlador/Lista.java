
package Controlador;

/**
 *
 * @author Javir
 * @param <E>
 */
public class Lista<E> {
    
    private Nodo<E> inicio;
    private Nodo<E> actual;

    public Lista() {
        inicio=null;
        actual=null;
                
    }
    
    
    public void insertar(E p){
        Nodo<E> n =new Nodo(p);
        n.setSig(inicio);
        inicio=n;
        actual=inicio;
    }
    
    public void mostrarLista(){
        Nodo<E> aux = this.inicio;
        while(aux != null){
            System.out.println(aux.getDato().toString());
            aux=aux.getSiguiente();
        }
    }
    
   public void avanzar(){
        actual=actual.getSiguiente();
    }
   
   public Nodo getInicio(){
       return inicio;
   }
    
    
    public void retroceder(){
    
        Nodo aux=inicio;
        
        while (aux.getSiguiente()!=actual) {
            
            aux=aux.getSiguiente();
        }
        
        actual=aux;
        
    }
    
    public Nodo getActual(){
        return actual;
    }
    
    
    public boolean primero(){
        return (actual==inicio);
    }
    
   public boolean ultimo(){
        return (actual.getSiguiente()==null );
    }
   
   public Object getObjeto(Lista elemento){
       
       if (elemento.getActual()==inicio){
           return inicio.getDato();
       }else if(elemento.ultimo()){
           return elemento.getActual().getDato();
           
       }else{
           Nodo aux=inicio;
           
           while(elemento.getActual()!=aux){
               aux=aux.getSiguiente();
           }
           return aux.getDato();
       }
   }
    
    
}
