package proyectofinal;

public class Juego {

    String titulo;
    String genero;
    double precio;
    int valoracion;

    public Juego(String titulo, String genero, double precio, int valoracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.valoracion = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public void agregarValoracion(int valoracion) {
        if (valoracion >= 1 && valoracion <= 5) {
            this.valoracion = valoracion;
            System.out.println("Valoración del juego: " + valoracion);
        } else {
            System.out.println("Valoración no válida. Debe ser entre 1 y 5.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Precio: " + precio);
        System.out.println("Valoración: " + valoracion + " estrellas");
    }

}