import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Pelicula> peliculas;

    public Biblioteca() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void buscarPorGenero(String genero) {
        boolean encontrado = false;
        for (Pelicula p : peliculas) {
            if (p.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron películas de género " + genero);
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Pelicula p : peliculas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró la película con el nombre " + nombre);
        }
    }

    public void mostrarTodasLasPeliculas() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas en la biblioteca.");
        } else {
            for (Pelicula p : peliculas) {
                System.out.println(p);
            }
        }
    }
}

