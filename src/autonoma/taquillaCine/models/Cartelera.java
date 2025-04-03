/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import java.util.ArrayList;

/**
 * Modelo que permite representar una funcion de cine
 * @author Camila
 * @since 20250402
 * @version 1.0
 */
public class Cartelera {
    //Atributos
    /**
    * Arreglo que almacena las peliculas
    */
    private ArrayList <Pelicula> peliculas;

    /**
     * Inicializa los atributos de la clase Cartelera
    */
    public Cartelera() {
        this.peliculas = new ArrayList<>();
    }
    
    public ArrayList mostrarPeliculas (){
        return this.peliculas;
    }
    
    public boolean buscarPelicula (Pelicula pelicula){
        for (int i = 0; i < this.peliculas.size(); i++){
            if (pelicula.getNombre().equals(peliculas.get(i).getNombre())){
                return true;
            }
        }
        return false;
    }
    
    public boolean agregarPelcula (Pelicula pelicula){
        if (buscarPelicula(pelicula)){
            return false;
        }
        this.peliculas.add(pelicula);
        return true;
    }
    
    public boolean eliminarPelicula (Pelicula pelicula){
        if (buscarPelicula(pelicula)){
            this.peliculas.remove(pelicula);
            return true;
        }
        return false;
    }
    
    public boolean actualizarPelicula(Pelicula pelicula) {
        for (int i = 0; i < this.peliculas.size(); i++) {
            if (this.peliculas.get(i).getNombre().equals(pelicula.getNombre())) {
                this.peliculas.set(i, pelicula); 
                return true;
            }
        }
        return false;  
    }
}
