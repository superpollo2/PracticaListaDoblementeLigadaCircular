/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaldlc;

/**
 *
 * @author laura.tascon
 */
public class NodoDoble {
    private int dato;
    private NodoDoble ligaIzquierda;
    private NodoDoble ligaDerecha;
    
    NodoDoble(){
    }
    
    NodoDoble(int dato){
        this.dato=dato;
        ligaIzquierda = null;
        ligaDerecha = null;
    }
    
    public int retornaDato(){
        return dato;
    }
    
    public NodoDoble retornaLigaIzq(){
        return ligaIzquierda;
    }
    
    public NodoDoble retornaLigaDer(){
        return ligaDerecha;
    }
    
    public void asignaDato(int d){
        dato = d;
    }
    
    public void asignaLigaIzq(NodoDoble x){
        ligaIzquierda = x;
    }
    
    public void asignaLigaDer(NodoDoble x){
        ligaDerecha = x;
    }
}
