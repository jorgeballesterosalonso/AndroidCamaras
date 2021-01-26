package com.pass.examenpmdmt1;

public class EntradaSalida {
    public static String pintarHTML(Camaras camaras){
        String tabla = "<table border='1px' align='center'><tr><td width='120' align='center'>Latitud</td><td width='100'>Longitud</td><td>JPG</td>";
        for (Camara camara : camaras.getListaCamaras()) {

            tabla += "<tr>";

            tabla += "<td align='center'>" + camara.getPosicion().getLatitud() + "</td>";
            tabla += "<td align='center'>" + camara.getPosicion().getLongitud() + "</td>";
            tabla += "<td align='center'><img src='http://www.mc30.es/components/com_hotspots/datos/imagenes_camaras/"+camara.getFichero()+"' height='100px',width='100px'/></td>";

            tabla += "</tr>";
        }
        tabla += "</table>";
        String inicio = "<html><head><title>Cámaras M-30</title><body></head></body>";
        String fin = "</body></html>";

        return inicio + tabla + fin;
    }
}
