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

        // Datos del computador
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

        // Crear objetos y guardar
        ComputadorPortatil pc = new ComputadorPortatil(serial, marca, tamano, precio, sistema, procesador);
        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);

        portatiles.add(pc);
        ingenieria.add(estudiante);
        System.out.println("Préstamo de equipo a estudiante de Ingeniería registrado con éxito.");
    }



}
