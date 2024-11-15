package proyectofinal;

import java.util.*;

public class Usuario {

    String nombre;
    String email;
    String contrasena;
    double saldo;

    public Usuario(String nombre, String email, String contrasena, double saldo) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void actualizarDatos(String nuevoNombre, String nuevoCorreo, String nuevaContrasena) {
        nombre = nuevoNombre;
        email = nuevoCorreo;
        contrasena = nuevaContrasena;
    }

    public void agregarSaldo(double monto) {
        this.saldo += monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void realizarCompra(double precioJuego) {
        if (this.saldo >= precioJuego) {
            this.saldo -= precioJuego;
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("Saldo insuficiente para realizar la compra.");
        }
    }

    public void eliminarCompra(String tituloJuego) {
        System.out.println("Se eliminará la compra del juego: " + tituloJuego + " (sin reembolso).");
    }

    public void recargarSaldo(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Saldo recargado exitosamente. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("La cantidad a recargar debe ser mayor que 0.");
        }
    }
}
