/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.odenacion;

import Controlador.ed.lista.Exception.VacioException;
import Controlador.ed.lista.ListaEnlazada;
import java.util.Random;

/**
 *
 * @author jostin
 */
public class Generar {

    ListaEnlazada<Integer> lista = new ListaEnlazada<>();

    public Generar() {
        this.lista = new ListaEnlazada<>();
    }

    public ListaEnlazada<Integer> getlista() {
        return lista;
    }

    public void setlista(ListaEnlazada<Integer> lista) {
        this.lista = lista;
    }

    public void generarRandom() throws VacioException {

        Random random = new Random();

        for (int i = 0; i < 20000; i++) {
            lista.insertarNodo(random.nextInt(10000));
        }
        lista.imprimir();

    }
    public void quicksort(Integer tipo) throws VacioException{
        var arr= lista.toArray();
        lista.quicksort(arr, 0, arr.length-1, tipo);
        lista = lista.toList(arr);
        lista.imprimir();
    }
    
    public ListaEnlazada<Integer> mergeSort(Integer tipo) throws VacioException {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        lista = mergeSort.mergeSort(lista, tipo);
        return lista;
    }
    public static void main(String[] args) throws VacioException {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        Generar gene = new Generar();
        gene.generarRandom();
        gene.quicksort(1);
        
    }
}
