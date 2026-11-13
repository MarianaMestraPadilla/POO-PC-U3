package Ejercicio3_T16;

public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicio = new ServicioNotificaciones();

        Mensajero email = new MensajeroEmail();
        Mensajero sms = new MensajeroSMS();
        Mensajero push = new MensajeroPush();

        servicio.notificar(email, "Mariana@correo.com", "Bienvenido al sistema.");
        servicio.notificar(sms, "+57 3001234567", "Tu código de verificación es 4829.");
        servicio.notificar(push, "ID_Dispositivo_99", "Tienes una nueva alerta.");
    }
}
