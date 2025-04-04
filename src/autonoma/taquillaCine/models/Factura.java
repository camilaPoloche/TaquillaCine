/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import java.util.ArrayList;

/**
 * Modelo que permite representar un decuento si es un adulto
 * @author Mariana
 * @since 20250403
 * @version 1.0
 */
public class Factura {
    //atributos
    /**
     * Arreglo de ventas realizadas
     */
    
    private ArrayList <Venta> ventas;
    
    
    //constructor
     /**
     * Inicializa los atributos de la clase Factura
     * 
    */

    public Factura() {
        this.ventas = new ArrayList<>();
    }

    /**
     * Retorna el arreglo ventas
     * @return ventas
    */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    /**
     * Modifica el arreglo ventas
     * @param ventas
    */ 
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
    /**
     * metodo que me agrega una venta al arreglo ventas
     * @param venta
     * @return 
     */
    public boolean agregarVenta(Venta venta){
        return ventas.add(venta);
    }
    
    
     /**
     * metodo que elimina una venta al arreglo ventas
     * @param boleta
     * @return 
     */
    public boolean eliminarVenta(Boleta boleta) {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getBoleta().equals(boleta)) {
                ventas.remove(i);
                    return true; 
            }
        }
        return false; 
    }
     /**
     * metodo que actualiza una venta al arreglo ventas
     * @param venta
     * @return 
     */
    public boolean actualizarVenta(Venta venta){
        for (int i = 0; i < this.ventas.size(); i++) {
            if (this.ventas.get(i).getBoleta().equals(venta.getBoleta())) {
                this.ventas.set(i, venta); 
                return true;
            }
        }
        return false;
    }

     /**
     * metodo que muestra las ventas del arreglo ventas
     * @return ventas
     */
    public ArrayList mostrarVentas(){
        return ventas;
    }
        
        
    
    
    
    
   
    
   
    
    
    
}
