/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.odenacion;

import Controlador.ed.lista.Exception.PosicionException;
import Controlador.ed.lista.Exception.VacioException;
import Controlador.ed.lista.ListaEnlazada;

/**
 *
 * @author jostin
 */
public class MergeSort<E extends Comparable<E>> {

    public ListaEnlazada<E> mergeSort(ListaEnlazada<E> lista, int orden) {
        if (lista.size() <= 1) {
            return lista;
        }

        int mitad = lista.size() / 2;

        ListaEnlazada<E> listaIzquierda = new ListaEnlazada<>();
        for (int i = 0; i < mitad; i++) {
            try {
                listaIzquierda.insertarNodo(lista.get(i));
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        ListaEnlazada<E> listaDerecha = new ListaEnlazada<>();
        for (int i = mitad; i < lista.size(); i++) {
            try {
                listaDerecha.insertarNodo(lista.get(i));
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        listaIzquierda = mergeSort(listaIzquierda, orden);
        listaDerecha = mergeSort(listaDerecha, orden);

        if (orden == 0) {
            return mergeAscendente(listaIzquierda, listaDerecha);
        } else {
            return mergeDescendente(listaIzquierda, listaDerecha);
        }
    }

    private ListaEnlazada<E> mergeAscendente(ListaEnlazada<E> listaIzquierda, ListaEnlazada<E> listaDerecha) {
        ListaEnlazada<E> listaOrdenada = new ListaEnlazada<>();
        int i = 0; // Índice para recorrer la lista izquierda
        int j = 0; // Índice para recorrer la lista derecha

        while (i < listaIzquierda.size() && j < listaDerecha.size()) {
            try {
                int comparacion = listaIzquierda.get(i).compareTo(listaDerecha.get(j));

                if (comparacion <= 0) {
                    listaOrdenada.insertarNodo(listaIzquierda.get(i));
                    i++;
                } else {
                    listaOrdenada.insertarNodo(listaDerecha.get(j));
                    j++;
                }
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        // Agregar los elementos restantes de la lista izquierda (si los hay)
        while (i < listaIzquierda.size()) {
            try {
                listaOrdenada.insertarNodo(listaIzquierda.get(i));
                i++;
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        // Agregar los elementos restantes de la lista derecha (si los hay)
        while (j < listaDerecha.size()) {
            try {
                listaOrdenada.insertarNodo(listaDerecha.get(j));
                j++;
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        return listaOrdenada;
    }

    private ListaEnlazada<E> mergeDescendente(ListaEnlazada<E> listaIzquierda, ListaEnlazada<E> listaDerecha) {
        ListaEnlazada<E> listaOrdenada = new ListaEnlazada<>();
        int i = 0; // Índice para recorrer la lista izquierda
        int j = 0; // Índice para recorrer la lista derecha

        while (i < listaIzquierda.size() && j < listaDerecha.size()) {
            try {
                int comparacion = listaDerecha.get(j).compareTo(listaIzquierda.get(i));

                if (comparacion <= 0) {
                    listaOrdenada.insertarNodo(listaIzquierda.get(i));
                    i++;
                } else {
                    listaOrdenada.insertarNodo(listaDerecha.get(j));
                    j++;
                }
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        // Agregar los elementos restantes de la lista izquierda (si los hay)
        while (i < listaIzquierda.size()) {
            try {
                listaOrdenada.insertarNodo(listaIzquierda.get(i));
                i++;
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        // Agregar los elementos restantes de la lista derecha (si los hay)
        while (j < listaDerecha.size()) {
            try {
                listaOrdenada.insertarNodo(listaDerecha.get(j));
                j++;
            } catch (PosicionException | VacioException e) {
                e.printStackTrace();
            }
        }

        return listaOrdenada;
    }
}

