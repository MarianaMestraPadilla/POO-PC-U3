package Ejercicio3_T16;

public class ServicioNotificaciones {
    public void notificar(Mensajero canal, String destinatario, String mensaje) {
        canal.enviarMensaje(destinatario, mensaje);
    }
}
