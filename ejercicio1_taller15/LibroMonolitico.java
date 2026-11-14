package ejercicio1_taller15;

public class LibroMonolitico {
    private String titulo;
    private String autor;

    public LibroMonolitico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void generarReporte() {
        System.out.println("Generando reporte del libro: " + titulo);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando '" + titulo + "' en la base de datos...");
    }
}
