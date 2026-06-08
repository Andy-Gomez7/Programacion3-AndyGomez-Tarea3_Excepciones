public class UsuarioService{
    public static void validarUsuario(String nombre, int edad, String correo, double salario) throws Exception{
        if(nombre.length() < 3){
            throw new NombreInvalido("El nombre debe contener al menos 3 caracteres\n");
        }
        if(edad < 18 || edad > 100){
            throw new EdadInvalida("La edad debe ser mayor o igual a 18");
        }
        if(!(correo.contains("@") && correo.contains("y") && correo.contains("."))){
            throw new CorreoInvalido("El correo electronico no es valido");
        }
        if(salario < 0){
            throw new SalarioInvalido("El salario debe ser mayor a 0");
        }
    }
}
