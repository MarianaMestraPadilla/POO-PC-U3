package Ejercicio3_T16;

public class MensajeroEmail extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
    }
}
