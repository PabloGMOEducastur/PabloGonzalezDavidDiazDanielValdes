import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Hotel hotel;
    private Habitacion habitacion;

    private Date fechaEntrada;

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    public Reserva(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


}
