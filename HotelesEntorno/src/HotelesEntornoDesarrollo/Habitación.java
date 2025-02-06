package HotelesEntornoDesarrollo;

public class Habitación {

    protected double precio;
    protected int numero;

    public Habitación(double precio, int numero) {
        this.precio = precio;
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
