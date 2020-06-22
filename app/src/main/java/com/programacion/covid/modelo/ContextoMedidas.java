package com.programacion.covid.modelo;

public class ContextoMedidas {
    private String texto;
    private String texto2;
    private String picture;



    public ContextoMedidas(String texto, String texto2, String picture){
        this.texto = texto;
        this.texto2 = texto2;
        this.picture = picture;

    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPicture() {
        return picture;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
