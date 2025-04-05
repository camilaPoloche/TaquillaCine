/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import autonoma.taquillaCine.exceptions.PrecioFinalInvalidoException;
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
    /**
     * Arreglo que almacena las facturas
    */
    private ArrayList <Factura> facturas;
    /**
     * Arreglo que almacena los usuarios
    */
    private ArrayList <Usuario> usuarios;
    
    /**
     * Inicializa los atributos de la clase Cine
     * @param cartelera
    */
    public Cine(Cartelera cartelera) {
        this.cartelera = cartelera;
        this.facturas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Retorna el arreglo de facturas
     * @return facturas
    */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Modifica el arreglo de facturas
     * @param facturas
    */ 
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
    /**
     * Metodo de vender boleta
     * @param pelicula
     * @param funcion
     * @param usuario
     * @throws PrecioFinalInvalidoException
     * @return boletaNueva
    */   
    public Boleta venderBoleta (Pelicula pelicula, Funcion funcion, Usuario usuario) throws PrecioFinalInvalidoException{
        if (cartelera.buscarPelicula(pelicula)){
            double costoBase = pelicula.getCostoBase();
            Boleta boletaNueva = new Boleta (pelicula, funcion, usuario);
            boletaNueva.calcularPrecioTotal();
            Venta ventaNueva = new Venta (boletaNueva);
            Factura facturaNueva = new Factura();
            facturaNueva.agregarVenta(ventaNueva);
            this.facturas.add (facturaNueva);
            return boletaNueva;
        }
        return null;
    }
    
    /**
     * Metodo de genestionar peliculas
     * @param pelicula
     * @return boolean
    */
    public boolean gestionarPeliculas (Pelicula pelicula){
        if(this.cartelera.agregarPelicula(pelicula)){
            return true;
        }
        return false;
    }
    
    /**
     * Metodo de generar factura
     * @param id
     * @return boletaNueva
    */
    public String generarFactura (String id){
        for (int i = 0; i < this.facturas.size(); i++){
            if (this.facturas.get(i).getVentas().get(i).getBoleta().getUsuario().getId().equals(id)){
                String factura = this.facturas.get(i).generarFactura();
                return factura;
            }
        }
        return null;
    }
    
    /**
     * Metodo de buscar un usuario por su id
     * @param id
     * @return boolean
    */
    public boolean buscarUsuario(String id){
        for (int i = 0; i < this.usuarios.size(); i++){
            if (this.usuarios.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo de agregar usuario
     * @param usuario
    */
    public boolean agregarUsuario(Usuario usuario) {
        if(buscarUsuario(usuario.getId())){
            return false;
        }
        this.usuarios.add(usuario);
        return true;
    }

    /**
     * Retorna el arreglo de usuarios
     * @return usuarios
    */
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    /**
     * Metodo que retorna un usuario existente del arreglo
     * @param id
     * @return usuario
    */
    public Usuario obtenerUsuarioPorId(String id) {
        for(int i = 0; i < this.usuarios.size(); i++){
            if(this.usuarios.get(i).getId().equals(id)) {
                return this.usuarios.get(i);
            }
        }
        return null;
    }
}
