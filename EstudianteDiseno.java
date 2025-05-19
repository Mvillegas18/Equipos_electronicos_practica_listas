public class EstudianteDiseno {
    private  String cedula, nombre, apellido, telefono, modalidad;
    private  int asignaturas, serial;

    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidad, int asignaturas, int serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidad = modalidad;
        this.asignaturas = asignaturas;
        this.serial = serial;
    }

    public EstudianteDiseno() {}

    public String toString() {
        return "Cédula: " + cedula + " - " + nombre + " " + apellido + " - Teléfono: " + telefono + " - Modalidad: " + modalidad + " - Asig: " + asignaturas + " - Serial: " + serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
