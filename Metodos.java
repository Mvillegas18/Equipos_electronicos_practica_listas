import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
    Validaciones validaciones = new Validaciones();
    Scanner scanner = new Scanner(System.in);
    List<ComputadorPortatil> portatiles = new ArrayList<>();
    List<EstudianteIngenieria> ingenieria = new ArrayList<>();
    List<EstudianteDiseno> diseno = new ArrayList<>();
    List<TabletaGrafica> tabletas = new ArrayList<>();

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

    public void registrarPrestamoDiseno() {
        System.out.println("\n--- Registro Préstamo Diseño ---");

        // Cédula
        String cedula;
        do {
            System.out.print("Cédula: ");
            cedula = scanner.nextLine();
            if (!validaciones.validarCedula(cedula)) {
                System.out.println("La cédula debe contener solo números.");
            }
        } while (!validaciones.validarCedula(cedula));

        // Verificar si ya tiene préstamo
        for (EstudianteDiseno est : diseno) {
            if (est.getCedula().equals(cedula)) {
                System.out.println("Este estudiante ya tiene un equipo asignado.");
                return;
            }
        }

        // Nombre
        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (!validaciones.validarTextoSinNumeros(nombre)) {
                System.out.println("El nombre no debe contener números ni caracteres especiales.");
            }
        } while (!validaciones.validarTextoSinNumeros(nombre));

        // Apellido
        String apellido;
        do {
            System.out.print("Apellido: ");
            apellido = scanner.nextLine();
            if (!validaciones.validarTextoSinNumeros(apellido)) {
                System.out.println("El apellido no debe contener números ni caracteres especiales.");
            }
        } while (!validaciones.validarTextoSinNumeros(apellido));

        // Teléfono
        String telefono;
        do {
            System.out.print("Teléfono: ");
            telefono = scanner.nextLine();
            if (!validaciones.validarTelefono(telefono)) {
                System.out.println("El teléfono debe contener 7 a 10 dígitos numéricos.");
            }
        } while (!validaciones.validarTelefono(telefono));

        // Modalidad
        String modalidad;
        do {
            System.out.print("Modalidad (presencial o virtual): ");
            modalidad = scanner.nextLine().toLowerCase();
            if (!validaciones.validarModalidad(modalidad)) {
                System.out.println("Modalidad inválida. Debe ser presencial o virtual.");
            }
        } while (!validaciones.validarModalidad(modalidad));

        // Cantidad de asignaturas
        int asignaturas;
        do {
            System.out.print("Cantidad de asignaturas: ");
            asignaturas = Validaciones.leerEntero(scanner);
            if (asignaturas <= 0) {
                System.out.println("La cantidad debe ser mayor a cero.");
            }
        } while (asignaturas <= 0);

        // Datos de la tableta
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

        // Validaciones finales
        if (!validaciones.validarTextoSinEspeciales(serial)) {
            System.out.println("El serial no debe contener caracteres especiales.");
            return;
        }

        // Crear objetos y guardar
        TabletaGrafica tableta = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso);
        EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serial);

        tabletas.add(tableta);
        diseno.add(estudiante);

        System.out.println("Préstamo de equipo a estudiante de Diseño registrado con éxito.");
    }

}
