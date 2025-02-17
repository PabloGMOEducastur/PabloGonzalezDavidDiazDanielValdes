public class Suit extends Habitacion{


    private boolean habitacionBSM;

    public boolean isHabitacionBSM() {
        return habitacionBSM;
    }

    public void setHabitacionBSM(boolean habitacionBSM) {
        this.habitacionBSM = habitacionBSM;
    }

    public Suit(int numero, double precio, boolean habitacionBSM) {
        super(numero, precio);
        this.habitacionBSM = habitacionBSM;
    }


}
