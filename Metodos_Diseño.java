import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos_Diseño {
    Scanner scanner = new Scanner(System.in);

    Validaciones validaciones = new Validaciones();
    List<EstudianteDiseno> diseno = new ArrayList<>();
    List<TabletaGrafica> tabletas = new ArrayList<>();


    public void registrarPrestamoDiseno() {
        System.out.println("\n--- Registro Préstamo Diseño ---");

        String cedula;
        do {
            System.out.print("Cédula: ");
            cedula = scanner.nextLine();
            if (!validaciones.validarCedula(cedula)) {
                System.out.println("La cédula debe contener solo números.");
            }
        } while (!validaciones.validarCedula(cedula));

        for (EstudianteDiseno est : diseno) {
            if (est.getCedula().equals(cedula)) {
                System.out.println("Este estudiante ya tiene un equipo asignado.");
                return;
            }
        }

        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (!Validaciones.validarTextoSinNumeros(nombre)) {
                System.out.println("El nombre no debe contener números ni caracteres especiales.");
            }
        } while (!Validaciones.validarTextoSinNumeros(nombre));

        String apellido;
        do {
            System.out.print("Apellido: ");
            apellido = scanner.nextLine();
            if (!Validaciones.validarTextoSinNumeros(apellido)) {
                System.out.println("El apellido no debe contener números ni caracteres especiales.");
            }
        } while (!Validaciones.validarTextoSinNumeros(apellido));

        String telefono;
        do {
            System.out.print("Teléfono: ");
            telefono = scanner.nextLine();
            if (!Validaciones.validarTelefono(telefono)) {
                System.out.println("El teléfono debe contener 7 a 10 dígitos numéricos.");
            }
        } while (!Validaciones.validarTelefono(telefono));

        String modalidad;
        do {
            System.out.print("Modalidad (presencial o virtual): ");
            modalidad = scanner.nextLine().toLowerCase();
            if (!Validaciones.validarModalidad(modalidad)) {
                System.out.println("Modalidad inválida. Debe ser presencial o virtual.");
            }
        } while (!Validaciones.validarModalidad(modalidad));

        int asignaturas;
        do {
            System.out.print("Cantidad de asignaturas: ");
            asignaturas = Validaciones.leerEntero(scanner);
            if (asignaturas <= 0) {
                System.out.println("La cantidad debe ser mayor a cero.");
            }
        } while (asignaturas <= 0);

        System.out.print("Serial de la tableta: ");
        String serial = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Tamaño (pulgadas): ");
        float tamano = Validaciones.leerFloat(scanner);

        System.out.print("Precio: ");
        float precio = Validaciones.leerFloat(scanner);

        System.out.println("Almacenamiento: \n1. 256 GB\n2. 512 GB\n3. 1 TB");
        String almacenamiento = switch (scanner.nextInt()) {
            case 1 -> "256 GB";
            case 2 -> "512 GB";
            case 3 -> "1 TB";
            default -> "Desconocido";
        };
        scanner.nextLine();

        System.out.print("Peso (kg): ");
        float peso = Validaciones.leerFloat(scanner);

        if (!validaciones.validarTextoSinEspeciales(serial)) {
            System.out.println("El serial no debe contener caracteres especiales.");
            return;
        }

        TabletaGrafica tableta = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso);
        EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serial);

        tabletas.add(tableta);
        diseno.add(estudiante);

        System.out.println("Préstamo de equipo a estudiante de Diseño registrado con éxito.");
    }

    public void modificarPrestamoDiseno() {
        System.out.println("\n--- Modificar Préstamo Ingeniería ---");

        System.out.print("Ingrese la cédula del estudiante a modificar: ");
        String cedula = scanner.nextLine();

        EstudianteDiseno estudiante = null;
        for (EstudianteDiseno est : diseno) {
            if (est.getCedula().equals(cedula)) {
                estudiante = est;
                break;
            }
        }

        if (estudiante == null) {
            System.out.println("No se encontró ningún estudiante con esa cédula.");
            return;
        }

        System.out.print("Nuevo nombre (" + estudiante.getNombre() + "): ");
        String nuevoNombre = scanner.nextLine();
        if (validaciones.validarTextoSinNumeros(nuevoNombre)) {
            estudiante.setNombre(nuevoNombre);
        }

        System.out.print("Nuevo apellido (" + estudiante.getApellido() + "): ");
        String nuevoApellido = scanner.nextLine();
        if (validaciones.validarTextoSinNumeros(nuevoApellido)) {
            estudiante.setApellido(nuevoApellido);
        }

        System.out.print("Nuevo teléfono (" + estudiante.getTelefono() + "): ");
        String nuevoTelefono = scanner.nextLine();
        if (validaciones.validarTelefono(nuevoTelefono)) {
            estudiante.setTelefono(nuevoTelefono);
        }

        System.out.print("Nueva modalidad (" + estudiante.getModalidad() + "): ");
        String nuevaModalidad = scanner.nextLine();
        if (validaciones.validarModalidad(nuevaModalidad)) {
            estudiante.setModalidad(nuevaModalidad);
        }

        System.out.print("Nuevo promedio (" + estudiante.getAsignaturas() + "): ");
        int nuevoPromedio = Validaciones.leerEntero(scanner);
        if (nuevoPromedio >= 0) {
            estudiante.setAsignaturas(nuevoPromedio);
        }

        System.out.println("Datos del estudiante actualizados con éxito.");
    }

    public void devolverPrestamoDiseno() {
            System.out.println("\n--- Devolución de Equipo Diseño ---");

            System.out.print("Ingrese la cédula del estudiante: ");
            String cedula = scanner.nextLine();

            EstudianteDiseno estudianteAEliminar = null;
            for (EstudianteDiseno estudiante : diseno) {
                if (estudiante.getCedula().equals(cedula)) {
                    estudianteAEliminar = estudiante;
                    break;
                }
            }

            if (estudianteAEliminar == null) {
                System.out.println("No se encontró un préstamo asociado a esta cédula.");
                return;
            }

            TabletaGrafica equipoAEliminar = null;
            for (TabletaGrafica pc : tabletas) {
                if (pc.getSerial().equals(estudianteAEliminar.getSerial())) {
                    equipoAEliminar = pc;
                    break;
                }
            }

            diseno.remove(estudianteAEliminar);
            if (equipoAEliminar != null) {
                tabletas.remove(equipoAEliminar);
            }

            System.out.println("Devolución realizada con éxito.");

    }

    public void buscarPrestamoDiseno() {
        System.out.println("\n--- Búsqueda de Préstamo Diseño ---");

        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();

        EstudianteDiseno estudianteEncontrado = null;
        for (EstudianteDiseno estudiante : diseno) {
            if (estudiante.getCedula().equals(cedula)) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        if (estudianteEncontrado == null) {
            System.out.println("No se encontró un préstamo para esa cédula.");
            return;
        }

        TabletaGrafica equipo = null;
        for (TabletaGrafica tab : tabletas) {
            if (tab.getSerial().equals(estudianteEncontrado.getSerial())) {
                equipo = tab;
                break;
            }
        }

        System.out.println("---- Datos del Estudiante ----");
        System.out.println("Cédula: " + estudianteEncontrado.getCedula());
        System.out.println("Nombre: " + estudianteEncontrado.getNombre());
        System.out.println("Apellido: " + estudianteEncontrado.getApellido());
        System.out.println("Teléfono: " + estudianteEncontrado.getTelefono());
        System.out.println("Modalidad: " + estudianteEncontrado.getModalidad());
        System.out.println("Asignaturas: " + estudianteEncontrado.getAsignaturas());

        if (equipo != null) {
            System.out.println("---- Datos de la Tableta ----");
            System.out.println("Serial: " + equipo.getSerial());
            System.out.println("Marca: " + equipo.getMarca());
            System.out.println("Tamaño: " + equipo.getTamano());
            System.out.println("Precio: " + equipo.getPrecio());
            System.out.println("Almacenamiento: " + equipo.getAlmacenamiento());
            System.out.println("Peso: " + equipo.getPeso());
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

}
