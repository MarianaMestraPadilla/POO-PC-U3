package Ejercicio2_T16;

public class DocumentoWord extends Documento {
    public DocumentoWord(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a Word (.docx): [" + contenido + "]");
    }
}
