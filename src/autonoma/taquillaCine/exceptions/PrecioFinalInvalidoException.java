/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquillaCine.exceptions;

/**
 *
 * @author maria
 */
public class PrecioFinalInvalidoException extends Exception {
    
    public PrecioFinalInvalidoException(){
        super("El precio de la excepcion debe de ser mayor a 0");
    }
    
}
