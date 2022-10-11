package app.creational.builder.picodotdev;

public class Usuario {

    private String email; //En el ejemplo, este atributo es requerido, los demás son opcionales
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    Usuario(UsuarioBilder bilder) {
        if (bilder.getEmail() == null) {
            throw new IllegalArgumentException("Email es requerido");
        }
        this.email = bilder.getEmail();
        this.nombre = bilder.getNombre();
        this.apellidos = bilder.getApellidos();
        this.telefono = bilder.getTelefono();
        this.direccion = bilder.getDireccion();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("email='").append(email).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
