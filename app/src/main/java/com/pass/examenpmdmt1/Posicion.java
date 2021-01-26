package com.pass.examenpmdmt1;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Posicion {
    @Element
    private float Latitud;
    @Element
    private float Longitud;

    public Posicion() {
    }

    public Posicion(float latitud, float longitud) {
        Latitud = latitud;
        Longitud = longitud;
    }

    public float getLatitud() {
        return Latitud;
    }

    public void setLatitud(float latitud) {
        Latitud = latitud;
    }

    public float getLongitud() {
        return Longitud;
    }

    public void setLongitud(float longitud) {
        Longitud = longitud;
    }

    @Override
    public String toString() {
        return "Posicion{" +
                "Latitud=" + Latitud +
                ", Longitud=" + Longitud +
                '}';
    }
}
