/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import java.util.ArrayList;

/**
 * Modelo que permite representar un Cine
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class Cine {
    //Atributos
    /**
    * Instancia de Cartelera
    */
    Cartelera cartelera;
    //Atributos
    /**
    * Arreglo que almacena las facturas
    */
    private ArrayList <Factura> facturas;
    
    public Boleta venderBoleta (Pelicula pelicula, Funcion funcion, Usuario usuario){
        if (cartelera.buscarPelicula(pelicula)){
            double costoBase = pelicula.getCostoBase();
            Boleta boletaNueva = new Boleta (pelicula, funcion, usuario);
            boletaNueva.calcularPrecioTotal();
            Venta ventaNueva = new Venta (boletaNueva);
            this.facturas.agregarVenta (venta);
            return boletaNueva;
        }
        return null;
    }
    
    public String generarFactura(Venta venta) {
        if (venta == null) {
            return "No se puede generar la factura";
        }
        
        
    }
}
