package Model;

public abstract class Personaje{
    protected String fuerza;
    protected String vida;
    public Personaje(String fuerza, String vida){
        setFuerza(fuerza);
        setVida(vida);
    }

    public abstract String getTipo();

    //Getters
    public String getFuerza() {
        return fuerza;
    }
    public String getVida() {
        return vida;
    }

    //Setters
    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }
    public void setVida(String vida) {
        this.vida = vida;
    }

    public void modificarEstadisticas(String estadistica, String nuevoValor){
        switch (estadistica){
            case "fuerza":
                setFuerza(nuevoValor);
                break;
            case "vida":
                setVida(nuevoValor);
                break;
        }
    }
}
