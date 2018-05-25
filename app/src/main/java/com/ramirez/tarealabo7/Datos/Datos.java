package com.ramirez.tarealabo7.Datos;

/**
 * Created by Erika on 25/5/2018.
 */

public class Datos {

        private String carnet;
        private String nombre;
        private float nota;

        public Datos(){

        }

    public Datos(String carnet, String nombre, float nota) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
