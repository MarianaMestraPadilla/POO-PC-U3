package Ejercicicio2_T16;

public abstract class Documento {
    protected String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public abstract void exportar();
}
