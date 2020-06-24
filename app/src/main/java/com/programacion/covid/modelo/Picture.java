package com.programacion.covid.modelo;

public class Picture {

    private String picture;
    private String preguntasnumero;
    private String pregunta;
    private String si;
    private String no;
    private String inciso;

   public Picture(String picture, String preguntasnumero, String pregunta,  String si, String no, String inciso) {
        this.picture = picture;
        this.preguntasnumero = preguntasnumero;
        this.pregunta = pregunta;
        this.si = si;
        this.no = no;
        this.inciso= inciso;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPreguntasnumero() {
        return preguntasnumero;
    }

    public void setPreguntasnumero(String preguntasnumero) {
        this.preguntasnumero = preguntasnumero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getInciso() {
        return inciso;
    }

    public void setInciso(String inciso) {
        this.inciso = inciso;
    }
}