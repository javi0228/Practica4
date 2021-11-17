/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.*;
/**
 *
 * @author Rubén Martín
 */
public class Analista extends Empleado implements IFecha{
    
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
    
    public static boolean comprobarDni(String dni){
        
        int contChar=0,contNum=0;
        
        if(dni.length()!=9)
            return false;
        
        
        for (int i = 0; i < dni.length(); i++) {
            
            if(dni.charAt(i)>='0' && dni.charAt(i)<='9')
                contNum++;
            
            if((dni.charAt(i)>='a' && dni.charAt(i)<='z')||(dni.charAt(i)>='A' && dni.charAt(i)<='Z'))
                contChar++;
            
        }
        
        if((contChar==1 && contNum==8) && (dni.charAt(8)>='a' && dni.charAt(8)<='z')||(dni.charAt(8)>='A' && dni.charAt(8)<='Z'))
            return true;
        else
            return false;
    }

    @Override
    public int dia() {
        return IFecha.DIA_DEL_MES; 
    }

    @Override
    public int mes() {
        return IFecha.MES_DEL_AÑO;
    }

    @Override
    public int año() {
        return IFecha.AñO;
    }
}
