/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;
/**
 * Modelo que permite representar una funcion de cine - Funcion noche
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class FuncionNoche implements Funcion{
    //Constante
    /**
    * Porcentaje de descuento 
    */
    private final double PORCENTAJE_DESCUENTO = 0;
    /**
     * Inicializa la clase FuncionNoche
    */
    public FuncionNoche() {
    }
    
    /**
     * Sobreescribe el metodo de calcularDescuento
     * @param costoBase
     * @return double
    */
    @Override
    public double calcularDescuento(double costoBase) {
        double descuento = costoBase * this.PORCENTAJE_DESCUENTO;
        double precioFinal = costoBase - descuento;
        return precioFinal;
    }
}
