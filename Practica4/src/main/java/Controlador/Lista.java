
package Controlador;

/**
 *
 * @author Javir
 */
public class Lista {
    
    private Nodo inicio;
    private Nodo actual;

    public Lista() {
        inicio=null;
        actual=null;
                
    }
    
    
    public void insertar(Object ob){
        Nodo n =new Nodo(ob);
        n.setSig(inicio);
        inicio=n;
        actual=inicio;
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
