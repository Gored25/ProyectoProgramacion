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
        Juego juego2 = new Juego("FIFA 23", "Deportes", 60, 0);
        Juego juego3 = new Juego("The Witcher 3", "Aventura", 40, 0);

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
            System.out.println("Estos son los juegos a disposición");
            System.out.println("--------------------");
            System.out.println("Resident Evil Village");
            System.out.println("Outlast");
            System.out.println("Silent Hill 2");
            System.out.println("Alien: Isolation");
            System.out.println("Amnesia: The Dark Descent");
        } else {
            if (generoElegido.equalsIgnoreCase("Deportes")) {
                System.out.println("Estos son los juegos a disposición");
                System.out.println("--------------------");
                System.out.println("Football Manager 2025");
                System.out.println("Fifa 17");
                System.out.println("EA Sports FC 25");
                System.out.println("eFootball 2005");
                System.out.println("NBA 2K");
            } else {
                if (generoElegido.equalsIgnoreCase("Aventura")) {
                    System.out.println("Estos son los juegos a disposicion");
                    System.out.println("--------------------");
                    System.out.println("GOW Ragnarok");
                    System.out.println("Zelda BOTW");
                    System.out.println("Assassin's Creed Valhalla");
                    System.out.println("Batman Arkham Knight");
                    System.out.println("Red dead Redemption 2");
                } else {
                }
            }
        }
    }
}
