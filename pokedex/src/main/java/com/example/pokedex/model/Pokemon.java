package com.example.pokedex.model;

import java.util.List;

public class Pokemon {

    private String nombre;
    private String tipo;
    private List<String> debilidades;
    private List<String> zonas;
    private String region;

    public Pokemon(String nombre, String tipo, List<String> debilidades, List<String> zonas, String region) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.debilidades = debilidades;
        this.zonas = zonas;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public List<String> getDebilidades() {
        return debilidades;
    }

    public List<String> getZonas() {
        return zonas;
    }

    public String getRegion() {
        return region;
    }
}