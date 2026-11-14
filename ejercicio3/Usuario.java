package ejercicio3;

public class Usuario {
    private String correo;
    private String clave;

    public Usuario(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public String getCorreo() { return correo; }
    public String getClave() { return clave; }
}

class ValidadorUsuarioService {
    public boolean validarDatos(Usuario usuario) {
        return usuario.getCorreo() != null && usuario.getCorreo().contains("@")
                && usuario.getClave() != null && usuario.getClave().length() >= 6;
    }
}

class AutenticacionService {
    public boolean iniciarSesion(Usuario usuario, String claveIngresada) {
        return usuario.getClave().equals(claveIngresada);
    }
}
