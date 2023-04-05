package Controller;

import Model.Juego;
import Model.Jugador;

import java.util.ArrayList;

public class Launcher {
    public static void inicializar(){
       Jugador jugador = new Jugador();
       Juego juego = new Juego(jugador);
       juego.enfrentamientos();
    }

    public static void main(String[] args) {
        inicializar();
    }
}
