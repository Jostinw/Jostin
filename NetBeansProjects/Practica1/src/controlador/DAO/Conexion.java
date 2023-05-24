/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

/**
 *
 * @author jostin
 */
public class Conexion {

    private XStream xstream;
    public static String URL = "data/";

    private void conectar() {
        xstream = new XStream(new JsonHierarchicalStreamDriver());
        xstream.setMode(XStream.NO_REFERENCES);
    }

    public XStream getXstream() {
        if (xstream == null) {
            conectar();
        }
        return xstream;
    }

    public void setXstream(XStream xstream) {
        this.xstream = xstream;
    }

}
