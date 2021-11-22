/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.*;
import static Controlador.IFecha.AÑO;
import static Controlador.IFecha.DIA_DEL_MES;
import static Controlador.IFecha.MES_DEL_AÑO;
import java.util.GregorianCalendar;
/**
 *
 * @author Rubén Martín
 */
public class Programador extends Empleado implements IFecha{
    
    private float SueldoExtra;
    private int horasExtra;
    
    public Programador(int id, String nombre, float salario, float salarioMax, int anio, int mes, int dia, float extra, int horas) {
        super(id, nombre, salario, salarioMax, anio, mes, dia);
        this.SueldoExtra=extra;
        this.horasExtra=horas;
    }
    
    public Programador(int id, float salario){
        super(id, salario);
        this.SueldoExtra=0;
        this.horasExtra=0;
    }

    public Programador() {
        
    }

    /**
     * @return the SueldoExtra
     */
    public float getSueldoExtra() {
        return SueldoExtra;
    }

    /**
     * @param SueldoExtra the SueldoExtra to set
     */
    public void setSueldoExtra(float SueldoExtra) {
        this.SueldoExtra = SueldoExtra;
    }

    /**
     * @return the horasExtra
     */
    public int getHorasExtra() {
        return horasExtra;
    }

    /**
     * @param horasExtra the horasExtra to set
     */
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    public static boolean comprobarHorasExtras(int horas){
        return horas>0;
    }
    
    public static boolean comprobarSueldoExtra(float sueldo, float sueldoMax, float sueldoExtra){
        return sueldoExtra>0&&(sueldoExtra+sueldo)<=sueldoMax;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Horas extras: "+getHorasExtra()+"\n Sueldo extra: "+getSueldoExtra(); 
    }
    
    
    
    @Override
    public int dia()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(DIA_DEL_MES);
  }
    @Override
  public int mes()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(MES_DEL_AÑO)+1;
  }
    @Override
  public int año()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(AÑO);
  }
    
}
