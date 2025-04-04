/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import autonoma.taquillaCine.exceptions.PrecioFinalInvalidoException;

/**
 * Modelo que permite representar una Boleta
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class Boleta {
    //Atributos
    /**
    * Pelicula elegida
    */
    private Pelicula pelicula;
    /**
    * Funcion elegida
    */
    private Funcion funcion;
    /**
    * Usuario
    */
    private Usuario usuario;
    /**
    * Precio total
    */
    private double precioTotal;
    
    /**
     * Inicializa los atributos de la clase Boleta
     * @param pelicula
     * @param funcion
     * @param usuario
    */
    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        this.precioTotal = 0;
    }
    
    /**
     * Calcula el precio total de la boleta
     * @return double
    */   
    public double calcularPrecioTotal()  throws PrecioFinalInvalidoException {
        precioTotal = this.usuario.aplicarDescuento(pelicula.getCostoBase(), this.funcion);
            if (precioTotal <= 0) {
            throw new PrecioFinalInvalidoException(); 
        }
        return precioTotal;
    }

    /**
     * Retornar la instancia de pelicula
     * @return pelicula
    */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Modificar la instancia de pelicula
     * @param pelicula
    */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Retorna la instancia de funcion
     * @return funcion
    */
    public Funcion getFuncion() {
        return funcion;
    }

    /**
     * Modificar la instancia de funcion
     * @param funcion
    */
    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    /**
     * Retorna la instancia de funcion
     * @return usuario
    */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Modificar la instancia de usuario
     * @param usuario
    */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Retorna el precioTotal
     * @return precioTotal
    */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Modificar el precioTotal
     * @param precioTotal
    */
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
