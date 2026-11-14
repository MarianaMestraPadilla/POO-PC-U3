package Ejercicio2_T16;

public class DocumentoExcel extends Documento {
    public DocumentoExcel(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a Excel (.xlsx): [" + contenido + "]");
    }
}
