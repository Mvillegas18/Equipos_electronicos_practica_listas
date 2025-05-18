public class TabletaGrafica {
    private final String serial, marca, almacenamiento;
    private final float tamano, precio, peso;

    public TabletaGrafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public String toString() {
        return serial + " - " + marca + " - " + almacenamiento + " - " + tamano + "'' - $" + precio + " - " + peso + "kg";
    }
}
