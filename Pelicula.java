public class Pelicula {
    private String nombre;
    private int duracion; 
    private String genero;

    public Pelicula(String nombre, int duracion, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pelicula: " + nombre + ", Duración: " + duracion + " minutos, Género: " + genero;
    }
}
