public class EstudianteIngenieria {
    private final String cedula, nombre, apellido, telefono, serial;
    private final int semestre;
    private final float promedio;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestre, float promedio, String serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.semestre = semestre;
        this.promedio = promedio;
        this.serial = serial;
    }

    public String toString() {
        return nombre + " " + apellido + " - Cédula: " + cedula + " - Teléfono: " + telefono + " - Semestre: " + semestre + " - Prom: " + promedio + " - Serial: " + serial;
    }
}
