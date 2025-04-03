/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import java.util.ArrayList;

/**
 * Modelo que permite representar un usuario
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public class Venta {
    
    /**
     * arreglo de boletas
     */
    private ArrayList<Boleta>boletas;
    
    
     /**
     * Inicializa los atributos de la clase Venta
     * 
    */
    public Venta() {
        this.boletas = new ArrayList<>();
    }

    /**
     * Retorna el arreglo de boletas
     * @return boletas
    */
    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

     /**
     * Modifica el arreglo de boletas
     * @param boletas
    */ 
    public void setBoletas(ArrayList<Boleta> boletas) {
        this.boletas = boletas;
    } 
}
