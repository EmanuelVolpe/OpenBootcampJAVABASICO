package tema4;

public class SmartWatch extends SmartDevice{
    private int profundidad;

    public SmartWatch() {
    }

    public SmartWatch(int dimensionPantalla, String marca, String modelo, int profunidad) {
        super(dimensionPantalla, marca, modelo);
        this.profundidad = profunidad;
    }

    @Override
    public String toString() {
        return super.toString() + "profundidad = " + profundidad;
    }

}
