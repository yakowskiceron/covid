package com.programacion.covid.modelo;
//Clase encargada de adquirir los elementos del XML Items

public class Personaje_Doc {

    /* Nobre del Doctor
       Departamento
       Foto  */

    private String Nombre;
    private String Inf;
    private int foto;

    public Personaje_Doc()
    {

    }

    public Personaje_Doc(String nombre, String inf, int foto) {
        this.Nombre = nombre;
        this.Inf = inf;
        this.foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getInf() {
        return Inf;
    }

    public void setInf(String inf) {
        Inf = inf;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
