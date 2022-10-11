package app.creational.builder.picodotdev;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new UsuarioBilder()
                .email("magadiflo@gmail.com")
                .nombre("Martín", "Díaz")
                .build();
        
        System.out.println(usuario);
    }
}
