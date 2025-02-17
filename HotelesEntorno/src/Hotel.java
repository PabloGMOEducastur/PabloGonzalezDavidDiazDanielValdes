import java.util.Date;

public class Hotel {


    private Reserva [] reservas;

    private String nombre;
    private int numEstrellas;

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

    public void registrarHabitaciones(Date fechaEntrada, int dias, Habitacion habitacion, Cliente cliente){

    }

    public void registrarCliente(Cliente cliente){

    }

    public void añadirHabitacion(Habitacion habitacion){

    }

    public Hotel(String nombre, int numEstrellas) {
        this.nombre = nombre;
        this.numEstrellas = numEstrellas;
    }







}
