package subpaquete;


public class PersonaSubpaquete {
    //Atributos
    private String nombre;
    private String apellidos;
    private String email;
    private Amigos mejorAmigo;
    private String dirección;

    //Constructor

    public PersonaSubpaquete(String nombre, String apellidos, String email, Amigos mejorAmigo, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.mejorAmigo = mejorAmigo;
        this.dirección = direccion;
    }
    //Setter y Getter


    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Amigos getMejorAmigo() {
        return mejorAmigo;
    }

    public void setMejorAmigo(Amigos mejorAmigo) {
        this.mejorAmigo = mejorAmigo;
    }


    public String toString() {
        return "PersonaSubpaquete ->" +
                "\nnombre= " + nombre  +
                "\napellidos= " + apellidos  +
                "\nemail= " + email  +
                "\nmejorAmigo= " + mejorAmigo +
                "\ndirección= " + dirección;

    }
}
