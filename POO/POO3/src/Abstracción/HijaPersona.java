package Abstracción;

public class HijaPersona extends Persona {
    public String domicilio;

    public void visitaraPapá(){
        System.out.println("Visito a mi padre");
    }
    @Override
    public void registro() {
        System.out.println("Registro Usuario");
    }

    @Override
    public void editar() {
        System.out.println("Modifico datos usuario");
    }

    @Override
    public void borrar() {
        System.out.println("Eliminar usuario");
    }

    public HijaPersona(String nombre, String apellidos, String email, String domicilio) {
        super(nombre, apellidos, email);
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "HijaPersona " +
                "\ndomicilio= " + domicilio  +
                "\nnombre= " + nombre  +
                "\napellidos= " + apellidos +
                "\nemail= " + email;
    }
}
