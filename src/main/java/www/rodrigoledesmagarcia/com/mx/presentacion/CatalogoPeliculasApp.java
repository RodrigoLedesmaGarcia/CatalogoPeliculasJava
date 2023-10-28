package www.rodrigoledesmagarcia.com.mx.presentacion;

import www.rodrigoledesmagarcia.com.mx.dominio.Pelicula;
import www.rodrigoledesmagarcia.com.mx.servicio.IServicioPeliculas;
import www.rodrigoledesmagarcia.com.mx.servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {

        var salir = false;
        var consola = new Scanner(System.in);
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        while (!salir) {

            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola, servicioPeliculas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.println(" ");

        }// fin ciclo while

    }
    private static void mostrarMenu() {
        System.out.println(" ");
        System.out.println("""
                **** Catalogo de Peliculas ****
                Precione 1 para agregar una pelicula.
                Precione 2 para listar las peliculas.
                Precione 3 para buscar una pelicula.
                Precione 4 para salir.""");
    }

    private static boolean ejecutarOpciones(Scanner consola, IServicioPeliculas servicioPeliculas) {

        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 ->{
                System.out.print("Introduce el nombre de la pelicula: ");
                var nombrePelicula = consola.nextLine();
                servicioPeliculas.agregar(new Pelicula(nombrePelicula));
            }
            case 2 -> { servicioPeliculas.listar();

            }
            case  3 -> {
                System.out.print("Introduce la pelicula a buscar: ");
                var buscarPelicula = consola.nextLine();
                servicioPeliculas.buscar(new Pelicula(buscarPelicula));
            }
            case 4 -> {
                System.out.println("Hasta pronto");
                salir = true;
            }
            default -> {
                System.out.println("Error ese opcion no existe");
                salir = true;
            }
        }

        return salir;
    }


}
