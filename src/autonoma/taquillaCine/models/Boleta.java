/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;
/**
 * Modelo que permite representar una Boleta
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class Boleta {
    //Atributos
    /**
    * Pelicula elegida
    */
    private Pelicula pelicula;
    /**
    * Funcion elegida
    */
    private Funcion funcion;
    /**
    * Usuario
    */
    private Usuario usuario;
    /**
    * Precio total
    */
    private double precioTotal;
    
    /**
     * Calcula el precio total de la boleta
     * @return double
    */
    public double calcularPrecioTotal (){
        double precioTotal = this.usuario.aplicarDescuento(pelicula.getCostoBase(), this.funcion);
        return precioTotal;
    }
}
