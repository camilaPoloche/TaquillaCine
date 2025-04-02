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
public interface Funcion {
    /**
     * Modela el metodo de calcularDescuento
     * @param costoBase
     * @return float
    */
    public abstract double calcularDescuento (double costoBase);
}
