/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import Controlador.*;

/**
 *
 * @author Javir
 */
public class Empleado implements Serializable{
    
    private int id;
    private transient String nombre;
    private float sueldo;
    private float sueldoMax;
    private Fecha fechaAlta;
   
    
    public Empleado(int id,String nombre, float salario,float salarioMax,int anio, int mes, int dia){
        this.nombre=nombre;
        this.sueldo= salario;
        this.id=id;
        this.sueldoMax=salarioMax;
        this.fechaAlta=new Fecha(anio,mes,dia);
    }
    
    public Empleado(String nombre, float salario){
        this.nombre=nombre;
        this.sueldo=salario;
        this.fechaAlta=null;
    }
    
    public Empleado(){
        
    }
    
    public Empleado(int id, float salario){
        this.id=id;
        this.sueldo=salario;
        this.fechaAlta=null;
    }
    
    public static boolean comprobarSueldo(float sueldo,float sueldoMax){
        return (sueldo <= sueldoMax || sueldo>1000);
    }
    
    public static boolean comprobarId(int id){
        return (id<=100 && id>0);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the sueldoMax
     */
    public float getSueldoMax() {
        return sueldoMax;
    }

    /**
     * @param sueldoMax the sueldoMax to set
     */
    public void setSueldoMax(float sueldoMax) {
        this.sueldoMax = sueldoMax;
    }

    /**
     * @return the fechaAlta
     */
    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
}