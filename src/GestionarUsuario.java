import java.util.ArrayList;
import java.util.Scanner;

public class GestionarUsuario {
    private ArrayList<Usuario> Usuarios;
    private Scanner scan = new Scanner(System.in);

    public GestionarUsuario(){
        Usuarios = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void RegistrarUsuario(){
        scan.nextLine();
        System.out.print("Digite el nombre: ");
        String nombre = scan.nextLine();
        
        System.out.print("Digite el edad: ");
        int edad = scan.nextInt();

        scan.nextLine();
        System.out.print("Digite el correo: ");
        String correo = scan.nextLine();

        System.out.print("Digite el salario: ");
        double salario = scan.nextDouble();

        Usuario nuevoUsuario = new Usuario(nombre, edad, correo, salario);
        Usuarios.add(nuevoUsuario);
    }

    public void Menu(){
        int op;
        do {
            System.out.print("\nDigite:\n1-Registrar usuario\n2-Salir\n");
            op = scan.nextInt();
            switch(op){
                case 1:
                    RegistrarUsuario();
                    break;
                case 2:
                    System.out.print("Tenga un feliz dia!");
                default:
                    break;
            }
        } while (op!=2);
    }
}