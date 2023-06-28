/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modelo.tabla;

import Controlador.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Dato;

/**
 *
 * @author jostin
 */
public class ModeloTablaDatos extends AbstractTableModel {

    ListaEnlazada<Integer> datos = new ListaEnlazada<>();

    public ListaEnlazada<Integer> getDato() {
        return datos;
    }

    public void setDato(ListaEnlazada<Integer> dato) {
        this.datos = dato;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Integer da = null;
        try {
            da = datos.get(i);
        } catch (Exception e) {

        }
        switch(i1) {
            case 0:
                return da;

            default:
                return null;
        }
    }
}


