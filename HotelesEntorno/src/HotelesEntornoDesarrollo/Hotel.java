package HotelesEntornoDesarrollo;

public class Hotel {

    private String nombre;
    private int numEstrellas;

    public Hotel(String nombre, int numEstrellas) {
        this.nombre = nombre;
        this.numEstrellas = numEstrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(int numEstrellas) {
        this.numEstrellas = numEstrellas;
    }
}
