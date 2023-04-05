package Model;

public class Jugador extends Personaje{
    public Jugador(){
        super("10", "100");
    }

    public String getTipo(){
        return "Model.Jugador";
    }

    //Editar estadisticas sde jugador
    public void editarEstadistasPorNivel(int nivel){
        switch (nivel){
            case 1:
                setFuerza("10");
                setVida("100");
                break;
            case 2:
                setFuerza("80");
                setVida("500");
                break;
            case 3:
                setFuerza("180");
                setVida("1000");
                break;
            case 4:
                setFuerza("400");
                setVida("3000");
                break;
        }
    }
}
