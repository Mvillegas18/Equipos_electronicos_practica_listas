import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos_ingenieria {
    Validaciones validaciones = new Validaciones();
    Scanner scanner = new Scanner(System.in);
    List<ComputadorPortatil> portatiles = new ArrayList<>();
    List<EstudianteIngenieria> ingenieria = new ArrayList<>();


    public void registrarPrestamoIngenieria() {
        System.out.println("\n--- Registro Préstamo Ingeniería ---");

        String cedula;
        do {
            System.out.print("Cédula: ");
            cedula = scanner.nextLine();
            if (!validaciones.validarCedula(cedula)) {
                System.out.println("La cédula debe contener solo números.");
            }
        } while (!validaciones.validarCedula(cedula));

        // Verificar si ya tiene préstamo
        for (EstudianteIngenieria est : ingenieria) {
            if (est.getCedula().equals(cedula)) {
                System.out.println("Este estudiante ya tiene un equipo asignado.");
                return;
            }
        }

        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (!validaciones.validarTextoSinNumeros(nombre)) {
                System.out.println("El nombre no debe contener números ni caracteres especiales.");
            }
        } while (!validaciones.validarTextoSinNumeros(nombre));

        String apellido;
        do {
            System.out.print("Apellido: ");
            apellido = scanner.nextLine();
            if (!validaciones.validarTextoSinNumeros(apellido)) {
                System.out.println("El apellido no debe contener números ni caracteres especiales.");
            }
        } while (!validaciones.validarTextoSinNumeros(apellido));

        String telefono;
        do {
            System.out.print("Teléfono: ");
            telefono = scanner.nextLine();
            if (!validaciones.validarTelefono(telefono)) {
                System.out.println("El teléfono debe contener solo números.");
            }
        } while (!validaciones.validarCedula(telefono));

        System.out.print("Número de semestre: ");
        int semestre = Validaciones.leerEntero(scanner);

        System.out.print("Promedio: ");
        float promedio = Validaciones.leerFloat(scanner);

        System.out.print("Serial del computador: ");
        String serial = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Tamaño (pulgadas): ");
        float tamano = Validaciones.leerFloat(scanner);

        System.out.print("Precio: ");
        float precio = Validaciones.leerFloat(scanner);

        System.out.println("Sistema Operativo: \n1. Windows 7\n2. Windows 10\n3. Windows 11");
        String sistema = switch (scanner.nextInt()) {
            case 1 -> "Windows 7";
            case 2 -> "Windows 10";
            case 3 -> "Windows 11";
            default -> "Desconocido";
        };
        scanner.nextLine();

        System.out.println("Procesador: \n1. AMD Ryzen\n2. Intel Core i5");
        String procesador = switch (scanner.nextInt()) {
            case 1 -> "AMD Ryzen";
            case 2 -> "Intel Core i5";
            default -> "Desconocido";
        };
        scanner.nextLine();

        ComputadorPortatil pc = new ComputadorPortatil(serial, marca, tamano, precio, sistema, procesador);
        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);

        portatiles.add(pc);
        ingenieria.add(estudiante);
        System.out.println("Préstamo de equipo a estudiante de Ingeniería registrado con éxito.");
    }

    public void modificarPrestamoIngenieria() {
        System.out.println("\n--- Modificar Préstamo Ingeniería ---");

        System.out.print("Ingrese la cédula del estudiante a modificar: ");
        String cedula = scanner.nextLine();

        // Buscar estudiante
        EstudianteIngenieria estudiante = null;
        for (EstudianteIngenieria est : ingenieria) {
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

        System.out.print("Nuevo número de semestre (" + estudiante.getSemestre() + "): ");
        int nuevoSemestre = Validaciones.leerEntero(scanner);
        if (nuevoSemestre > 0) {
            estudiante.setSemestre(nuevoSemestre);
        }

        System.out.print("Nuevo promedio (" + estudiante.getPromedio() + "): ");
        float nuevoPromedio = Validaciones.leerFloat(scanner);
        if (nuevoPromedio >= 0) {
            estudiante.setPromedio(nuevoPromedio);
        }

        System.out.println("Datos del estudiante actualizados con éxito.");
    }

    public void devolverEquipoIngenieria() {
        System.out.println("\n--- Devolución de Equipo Ingeniería ---");

        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();

        EstudianteIngenieria estudianteAEliminar = null;
        for (EstudianteIngenieria estudiante : ingenieria) {
            if (estudiante.getCedula().equals(cedula)) {
                estudianteAEliminar = estudiante;
                break;
            }
        }

        if (estudianteAEliminar == null) {
            System.out.println("No se encontró un préstamo asociado a esta cédula.");
            return;
        }

        ComputadorPortatil equipoAEliminar = null;
        for (ComputadorPortatil pc : portatiles) {
            if (pc.getSerial().equals(estudianteAEliminar.getSerial())) {
                equipoAEliminar = pc;
                break;
            }
        }

        ingenieria.remove(estudianteAEliminar);
        if (equipoAEliminar != null) {
            portatiles.remove(equipoAEliminar);
        }

        System.out.println("Devolución realizada con éxito.");
    }

    public void buscarPrestamoIngenieria() {
        System.out.println("\n--- Búsqueda de Préstamo Ingeniería ---");

        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();

        EstudianteIngenieria estudianteEncontrado = null;
        for (EstudianteIngenieria estudiante : ingenieria) {
            if (estudiante.getCedula().equals(cedula)) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        if (estudianteEncontrado == null) {
            System.out.println("No se encontró un préstamo para esa cédula.");
            return;
        }

        ComputadorPortatil equipo = null;
        for (ComputadorPortatil pc : portatiles) {
            if (pc.getSerial().equals(estudianteEncontrado.getSerial())) {
                equipo = pc;
                break;
            }
        }

        System.out.println("---- Datos del Estudiante ----");
        System.out.println("Cédula: " + estudianteEncontrado.getCedula());
        System.out.println("Nombre: " + estudianteEncontrado.getNombre());
        System.out.println("Apellido: " + estudianteEncontrado.getApellido());
        System.out.println("Teléfono: " + estudianteEncontrado.getTelefono());
        System.out.println("Semestre: " + estudianteEncontrado.getSemestre());
        System.out.println("Promedio: " + estudianteEncontrado.getPromedio());

        if (equipo != null) {
            System.out.println("---- Datos del Computador ----");
            System.out.println("Serial: " + equipo.getSerial());
            System.out.println("Marca: " + equipo.getMarca());
            System.out.println("Tamaño: " + equipo.getTamano());
            System.out.println("Precio: " + equipo.getPrecio());
            System.out.println("Sistema Operativo: " + equipo.getSistema());
            System.out.println("Procesador: " + equipo.getProcesador());
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

}
