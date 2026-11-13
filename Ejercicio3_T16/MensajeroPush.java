package Ejercicio3_T16;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando Notificación Push al dispositivo de " + destinatario + ": " + mensaje);
    }
}
