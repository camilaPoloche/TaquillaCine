/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import java.util.ArrayList;

/**
 * Modelo que permite representar una pelicula
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public class Pelicula {
    //atributos 
    
    /**
     * nombre de la pelicula
     */
    private String nombre;
    
    /**
     * costo base de la pelicula
     */
    private double costoBase;
    
    /**
     * arreglo de funciones
     */
    
    private ArrayList<Funcion>funciones;
    
    /**
     * Inicializa los atributos de la clase pelicula
     * @param nombre
     * @param costoBase
     * @param funciones
     * 
    */
    public Pelicula(String nombre, double costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
        this.funciones = new ArrayList<>();
    }
    
    /**
     * Retorna el nombre de la pelicula
     * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la pelicula
     * @param nombre
    */ 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Retorna el costo base de la pelicula
     * @return costoBase
    */
    public double getCostoBase() {
        return costoBase;
    }

    /**
     * Modifica el costo base de la pelicula
     * @param costoBase
    */ 
    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
    
    /**
     * Retorna el arreglo de funciones
     * @return funciones
    */
    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }
    
    /**
     * Modifica el arreglo de funciones
     * @param funciones
    */ 
    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }  
}
