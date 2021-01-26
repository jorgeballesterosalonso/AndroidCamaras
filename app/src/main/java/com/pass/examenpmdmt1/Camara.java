package com.pass.examenpmdmt1;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import javax.xml.namespace.QName;

@Root(name = "Camara", strict = false)
public class Camara {
    @Element(name = "Posicion")
    private Posicion posicion;
    @Element(name = "Fichero")
    private String Fichero;

    public Camara() {
    }

    public Camara(Posicion posicion, String Fichero) {
        this.posicion = posicion;
        this.Fichero = Fichero;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getFichero() {
        return Fichero;
    }

    public void setFichero(String fichero) {
        Fichero = fichero;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "posicion=" + posicion +
                ", Fichero='" + Fichero + '\'' +
                '}';
    }
}
