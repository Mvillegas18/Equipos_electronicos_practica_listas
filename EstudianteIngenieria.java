public class EstudianteIngenieria {
    private String cedula, nombre, apellido, telefono, serial;
    private int semestre;
    private float promedio;

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
