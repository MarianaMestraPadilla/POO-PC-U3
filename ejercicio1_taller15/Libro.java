package ejercicio1_taller15;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
}

class LibroReporte {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte -> Título: " + libro.getTitulo() + " | Autor: " + libro.getAutor());
    }
}

class LibroRepositorio {
    public void guardar(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' en la base de datos...");
    }
}
