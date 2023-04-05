package Model;

public class Araña extends Personaje {
    public Araña(String fuerza, String vida){
        super(fuerza, vida);
    }

    public String getTipo() {
        return "Model.Araña";
    }
}
