package Ejercicio2_T16;

public class Main {
    public static void main(String[] args) {
        GestorExportacion gestor = new GestorExportacion();
        String texto = "Reporte Financiero 2026";

        Documento docPdf = new DocumentoPDF(texto);
        Documento docWord = new DocumentoWord(texto);
        Documento docExcel = new DocumentoExcel(texto);

        gestor.procesarExportacion(docPdf);
        gestor.procesarExportacion(docWord);
        gestor.procesarExportacion(docExcel);
    }
}
