public class Sencilla extends Habitacion {


    private boolean exterior = false;

    public Sencilla(int numero, double precio, boolean exterior) {

        super(numero, precio);
        this.exterior = exterior;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }




}
