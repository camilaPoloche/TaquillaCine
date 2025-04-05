/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.models;

import java.util.ArrayList;
/**
 * Modelo que permite representar una cartelera de cine
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
    
    /**
     * Mostrar el arreglo de peliculas
     * @return peliculas
    */
    public ArrayList mostrarPeliculas (){
        return this.peliculas;
    }
    
    /**
     * Buscar una pelicula en el arreglo
     * @param pelicula
     * @return boolean
    */
    public boolean buscarPelicula (Pelicula pelicula){
        for (int i = 0; i < this.peliculas.size(); i++){
            if (pelicula.getNombre().equals(peliculas.get(i).getNombre())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Buscar una pelicula en el arreglo y retornarla
     * @param pelicula
     * @return Pelicula
    */
    public Pelicula obtenerPelicula (String pelicula){
        for (int i = 0; i < this.peliculas.size(); i++){
            if(pelicula.equals(this.peliculas.get(i).getNombre())){
                return this.peliculas.get(i);
            }
        }
        return null;
    }
    
    /**
     * Agregar una pelicula nueva al arreglo
     * @param pelicula
     * @return boolean
    */
    public boolean agregarPelicula (Pelicula pelicula){
        if (buscarPelicula(pelicula)){
            return false;
        }
        this.peliculas.add(pelicula);
        return true;
    }
    
    /**
     * Eliminar una pelicula del arreglo
     * @param pelicula
     * @return boolean
    */
    public boolean eliminarPelicula (Pelicula pelicula){
        if (buscarPelicula(pelicula)){
            this.peliculas.remove(pelicula);
            return true;
        }
        return false;
    }
    
    /**
     * Actualizar una pelicula del arreglo
     * @param pelicula
     * @return boolean
    */
    public boolean actualizarPelicula(Pelicula pelicula) {
        for (int i = 0; i < this.peliculas.size(); i++) {
            if (this.peliculas.get(i).getNombre().equals(pelicula.getNombre())) {
                this.peliculas.set(i, pelicula); 
                return true;
            }
        }
        return false;  
    }

    /**
     * Retornar el arreglo de peliculas
     * @return peliculas
    */
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    /**
     * Modificar el arreglo de peliculas
     * @param peliculas
    */
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
