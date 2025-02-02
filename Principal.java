import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();
        Usuario[] usuarios = crearUsuarios();
        mostrarUsuarios(usuarios);
    }

    public static Usuario[] crearUsuarios() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos usuarios quieres crear? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine()

        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Rellena la informacion del usuario " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }

    public static void mostrarUsuarios(Usuario[] usuarios) {
        System.out.println("Lista de Usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre + ", Apellidos: " + usuario.apellidos + ", Email: " + usuario.email);
        }
    }

    public static void mostrarFechaYHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Fecha y Hora actual: " + dtf.format(now));
    }
}

