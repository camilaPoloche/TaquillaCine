/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;
/**
 * Modelo que permite representar una venta
 * @author Mariana
 * @since 20250402
 * @version 1.0
 */
public class Venta {
    //Atributos
    /**
     * boleta de tipo Boleta (instancia de boleta)
    */
    private Boleta boleta;

    /**
     * Inicializa los atributos de la clase Venta
     * @param boleta
    */
    public Venta(Boleta boleta) {
        this.boleta = boleta;
    }

    /**
     * Retorna el una boleta
     * @return boleta
    */
    public Boleta getBoleta() {
        return boleta;
    }
    
    /**
     * Modifica una boleta
     * @param boleta
    */
    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }
}
