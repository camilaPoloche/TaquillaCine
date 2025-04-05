/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;
/**
 * Modelo que permite representar un decuento si es un adulto
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public class UsuarioAdulto extends Usuario {
    /**
     * Inicializa la clase Usuarioadulto
     * @param id
    */
    public UsuarioAdulto(String id){
        super(0, "Usuario adulto", id);
    }
    /**
     * Metodo abstracto aplicar descuento
     * @param costoBase
     * @param funcion
     * @return double
    */

    @Override
    public double aplicarDescuento(double costoBase, Funcion funcion) {
        double precioConDescuento = funcion.calcularDescuento(costoBase);
        double precioFinalAdulto = precioConDescuento - this.valorDescuento;
        
        return precioFinalAdulto;
    }
}
