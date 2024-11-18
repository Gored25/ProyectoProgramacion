package proyectofinal;

import java.util.*;

public class Biblioteca {

     ArrayList<Juego> juegos;

    public Biblioteca() {
        this.juegos = new ArrayList<>();
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public void agregarJuego(Juego juego) {
        this.juegos.add(juego);
        System.out.println("Juego agregado a la biblioteca.");
    }

    public static void mostrarJuegos(ArrayList<Juego> juegos) {
        for (int i = 0; i < juegos.size(); i++) {
            Juego juego = juegos.get(i);
            System.out.println((i + 1) + ". " + juego.getTitulo() + " - Precio: $" + juego.getPrecio());
        }
    }

    public void eliminarJuego(String nombreJuego) {
        boolean juegoEncontrado = false;
        for (int i = 0; i < juegos.size(); i++) {
            if (juegos.get(i).getTitulo().equalsIgnoreCase(nombreJuego)) {
                juegos.remove(i);
                juegoEncontrado = true;
                i--;
            }
        }

        if (juegoEncontrado) {
            System.out.println("Juego eliminado de la biblioteca.");
        } else {
            System.out.println("Juego no encontrado en la biblioteca.");
        }
    }

    public void mostrarBiblioteca() {
        System.out.println("Biblioteca de juegos:");
        for (int i = 0; i < juegos.size(); i++) {
            Juego juego = juegos.get(i);
            System.out.println((i + 1) + ". " + juego.getTitulo() + " - " + juego.getGenero());
        }
    }
    
    public void sugerirJuegos(String genero) {
        System.out.println("Sugerencias de juegos para el género: " + genero);
        for (Juego juego : juegos) {
            if (juego.getGenero().equalsIgnoreCase(genero)) {
                juego.mostrarInformacion();
            }
        }
    }
}
