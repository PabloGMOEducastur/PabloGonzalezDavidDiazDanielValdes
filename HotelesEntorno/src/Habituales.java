public class Habituales extends Cliente{


    private final double DESCUENTOPRECIO=0.50;

    public Habituales(String nombre, String dirección, int teléfono) {
        super(nombre, dirección, teléfono);
    }

    public double getDESCUENTOPRECIO() {
        return DESCUENTOPRECIO;
    }


}

