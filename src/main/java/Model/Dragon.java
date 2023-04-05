package Model;

public class Dragon extends Personaje{
    public Dragon(String fuerza, String vida){
        super(fuerza, vida);
    }

    @Override
    public String getTipo() {
        return "Model.Dragon";
    }
}
