import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionarUsuario {
    private ArrayList<Usuario> Usuarios;
    private Scanner scan = new Scanner(System.in);

    public GestionarUsuario(){
        Usuarios = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void RegistrarUsuario() throws Exception{
        try{
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

            UsuarioService.validarUsuario(nombre, edad, correo, salario);

            Usuario nuevoUsuario = new Usuario(nombre, edad, correo, salario);
            Usuarios.add(nuevoUsuario);

        }catch(InputMismatchException a){
            scan.nextLine();
            System.out.println("Error: debe ingresar un numero valido");
        }catch(NombreInvalido e)
        {
            System.out.println(e.getMessage());

        }catch(EdadInvalida i)
        {
            System.out.println(i.getMessage());

        }catch(CorreoInvalido o){
            System.out.println(o.getMessage());
            
        }catch(SalarioInvalido u){
            System.out.println(u.getMessage());

        }finally{
            System.out.println("Proceso finalizado");

        }
    }

    public void Menu() throws Exception{
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