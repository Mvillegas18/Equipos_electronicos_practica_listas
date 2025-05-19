import java.util.*;

public class Menu {
    private final List<TabletaGrafica> tabletas = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        Metodos metodos = new Metodos();
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN PRÉSTAMO DE EQUIPOS ---");
            System.out.println("1. Registrar estudiante de ingeniería");
            System.out.println("2. Registrar estudiante de diseño");
            System.out.println("3. Registrar computador portátil");
            System.out.println("4. Registrar tableta gráfica");
            System.out.println("5. Ver estudiantes registrados");
            System.out.println("6. Ver equipos registrados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> metodos.registrarEstudianteIngenieria();
                case 2 -> metodos.registrarEstudianteDiseno();
                case 3 -> metodos.registrarComputador();
                case 4 -> metodos.registrarTableta();
                case 5 -> metodos.listarEstudiantes();
                case 6 -> metodos.listarEquipos();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }










}
