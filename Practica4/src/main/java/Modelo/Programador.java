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
