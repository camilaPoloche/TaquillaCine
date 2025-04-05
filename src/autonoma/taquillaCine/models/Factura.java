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
     * Metodo que me agrega una venta al arreglo ventas
     * @param venta
     * @return 
     */
    public boolean agregarVenta(Venta venta){
        return ventas.add(venta);
    }
    
    /**
     * Metodo que elimina una venta al arreglo ventas
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
     * Metodo que actualiza una venta al arreglo ventas
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
     * Metodo que muestra las ventas del arreglo ventas
     * @return ventas
    */
    public ArrayList mostrarVentas(){
        return ventas;
    }
    
    /**
     * Metodo que genera la factura
     * @return String
    */
    public String generarFactura() {
        StringBuilder facturaMostrar = new StringBuilder();
        double total = 0;

        facturaMostrar.append("       FACTURA DE COMPRA         \n");

        if (ventas.isEmpty()) {
            facturaMostrar.append("Aun no hay ventas \n");
            return facturaMostrar.toString();
        }

        Boleta primeraBoleta = ventas.get(0).getBoleta();
        Usuario usuario = primeraBoleta.getUsuario();
        
        facturaMostrar.append("ID usuario: ").append(usuario.getId()).append("\n");
        facturaMostrar.append("Tipo de usuario: ").append(usuario.getTipoUsuario()).append("\n");
        facturaMostrar.append("Descuento segun Usuario: ").append(usuario.getValorDescuento()).append("\n");

        facturaMostrar.append("Boleta comprada: \n");

        for (int i = 0; i < ventas.size(); i++) {
            Venta venta = ventas.get(i);
            Boleta boleta = venta.getBoleta();
            Pelicula pelicula = boleta.getPelicula();
            Funcion funcion = boleta.getFuncion();

            facturaMostrar.append("   Pelicula: ").append(pelicula.getNombre()).append("\n");
            facturaMostrar.append("   Funcion: ").append(funcion.getNombreFuncion()).append("\n");
            facturaMostrar.append("   Descuento por funcion: ").append(funcion.getPorcentajeDescuento()).append("\n");
            facturaMostrar.append("   Costo base de la pelicula: ").append(pelicula.getCostoBase()).append("\n");
            facturaMostrar.append("   Precio total: ").append(boleta.getPrecioTotal()).append("\n\n");

            total += boleta.getPrecioTotal();
        }

        facturaMostrar.append("Total a pagar: ").append(total).append("\n");

        return facturaMostrar.toString();
    }
}
