import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarPelicula(new Pelicula("Jungla de Cristal", 131, "Acción"));
        biblioteca.agregarPelicula(new Pelicula("La vida es bella", 116, "Dramática"));
        biblioteca.agregarPelicula(new Pelicula("EL exorcista", 121, "Terror"));
        biblioteca.agregarPelicula(new Pelicula("La vida es brian", 154, "Comedia"));

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Buscar por género");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todas las películas");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el género de película (Acción, Dramática, Comedia, Terror): ");
                    String genero = scanner.nextLine();
                    biblioteca.buscarPorGenero(genero);
                    break;
                case 2:
                    System.out.print("Introduce el nombre de la película: ");
                    String nombre = scanner.nextLine();
                    biblioteca.buscarPorNombre(nombre);
                    break;
                case 3:
                    biblioteca.mostrarTodasLasPeliculas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intentalo nuevamente.");
            }
        }
    }
}

