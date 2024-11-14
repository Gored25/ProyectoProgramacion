package proyectofinal;

import java.util.*;

public class ProyectoFinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese su correo: ");
        String email = input.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contrasena = input.nextLine();

        System.out.println("Ingrese su saldo inicial: ");
        double saldo = input.nextDouble();
        input.nextLine();

        Usuario usuario = new Usuario(nombre, email, contrasena, saldo);
        Biblioteca biblioteca = new Biblioteca();

        Juego juego1 = new Juego("Resident Evil", "Terror", 30, 0);
        Juego juego2 = new Juego("Outlast", "Terror", 20, 0);
        Juego juego3 = new Juego("Silent Hill 2", "Terror", 25, 0);
        Juego juego4 = new Juego("FIFA 23", "Deportes", 60, 0);
        Juego juego5 = new Juego("Football Manager 2025", "Deportes", 50, 0);
        Juego juego6 = new Juego("Fifa 17", "Deportes", 40, 0);
        Juego juego7 = new Juego("The Witcher 3", "Aventura", 40, 0);
        Juego juego8 = new Juego("GOW Ragnarok", "Aventura", 70, 0);
        Juego juego9 = new Juego("Assassin's Creed Valhalla", "Aventura", 60, 0);

        ArrayList<Juego> juegosTerror = new ArrayList<>();
        juegosTerror.add(juego1);
        juegosTerror.add(juego2);
        juegosTerror.add(juego3);

        ArrayList<Juego> juegosDeportes = new ArrayList<>();
        juegosDeportes.add(juego4);
        juegosDeportes.add(juego5);
        juegosDeportes.add(juego6);

        ArrayList<Juego> juegosAventura = new ArrayList<>();
        juegosAventura.add(juego7);
        juegosAventura.add(juego8);
        juegosAventura.add(juego9);

        System.out.println("Bienvenido " + usuario.getNombre());
        System.out.println("Saldo actual: " + usuario.getSaldo());

        System.out.println("Elige un género: ");
        System.out.println("1. Terror");
        System.out.println("2. Deportes");
        System.out.println("3. Aventura");

        int opcionGenero = input.nextInt();
        String generoElegido;

        switch (opcionGenero) {
            case 1:
                generoElegido = "Terror";
                break;
            case 2:
                generoElegido = "Deportes";
                break;
            case 3:
                generoElegido = "Aventura";
                break;
            default:
                generoElegido = "Género no válido";
                System.out.println("Género no válido.");
                break;
        }
        System.out.println("Género elegido: " + generoElegido);
        input.nextLine();

        if (generoElegido.equalsIgnoreCase("Terror")) {
            Biblioteca.mostrarJuegos(juegosTerror);
        } else {
            if (generoElegido.equalsIgnoreCase("Deportes")) {
                Biblioteca.mostrarJuegos(juegosDeportes);
            } else {
                if (generoElegido.equalsIgnoreCase("Aventura")) {
                    Biblioteca.mostrarJuegos(juegosAventura);
                }
            }
        }
    }
}