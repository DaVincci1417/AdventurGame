package Model;

public class Zombie extends Personaje{
    public Zombie(String fuerza, String vida){
        super(fuerza, vida);
    }

    public String getTipo() {
        return "Model.Zombie";
    }
}
