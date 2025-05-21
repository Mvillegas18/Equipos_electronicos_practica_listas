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
