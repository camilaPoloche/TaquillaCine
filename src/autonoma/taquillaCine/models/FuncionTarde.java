/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;
/**
 * Modelo que permite representar una funcion de cine - Funcion tarde
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class FuncionTarde extends Funcion{
    /**
     * Inicializa la clase FuncionTarde
     * @param pelicula
    */
    public FuncionTarde(Pelicula pelicula){
        super (0.1, pelicula);
    }
   
    /**
     * Sobreescribe el metodo de calcularDescuento
     * @param costoBase
     * @return double
    */
    @Override
    public double calcularDescuento(double costoBase) {
        double descuento = costoBase * this.porcentajeDescuento;
        double precioFinal = costoBase - descuento;
        return precioFinal;
    }
}
