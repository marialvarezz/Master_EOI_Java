public class EjemploInterfaz implements Interface1 {
    String nombre;
    String apellidos;

    //Constructor
    public EjemploInterfaz(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //método de la clase
    public String nombreCompleto (){
        return "Mi nombre es: " + nombre + " " + apellidos;
    }

    //Método de la Interfaz - implementado
    @Override
    public void métodoInterfaz() {
        System.out.println("Método de la interfaz 1");
    }
    public void métodoInterfazb(){
        System.out.println("soy el b");
    }
}
