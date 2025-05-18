public class ComputadorPortatil {
    private final String serial, marca, sistema, procesador;
    private final float tamano, precio;

    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistema, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistema = sistema;
        this.procesador = procesador;
    }

    public String toString() {
        return serial + " - " + marca + " - " + tamano + " - " + sistema + " - " + procesador + " - $" + precio;
    }
}

