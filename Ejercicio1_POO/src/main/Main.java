package Main;

import entidad.Libro;


public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.cargarLibro();
        System.out.println(libro1.toString());
    }
}
