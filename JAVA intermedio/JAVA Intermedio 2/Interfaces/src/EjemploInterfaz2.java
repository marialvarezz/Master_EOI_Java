public class EjemploInterfaz2 implements Interface1,Interface2 { //Implementa dos interfaces
    String nombre;
    String apellidos;

    public EjemploInterfaz2(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String nombreCompleto (){
        return "Mi nombre es: " + nombre + " " + apellidos;
    }

    //Método de la Interfaz - implementado
    @Override
    public void métodoInterfaz() {
        System.out.println("Método de la interfaz 1");
    }

    @Override
    public void métodoInterfazb() {
        System.out.println("hola soy el b");
    }

    @Override
    public void métodoInterface2() {
        System.out.println("Método de la interfaz 2");
    }
}
