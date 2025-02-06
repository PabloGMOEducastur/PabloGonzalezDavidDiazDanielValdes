package HotelesEntornoDesarrollo;

public class Cliente {

    protected String nombre;
    protected  String dirección;
    protected int teléfono;

    public Cliente(String nombre, String dirección, int teléfono) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
    }

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
}
