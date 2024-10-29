/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STE
 */
public class Nodo {
    private String Dato;
    //punteros para mi pila
    private Nodo Arriba;
    private Nodo Abajo;

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public Nodo getArriba() {
        return Arriba;
    }

    public void setArriba(Nodo Arriba) {
        this.Arriba = Arriba;
    }

    public Nodo getAbajo() {
        return Abajo;
    }

    public void setAbajo(Nodo Abajo) {
        this.Abajo = Abajo;
    }    
}
