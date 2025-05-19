import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
    Scanner scanner = new Scanner(System.in);
    List<ComputadorPortatil> portatiles = new ArrayList<>();
    List<EstudianteIngenieria> ingenieria = new ArrayList<>();
    List<EstudianteDiseno> diseno = new ArrayList<>();
    List<TabletaGrafica> tabletas = new ArrayList<>();

    public void registrarEstudianteIngenieria() {

        System.out.println("\n--- Registro Estudiante Ingeniería ---");
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Número de semestre: ");
        int semestre = scanner.nextInt();
        System.out.print("Promedio acumulado: ");
        float promedio = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Serial del equipo asignado: ");
        String serial = scanner.nextLine();

        if (!Utilidades.validarTextoSinEspeciales(cedula) ||
                !Utilidades.validarTextoSinNumeros(nombre) ||
                !Utilidades.validarTextoSinNumeros(apellido) ||
                !Utilidades.validarTelefono(telefono) ||
                !Utilidades.validarTextoSinEspeciales(serial)) {
            System.out.println("Error en los datos ingresados.");
            return;
        }

        ingenieria.add(new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial));
        System.out.println("Estudiante de ingeniería registrado con éxito.");
    }

    public void registrarEstudianteDiseno() {

        System.out.println("\n--- Registro Estudiante Diseño ---");
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Modalidad (virtual/presencial): ");
        String modalidad = scanner.nextLine();
        System.out.print("Cantidad de asignaturas: ");
        int asignaturas = scanner.nextInt();
        System.out.print("Serial del equipo asignado (número): ");
        int serial = scanner.nextInt();
        scanner.nextLine();

        if (!Utilidades.validarTextoSinEspeciales(cedula) ||
                !Utilidades.validarTextoSinNumeros(nombre) ||
                !Utilidades.validarTextoSinNumeros(apellido) ||
                !Utilidades.validarTelefono(telefono)) {
            System.out.println("Error en los datos ingresados.");
            return;
        }

        diseno.add(new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serial));
        System.out.println("Estudiante de diseño registrado con éxito.");
    }

    public void registrarComputador() {


        System.out.println("\n--- Registro Computador Portátil ---");
        System.out.print("Serial: ");
        String serial = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Tamaño (pulgadas): ");
        float tamano = scanner.nextFloat();
        System.out.print("Precio: ");
        float precio = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Sistema Operativo: \n1. Windows 7\n2. Windows 10\n3. Windows 11");
        String sistema = switch (scanner.nextInt()) {
            case 1 -> "Windows 7";
            case 2 -> "Windows 10";
            case 3 -> "Windows 11";
            default -> "Desconocido";
        };

        System.out.println("Procesador: \n1. AMD Ryzen\n2. Intel Core i5");
        String procesador = switch (scanner.nextInt()) {
            case 1 -> "AMD Ryzen";
            case 2 -> "Intel Core i5";
            default -> "Desconocido";
        };
        scanner.nextLine();

        portatiles.add(new ComputadorPortatil(serial, marca, tamano, precio, sistema, procesador));
        System.out.println("Computador registrado.");
    }

    public void registrarTableta() {
        System.out.println("\n--- Registro Tableta Gráfica ---");
        System.out.print("Serial: ");
        String serial = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Tamaño (pulgadas): ");
        float tamano = scanner.nextFloat();
        System.out.print("Precio: ");
        float precio = scanner.nextFloat();

        System.out.println("Almacenamiento: \n1. 256 GB\n2. 512 GB\n3. 1 TB");
        String almacenamiento = switch (scanner.nextInt()) {
            case 1 -> "256 GB";
            case 2 -> "512 GB";
            case 3 -> "1 TB";
            default -> "Desconocido";
        };

        System.out.print("Peso (kg): ");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        tabletas.add(new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso));
        System.out.println("Tableta registrada.");
    }

    public void listarEstudiantes() {
        System.out.println("\n--- Estudiantes Ingeniería ---");
        for (EstudianteIngenieria e : ingenieria) System.out.println(e);
        System.out.println("\n--- Estudiantes Diseño ---");
        for (EstudianteDiseno d : diseno) System.out.println(d);
    }

    public void listarEquipos() {
        System.out.println("\n--- Computadores Portátiles ---");
        for (ComputadorPortatil c : portatiles) System.out.println(c);
        System.out.println("\n--- Tabletas Gráficas ---");
        for (TabletaGrafica t : tabletas) System.out.println(t);
    }
}
