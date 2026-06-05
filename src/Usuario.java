public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private double salario;

    public Usuario(String Nombre, int Edad, String Correo, double Salario){
        SetNombre(Nombre);
        SetEdad(Edad);
        SetCorreo(Correo);
        SetSalario(Salario);
    }

    public void SetNombre(String Nombre){
        nombre = Nombre;
    }

    public String GetNombre(){
        return nombre;
    }

    public void SetEdad(int Edad){
        edad = Edad;
    }

    public int GetEdad(){
        return edad;
    }

    public void SetCorreo(String Correo){
        correo = Correo;
    }

    public String GetCorreo(){
        return correo;
    }

    public void SetSalario(double Salario){
        salario = Salario;
    }

    public double GetSalario(){
        return salario;
    }
}