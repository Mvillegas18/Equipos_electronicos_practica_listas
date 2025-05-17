public class EstudianteDiseno {
    private final String cedula, nombre, apellido, telefono, modalidad;
    private final int asignaturas, serial;

    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidad, int asignaturas, int serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidad = modalidad;
        this.asignaturas = asignaturas;
        this.serial = serial;
    }

    public String toString() {
        return "Cédula: " + cedula + " - " + nombre + " " + apellido + " - Teléfono: " + telefono + " - Modalidad: " + modalidad + " - Asig: " + asignaturas + " - Serial: " + serial;
    }
}
