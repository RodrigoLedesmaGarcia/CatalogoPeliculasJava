package www.rodrigoledesmagarcia.com.mx.servicio;

import www.rodrigoledesmagarcia.com.mx.dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listar() {

        System.out.println("Listado de peliculas...");
        peliculas.forEach(System.out::println);

    }

    @Override
    public void agregar(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.print("Se agrego la pelicula: "+
                         "\n "+pelicula);

    }

    @Override
    public void buscar(Pelicula pelicula) {
        var indice = peliculas.indexOf(pelicula);

        System.out.print("Pelicula encontada en el indice: "+ indice);

    }
}
