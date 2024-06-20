package com.o2.liga_bet_play;

public class Tarjeta {
    private int id;
    private int jugador;
    private int partido;
    private String tipo;// amarilla o roja
    private int minuto;
    
    public Tarjeta(int id, int jugador, int partido, String tipo, int minuto) {
        this.id = id;
        this.jugador = jugador;
        this.partido = partido;
        this.tipo = tipo;
        this.minuto = minuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    
}
