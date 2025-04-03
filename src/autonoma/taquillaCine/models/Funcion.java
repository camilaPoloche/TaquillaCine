/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

/**
 * Modelo que permite representar una funcion de cine
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public abstract class Funcion { 
    //Atributos
    /**
     * Porcentaje de descuento
    */
    protected double porcentajeDescuento;
    /**
     * Instancia de pelicula
    */
    protected Pelicula pelicula;
    
    /**
     * Inicializa los atributos de la clase Funcion
     * @param porcentajeDescuento
     * @param pelicula
     * 
    */
    public Funcion(double porcentajeDescuento, Pelicula pelicula) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.pelicula = pelicula;
    }    
    
    /**
     * Modela el metodo de calcularDescuento
     * @param costoBase
     * @return float
    */
    public abstract double calcularDescuento (double costoBase);
}
