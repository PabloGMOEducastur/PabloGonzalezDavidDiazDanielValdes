public class Cliente {

    private String nombre;
    private String dirección;
    private int teléfono;
    private Reserva [] reservas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public Cliente(String nombre, String dirección, int teléfono) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
    }

    public Cliente() {
        reservas = new Reserva [10];
    }
}
