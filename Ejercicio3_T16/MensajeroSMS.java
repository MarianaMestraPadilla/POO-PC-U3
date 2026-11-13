package Ejercicio3_T16;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS al número " + destinatario + ": " + mensaje);
    }
}
