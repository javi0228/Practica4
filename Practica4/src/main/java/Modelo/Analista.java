/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rubén Martín
 */
public class Analista extends Empleado{
    
    private float plus;
    private String dni;

    public Analista(int id, String nombre, float salario, float salarioMax, int anio, int mes, int dia, float plus, String dni) {
        super(id, nombre, salario, salarioMax, anio, mes, dia);
        this.plus=plus;
        this.dni=dni;
    }
    
    public Analista(int id, float salario){
        super(id, salario);
        this.plus=0;
        this.dni=null;
    }
    
    public void setPlus(float plus){
        this.plus=plus;
    }
    
    public float getPlus(){
        return this.plus;
    }
    
    public void setDNI(String dni){
        this.dni=dni;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public static boolean comprobarNif(String dni){
        
        int numeros=0, letras=0;
        
        if(dni.length()!=9){
            return false;
        }
        for(int i=0;i<dni.length();i++){
            if(dni.charAt(i)>'a' || dni.charAt(i)<'z'){
                letras++;
            } else {
                numeros++;
            }
                
        }
        
        if(dni.charAt(8)>'a' || dni.charAt(8)<'z'){
           return true;
        } else {
            return false;
        }
       
    }
}
