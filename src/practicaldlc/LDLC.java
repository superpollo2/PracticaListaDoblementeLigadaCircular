/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaldlc;

import javax.swing.JOptionPane;

/**
 *
 * @author laura.tascon
 */
public class LDLC extends NodoDoble {
    //lista doblemente ligada circular

    private NodoDoble primero;
    private NodoDoble ultimo;

    LDLC() {
        primero = null;
        ultimo = null;
    }

    public boolean esVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public NodoDoble primerNodo() {
        return primero;
    }

    public NodoDoble ultimoNodo() {
        return ultimo;
    }

    public boolean finDeRecorrido(NodoDoble p) {
        return p == primero;
        //return p.retornaLigaDer() == primero;
    }

    public void mostrarLista() {//de izquierda a derecha
        NodoDoble p;
        p = primerNodo();
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "No es posible \nLa lista se encuentra vacía");
            return;
        }
        String dato = "";
        do {

            dato += " " + p.retornaDato() + ", ";
            p = p.retornaLigaDer();
        } while (!finDeRecorrido(p));
        System.out.println(dato);
        JOptionPane.showMessageDialog(null, dato);

    }

    public void anterior(int d) {
        int p;
        NodoDoble h;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "No es posible \nLa lista se encuentra vacía");
            return;
        }
        h = buscarDato(d);
        System.out.println(h);
        if (h == null) {
            JOptionPane.showMessageDialog(null, "el dato no se encuentra");
        } else {
            if (h == primero) {

            }
            p = h.retornaLigaIzq().retornaDato();
            System.out.println(p);
            JOptionPane.showMessageDialog(null, "el dato anterior a " + d + " es: " + p);
        }
    }

    public NodoDoble buscarDondeInsertar(int d) {
        NodoDoble p;
        NodoDoble y;

        p = primerNodo();
        if (d< p.retornaDato()) {
            return p;
        } else {

            y = p;
            p = p.retornaLigaDer();

            while ((!finDeRecorrido(p)) && (d > p.retornaDato())) {
                y = p;
                p = p.retornaLigaDer();
            }
            System.out.println("esto quedo valiendo y " + p.retornaLigaIzq().retornaDato());
            return y;

        }

    }

    public void insertar(int d) {
        NodoDoble x = new NodoDoble(d);
        NodoDoble h;
        if (esVacia()) {
            primero = x;
            ultimo = x;
            x.asignaLigaDer(x);
            x.asignaLigaIzq(x);
            System.out.println(x.retornaDato());
            return;
        }
        if (primero.retornaDato()> x.retornaDato()) {
            conectarAntes(x, primero);
        } else if (ultimo.retornaDato() < x.retornaDato()) {
            conectarDespues(x, ultimo);
        } else {
            h = buscarDondeInsertar(d);
            System.out.println(h);
            conectarDespues(x, h);
        }

    }

    public void conectar(NodoDoble x, NodoDoble y) {
        int sw = 0;
        x.asignaLigaDer(y.retornaLigaDer());
        x.asignaLigaIzq(y);
        y.asignaLigaDer(x);
        x.retornaLigaDer().asignaLigaIzq(x);
        if (y == ultimo) {//inserta al final de la lista
            ultimo = x;
        }
        if (y == null) {//incerta al inicio de la lista        
            primero = y;
        }
    }

    public NodoDoble buscarDato(int d) {
        NodoDoble p;
        p = primerNodo();

        if (d == p.retornaDato()) {
            JOptionPane.showMessageDialog(null, "El dato se encuentra en la lista");
            return p;
        } else {

            do {
                p = p.retornaLigaDer();
            } while (!finDeRecorrido(p) && (d != p.retornaDato()));

            if (d==p.retornaDato()) {//si fue encontrado el dato 
                return p;//retorna el nodo donde esta el dato
            }

            if (p == primero) {
                JOptionPane.showMessageDialog(null, "El dato no se encuentra en la lista");
                return null;
            }
            return p;
        }

    }

    public void borrar(NodoDoble x) {//borrar nodo
        if (x == null) {
            System.out.println("El dato no se encuentra en la lista.");
        } else {
            desconectar(x);
            mostrarLista();
        }
    }

    public void desconectar(NodoDoble x) {
        if (x == primero) {//nodo a desconectar es el primero
            primero = x.retornaLigaDer();
            if (primero == null) {//la lista esta vacia
                ultimo = null;
            }
        }

        if (x == ultimo) {//nodo a desconectar es el ultimo
            ultimo = x.retornaLigaIzq();

        }
        x.retornaLigaIzq().asignaLigaDer(x.retornaLigaDer());
        x.retornaLigaDer().asignaLigaIzq(x.retornaLigaIzq());
    }

    public void conectarAntes(NodoDoble x, NodoDoble y) {//x nodo a insertar, y nodo antes del cual se quiere insertar
        if (esVacia()) {
            primero = x;
            ultimo = x;
            x.asignaLigaDer(x);
            x.asignaLigaIzq(x);
            return;
        } else {

            if (y == primero) {
                primero = x;
            }

            x.asignaLigaIzq((y.retornaLigaIzq()));
            x.asignaLigaDer(y);
            y.retornaLigaIzq().asignaLigaDer(x);
            y.asignaLigaIzq(x);
        }
    }

    public void conectarDespues(NodoDoble x, NodoDoble y) {//x nodo a insertar, y nodo despues del cual se quiere insertar
        if (esVacia()) {
            primero = x;
            ultimo = x;
            x.asignaLigaDer(x);
            x.asignaLigaIzq(x);
            return;
        } else {
            if (y == ultimo) {
                ultimo = x;
            }
            x.asignaLigaIzq(y);
            x.asignaLigaDer(y.retornaLigaDer());
            y.asignaLigaDer(x);
            x.retornaLigaDer().asignaLigaIzq(x);
        }
    }

    public void insertarPrimero(int d) {
        NodoDoble p;
        p = primerNodo();
        NodoDoble y = new NodoDoble();
        y.asignaDato(d);
        conectarAntes(y, p);
        JOptionPane.showMessageDialog(null, "el dato fue agregado exitosamente");
    }

    public void insertarUltimo(int d) {
        NodoDoble p;
        p = ultimoNodo();
        NodoDoble y = new NodoDoble();
        y.asignaDato(d);
        conectarDespues(y, p);
        JOptionPane.showMessageDialog(null, "el dato fue agregado exitosamente");
    }

    public NodoDoble anteriorx(NodoDoble p) {
        return p.retornaLigaIzq();
    }

    public void ordenarDescendentemente() {

        NodoDoble p;
        NodoDoble k;
        NodoDoble j;
        p= primerNodo();

        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "No es posible \nLa lista se encuentra vacía");
            return;
        }
        do {
            k = p;
            j = k.retornaLigaDer();
            while (!finDeRecorrido(j)) {
                if (j.retornaDato() > k.retornaDato()) {
                    k = j;
                }
                j = j.retornaLigaDer();

            }
            
            if(k==p){
                
            }else{
            desconectar(k);
            conectarAntes(k, p);
            }
            p= k.retornaLigaDer();    
            
        } while (!finDeRecorrido(p));
        mostrarLista();
    }

    public void intercambiarConsecutivos() {
        NodoDoble p;
        NodoDoble q;
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "No es posible \nLa lista se encuentra vacía");
            return;
        }
        p = primerNodo();
        q = p.retornaLigaDer();
        do {
            desconectar(p);
            conectarDespues(p, q);
            p = p.retornaLigaDer();
            q = p.retornaLigaDer();
        } while (!finDeRecorrido(p));
        mostrarLista();
    }

    public void eliminarLista() {
        primero = null;
        ultimo = null;
        JOptionPane.showMessageDialog(null, "La lista ha sido eliminada");
    }
}
