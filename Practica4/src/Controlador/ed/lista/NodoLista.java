/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.ed.lista;

/**
 *
 * @author alejandro
 */
public class NodoLista<E> {
    private E info;
    private NodoLista<E> sig;

    public NodoLista() {
        this.info = null;
        this.sig = null;
    }

    public NodoLista(E info, NodoLista<E> sig) {
        this.info = info;
        this.sig = sig;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public NodoLista<E> getSig() {
        return sig;
    }

    public void setSig(NodoLista<E> sig) {
        this.sig = sig;
    }
}

