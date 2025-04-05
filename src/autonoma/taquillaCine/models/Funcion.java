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
     * Nombre funcion
    */
    protected String nombreFuncion;
    
    /**
     * Inicializa los atributos de la clase Funcion
     * @param porcentajeDescuento
     * @param pelicula
     * @param nombre
     * 
    */
    public Funcion(double porcentajeDescuento, Pelicula pelicula, String nombre) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.pelicula = pelicula;
        this.nombreFuncion = nombre;
    }    

    /**
     * Retorna el porcentaje de descuento
     * @return porcentajeDescuento
    */
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Modifica el porcentaje de descuento
     * @param porcentajeDescuento
    */
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    /**
     * Retorna la instancia de pelicula
     * @return pelicula
    */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Modifica la instancia de pelicula
     * @param pelicula
    */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Retorna el nombre de la funcion
     * @return nombreFuncion
    */
    public String getNombreFuncion() {
        return nombreFuncion;
    }

    /**
     * Modifica el nombre de la funcion
     * @param nombreFuncion
    */
    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }
        
    /**
     * Modela el metodo de calcularDescuento
     * @param costoBase
     * @return float
    */
    public abstract double calcularDescuento (double costoBase);
}
