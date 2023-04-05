package Controller;

import Model.Juego;
import Model.Jugador;

import java.util.ArrayList;

public class Launcher {
    public static void inicializar(){
       Juego juego = new Juego();
       Jugador jugador = new Jugador();
       juego.enfrentamientos(jugador);
    }

    public static void main(String[] args) {
        inicializar();
    }
}
