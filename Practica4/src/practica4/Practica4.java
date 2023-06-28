/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

// @author The following has evaluated to null or missing:
import Controlador.ed.lista.Exception.PosicionException;
import Controlador.ed.lista.Exception.VacioException;
import Controlador.ed.lista.ListaEnlazada;
import Controlador.odenacion.Generar;
import Controlador.odenacion.MergeSort;
import Controlador.odenacion.Quickshort;
import java.util.Random;
import modelo.Dato;

public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws VacioException {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        Generar gene = new Generar();
        gene.generarRandom();
//        gene.quicksort(1);

    }

    ListaEnlazada<Integer> lista = new ListaEnlazada<>();

    public Practica4() {
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

    public void quicksort(Integer tipo) throws VacioException {

        var arr = lista.toArray();
        lista.quicksort(arr, 0, arr.length - 1, tipo);
        lista = lista.toList(arr);
        lista.imprimir();
    }
    
}

//        ListaEnlazada<Object> lista1 = new ListaEnlazada<>();
//
//        for (int i = 0; i < 100; i++) {
//            lista1.insertarNodo((int) (Math.random() * 20000));
//        }
//
//        imprimir(lista1);
//    }
//
//    public static void imprimir(ListaEnlazada<Object> lista) {
//        try {
//            System.out.println("\nLista-----------------");
//            for (int i = 0; i < lista.size(); i++) {
//                System.out.println(lista.get(i) + ",");
//            }
//            System.out.println("Fin------------------");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }

