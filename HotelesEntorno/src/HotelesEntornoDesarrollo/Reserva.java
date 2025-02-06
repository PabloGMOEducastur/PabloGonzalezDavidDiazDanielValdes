package HotelesEntornoDesarrollo;


import java.util.Date;

public class Reserva {
    private Date fechaEntrada;

    public Reserva(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


}
