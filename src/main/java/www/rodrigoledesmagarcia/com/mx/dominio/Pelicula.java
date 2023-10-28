package www.rodrigoledesmagarcia.com.mx.dominio;

import java.util.Objects;

public class Pelicula {

    private String nombre;
    private String anio;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return  " "+
                "\nInformación de la Pelicula " +
                "\nNombre: "+ nombre;
    }
}
