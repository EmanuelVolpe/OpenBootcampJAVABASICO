package tema4;

public class SmartPhone extends SmartDevice {
    private String sonido;

    public SmartPhone() {
    }

    public SmartPhone(int dimensionPantalla, String marca, String modelo, String sonido) {
        super(dimensionPantalla, marca, modelo);
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return super.toString() + "sonido = " + sonido;
    }
}
