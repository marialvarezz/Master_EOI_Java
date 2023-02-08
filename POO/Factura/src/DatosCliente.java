public class DatosCliente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String numtlf;
    private String email;

    //Constructor

    public DatosCliente(String nombre, String apellidos, String DNI, String numtlf, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.numtlf = numtlf;
        this.email = email;
    }

    //toString


    public String toString() {
        return "Datos del cliente: " +
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nDNI: " + DNI  +
                "\nNúmero de teléfono: " + numtlf  +
                "\nEmail: " + email;
    }
}
