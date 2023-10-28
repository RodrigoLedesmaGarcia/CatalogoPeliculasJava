package www.rodrigoledesmagarcia.com.mx.servicio;

import www.rodrigoledesmagarcia.com.mx.dominio.Pelicula;

public interface IServicioPeliculas {

    public void listar();

    public void agregar(Pelicula pelicula);

    public void buscar(Pelicula pelicula);

}
