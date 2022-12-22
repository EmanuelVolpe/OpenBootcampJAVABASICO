package tema4;

public class SmartDevice {

    private int dimensionPantalla;
    private String marca;
    private String modelo;

    public SmartDevice() {
    }

    public SmartDevice(int dimensionPantalla, String marca, String modelo) {
        this.dimensionPantalla = dimensionPantalla;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "dimensionPantalla = " + dimensionPantalla + '\n' +
                "marca = " + marca + '\n' +
                "modelo = " + modelo + '\n';
    }
}
