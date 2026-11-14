package ejercicio3_taller15;

public class UsuarioMonolitico {
    private String correo;
    private String clave;

    public UsuarioMonolitico(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public boolean validarFormatoCorreo() {
        return correo != null && correo.contains("@");
    }

    public boolean autenticar(String claveIngresada) {
        return this.clave.equals(claveIngresada);
    }
}