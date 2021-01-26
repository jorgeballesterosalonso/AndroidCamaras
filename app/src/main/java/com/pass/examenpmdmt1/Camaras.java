package com.pass.examenpmdmt1;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;
@Root
public class Camaras {
    @ElementList(name = "camaras",inline = true)
    private List<Camara> listaCamaras;

    public Camaras() {
    }

    public Camaras(List<Camara> listaCamaras) {
        this.listaCamaras = listaCamaras;
    }

    public List<Camara> getListaCamaras() {
        return listaCamaras;
    }

    public void setListaCamaras(List<Camara> listaCamaras) {
        this.listaCamaras = listaCamaras;
    }

    @Override
    public String toString() {
        return "Camaras{" +
                "listaCamaras=" + listaCamaras +
                '}';
    }
}
