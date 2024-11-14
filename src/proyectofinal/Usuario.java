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
}
