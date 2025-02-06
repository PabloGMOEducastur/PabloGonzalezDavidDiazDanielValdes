package HotelesEntornoDesarrollo;

public class Sencilla extends Habitación {

    private boolean exterior = false;

    public Sencilla(double precio, int numero, boolean exterior) {
        super(precio, numero);
        this.exterior = exterior;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }
}
