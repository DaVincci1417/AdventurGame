package Model;

public class Esqueleto extends Personaje {
    public Esqueleto(String fuerza, String vida){
        super(fuerza, vida);
    }

    public String getTipo() {
        return "Model.Esqueleto";
    }
}
