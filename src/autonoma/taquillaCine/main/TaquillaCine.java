/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.main;

import autonoma.taquillaCine.exceptions.PrecioFinalInvalidoException;
import autonoma.taquillaCine.models.Boleta;
import autonoma.taquillaCine.models.Cartelera;
import autonoma.taquillaCine.models.Cine;
import autonoma.taquillaCine.models.Factura;
import autonoma.taquillaCine.models.Funcion;
import autonoma.taquillaCine.models.FuncionNoche;
import autonoma.taquillaCine.models.FuncionTarde;
import autonoma.taquillaCine.models.Pelicula;
import autonoma.taquillaCine.models.PrimeraFuncion;
import autonoma.taquillaCine.models.Usuario;
import autonoma.taquillaCine.models.UsuarioAdulto;
import autonoma.taquillaCine.models.UsuarioMayor;
import autonoma.taquillaCine.models.UsuarioNino;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Modelo que permite gestionar el proyecto
 * @author Camila
 * @since 20250404
 * @version 1.0
 */
public class TaquillaCine {
    public static void main(String[] args) {
        int opcion;
        Cartelera cartelera = new Cartelera();
        Cine cine = new Cine (cartelera);
        Usuario usuarioNuevo = null;
        Funcion funcion = null;
        ArrayList <Usuario> usuarios;
        
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.println("Bienvenido a la gestion del cine");
            System.out.println("1) Gestionar peliculas");
            System.out.println("2) Mostrar peliculas disponibles");
            System.out.println("3) Gestionar usuario");
            System.out.println("4) Mostrar usuarios");
            System.out.println("5) Vender boleta");
            System.out.println("6) Generar factura");
            System.out.println("7) Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el costo base de la pelicula");
                    double costoBase = teclado.nextDouble();
                    Pelicula peliculaNueva = new Pelicula (nombre, costoBase);
                    if(cine.gestionarPeliculas(peliculaNueva)){
                        System.out.println("Pelicula agregada con exito");
                    }
                    else{
                        System.out.println("La pelicula ya esta en cartelera");
                    }
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("Las peliculas disponibles son: ");
                    ArrayList <Pelicula> peliculas = cartelera.getPeliculas();
                    for (int i = 0; i < peliculas.size(); i++){
                        System.out.println("Pelicula: " + peliculas.get(i).getNombre());
                        System.out.println("Costo base: " + peliculas.get(i).getCostoBase());
                    }
                    System.out.println(" ");
                break;
                case 3:
                    System.out.println("Ingrese su id: ");
                    String id = teclado.nextLine();
                    System.out.println("Ingrese su tipo de usuario: ");
                    System.out.println("1) Nino 2)Adulto 3) Mayor");
                    int tipoUsuario = teclado.nextInt();
                    if(tipoUsuario == 1){
                        usuarioNuevo = new UsuarioNino(id);
                    }
                    else if(tipoUsuario == 2){
                        usuarioNuevo = new UsuarioAdulto(id);
                    }
                    else if(tipoUsuario == 3){
                        usuarioNuevo = new UsuarioMayor(id);
                    }
                    if(cine.agregarUsuario(usuarioNuevo)){
                        System.out.println("Usuario agregado con exito!");
                    }
                    else{
                        System.out.println("El usuario ya se encuentra registrado");
                    }
                    System.out.println(" ");
                break;
                case 4:
                    usuarios = cine.getUsuarios();
                    if (usuarios.isEmpty()){
                        System.out.println("Aun no hay usuarios registrados");
                    }
                    else{
                        System.out.println("Los usuarios son: ");
                        for (int i = 0; i<usuarios.size(); i++){
                            System.out.println("Id usuario: " + usuarios.get(i).getId());
                            System.out.println("Tipo de usuario: " + usuarios.get(i).getTipoUsuario());
                            System.out.println("Descuento: " + usuarios.get(i).getValorDescuento());
                            System.out.println(" ");
                        }
                        System.out.println(" ");
                    }
                break;
                case 5:
                    if (cartelera.getPeliculas().isEmpty()) {
                        System.out.println("No hay peliculas disponibles en cartelera");
                        break;
                    }
                    if (usuarioNuevo == null) {
                        System.out.println("Primero debe registrar un usuario");
                        break;
                    }
                    
                    System.out.println("Ingrese el nombre de la pelicula que desea ver: ");
                    String nombrePelicula = teclado.nextLine();
                    Pelicula peliculaVer = cartelera.obtenerPelicula(nombrePelicula);

                    if (peliculaVer != null) {
                        System.out.println("Ingrese el numero de la funcion: ");
                        System.out.println("1) Primera funcion 2) Funcion tarde 3) Funcion noche");
                        int numeroFuncion = teclado.nextInt();
                        teclado.nextLine(); 

                        switch (numeroFuncion) {
                            case 1:
                                funcion = new PrimeraFuncion(peliculaVer);
                                break;
                            case 2:
                                funcion = new FuncionTarde(peliculaVer);
                                break;
                            case 3:
                                funcion = new FuncionNoche(peliculaVer);
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                funcion = null;
                                break;
                        }

                        if (usuarioNuevo != null && funcion != null) {
                            try {
                                Boleta boletaNueva = cine.venderBoleta(peliculaVer, funcion, usuarioNuevo);
                                System.out.println("Boleta generada con exito!");
                            } catch (PrecioFinalInvalidoException e) {
                                System.out.println("Error al generar la boleta, el costo de la boleta no puede ser menor que 0" + e.getMessage());
                            }
                        } else {
                            System.out.println("Debe ingresar un usuario antes de vender la boleta");
                        }
                    } else {
                        System.out.println("No se encontro la pelicula");
                    }
                    System.out.println(" ");
                break;
                case 6:
                    ArrayList<Factura> facturasGeneradas = cine.getFacturas();
                    if (facturasGeneradas.isEmpty()) {
                        System.out.println("Aun no hay facturas");
                    } else {
                        for (int i = 0; i < facturasGeneradas.size(); i++) {
                            System.out.println("Factura " + (i + 1) + ": ");
                            System.out.println(facturasGeneradas.get(i).generarFactura());
                        }
                    }
                    System.out.println(" ");
                break;
            }
        } while (opcion != 7);
    }
}
