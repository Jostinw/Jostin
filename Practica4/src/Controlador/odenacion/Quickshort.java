/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.odenacion;

import Controlador.ed.lista.ListaEnlazada;
import Controlador.ed.lista.NodoLista;
import java.util.List;

/**
 *
 * @author jostin
 */
public class Quickshort {

    public static <E extends Comparable<E>> void quickSortAscendente(List<E> lista, Integer tipo) {
        quickSortHelper(lista, 0, lista.size() - 1, tipo);
    }

    private static <E extends Comparable<E>> void quickSortHelper(List<E> lista, int inicio, int fin, Integer tipo) {
        if (inicio < fin) {
            int indiceParticion = particion(lista, inicio, fin, tipo);
            quickSortHelper(lista, inicio, indiceParticion - 1, tipo);
            quickSortHelper(lista, indiceParticion + 1, fin, tipo);

        }
    }

    private static <E extends Comparable<E>> int particion(List<E> lista, int inicio, int fin, Integer tipo) {
        E pivote = lista.get(fin);
        int indiceParticion = inicio;

        for (int i = inicio; i < fin; i++) {

            if (tipo == 0) {
                if (lista.get(i).compareTo(pivote) <= 0) {
                    intercambiar(lista, indiceParticion, i);
                    indiceParticion++;
                }

            } else {
                if (lista.get(i).compareTo(pivote) >= 0) {
                    intercambiar(lista, indiceParticion, i);
                    indiceParticion++;
                }
            }
        }

        intercambiar(lista, indiceParticion, fin);
        return indiceParticion;
    }

//    public static <E extends Comparable<E>> void quickSortDescendente(List<E> lista) {
//        quickSortDescendenteHelper(lista, 0, lista.size() - 1);
//    }
//
//    private static <E extends Comparable<E>> void quickSortDescendenteHelper(List<E> lista, int inicio, int fin) {
//        if (inicio < fin) {
//            int indiceParticion = particionDescendente(lista, inicio, fin);
//            quickSortDescendenteHelper(lista, inicio, indiceParticion - 1);
//            quickSortDescendenteHelper(lista, indiceParticion + 1, fin);
//        }
//    }
//
//    private static <E extends Comparable<E>> int particionDescendente(List<E> lista, int inicio, int fin) {
//        E pivote = lista.get(fin);
//        int indiceParticion = inicio;
//
//        for (int i = inicio; i < fin; i++) {
//            if (lista.get(i).compareTo(pivote) >= 0) {
//                intercambiar(lista, indiceParticion, i);
//                indiceParticion++;
//            }
//        }
//
//        intercambiar(lista, indiceParticion, fin);
//        return indiceParticion;
//    }
    private static <E> void intercambiar(List<E> lista, int i, int j) {
        E temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}
