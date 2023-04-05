package Model;

import java.util.ArrayList;
import java.util.Random;

public class Juego {
    private Araña araña = new Araña("0", "100");
    private Esqueleto esqueleto = new Esqueleto("0", "500");
    private Zombie zombie = new Zombie("0", "1000");
    private Dragon dragon= new Dragon("0", "3000")
    private Jugador jugador = new Jugador();


    public Juego(Jugador jugador){

    }

    //Enfrentamientos
    public void enfrentamientos(){
        int vidas = 3;
        int nivel = 1;
        Random aleatorio = new Random();
  
        if((aleatorio.nextInt(10) + 1) <= 7){
            araña.modificarEstadisticas("fuerza", "9");
        }else{
            araña.modificarEstadisticas("fuerza", "11");
        }
        if((aleatorio.nextInt(10) + 1) <= 7){
            esqueleto.modificarEstadisticas("fuerza", "79");
        }else{
            esqueleto.modificarEstadisticas("fuerza", "81");
        }
        if((aleatorio.nextInt(10) + 1) <= 7){
            zombie.modificarEstadisticas("fuerza", "99");
        }else{
            zombie.modificarEstadisticas("fuerza", "101");
        }
        if((aleatorio.nextInt(10) + 1) <= 7){
            dragon.modificarEstadisticas("fuerza", "399");
        }else{
            dragon.modificarEstadisticas("fuerza", "401");
        }

        do{
            do{
                if(Integer.parseInt(araña.getFuerza()) <= Integer.parseInt(jugador.getFuerza())){
                    nivel++;
                    System.out.println("Ha conseguido vencer al araña, subi de nivel.");}

                if(Integer.parseInt(araña.getFuerza()) > Integer.parseInt(jugador.getFuerza())){
                    vidas--;
                    System.out.println("No ha conseguido vencer al araña, ha perdido una vida.");
                    jugador.modificarEstadisticas("fuerza", "12");
                }
            }while (nivel < 2);

            jugador.editarEstadistasPorNivel(2);

            do{
                if(Integer.parseInt(esqueleto.getFuerza()) < Integer.parseInt(jugador.getFuerza())){
                    nivel++;
                    System.out.println("Ha conseguido vencer al esqueleto, subi de nivel.");
                }
                if(Integer.parseInt(esqueleto.getFuerza()) > Integer.parseInt(jugador.getFuerza())){
                    vidas--;
                    System.out.println("No ha conseguido vencer al esqueleto, ha perdido una vida.");
                    jugador.modificarEstadisticas("fuerza", "82");
                }
            }while (nivel < 3);

            jugador.editarEstadistasPorNivel(3);

            do{
                if(Integer.parseInt(zombie.getFuerza()) < Integer.parseInt(jugador.getFuerza())){
                    nivel++;
                    System.out.println("Ha conseguido vencer al zombie, subi de nivel.");
                }
                if(Integer.parseInt(zombie.getFuerza()) > Integer.parseInt(jugador.getFuerza())){
                    vidas--;
                    System.out.println("No ha conseguido vencer al zombie, ha perdido una vida.");
                    jugador.modificarEstadisticas("fuerza", "102");
                }
            }while (nivel < 4);

            jugador.editarEstadistasPorNivel(4);

            do{
                if(Integer.parseInt(dragon.getFuerza()) < Integer.parseInt(jugador.getFuerza())){
                    nivel++;
                    System.out.println("Ha conseguido vencer al dragon, subi de nivel.");
                }
                if(Integer.parseInt(dragon.getFuerza()) > Integer.parseInt(jugador.getFuerza())){
                    vidas--;
                    System.out.println("No ha conseguido vencer al dragon, ha perdido una vida.");
                    jugador.modificarEstadisticas("fuerza", "402");
                }
            }while (nivel < 5);

            System.out.println("Ha ganado el juego");

        }while(vidas != 0 && nivel < 5);
    }
}
