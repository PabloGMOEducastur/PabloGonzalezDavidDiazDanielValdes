public class Esporadicos extends Cliente {


    private boolean preguntarOfertas;

    public Esporadicos(String nombre, String dirección, int teléfono, boolean preguntarOfertas) {
        super(nombre, dirección, teléfono);
        this.preguntarOfertas = preguntarOfertas;
    }

    public boolean isPreguntarOfertas() {
        return preguntarOfertas;
    }

    public void setPreguntarOfertas(boolean preguntarOfertas) {
        this.preguntarOfertas = preguntarOfertas;
    }



}


