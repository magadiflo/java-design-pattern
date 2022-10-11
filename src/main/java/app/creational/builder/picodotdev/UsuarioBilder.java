package app.creational.builder.picodotdev;

public class UsuarioBilder {

    private String email;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    public UsuarioBilder() {
    }

    public UsuarioBilder email(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBilder nombre(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        return this;
    }

    public UsuarioBilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public UsuarioBilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    //Construcción de la instancia de usuario **********
    public Usuario build() {
        return new Usuario(this);
    }
    //**************************************************

    //Getters
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
