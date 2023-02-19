package Abstracción;

    abstract  class Persona {//Siempre una superclase -> no se puede instanciar objetos, solo se hereda
   //atributos
    protected String nombre;
    protected String apellidos;
    protected String email;


    //métodos abstractos
    abstract public void registro();
    abstract public void  editar();
    abstract public void borrar();

    //métodos "normales"
    public String nombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }


    //Constructor
    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
}
