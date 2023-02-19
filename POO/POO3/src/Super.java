public class Super {
    public static void main(String[] args) {
    Persona prs1=new Persona("Pepe", "Perez");
    prs1.metodoPersona();

    Alumno alno1=new Alumno("María","Álvarez", "3º","IES Pepito");
        System.out.println(alno1.toString());
        alno1.metodoPersona();
        System.out.println("..................................................................");
        alno1.alumno();
        System.out.println("------------------------------------------------------------------");
        System.out.println(prs1.otroMetodoPersona());
        System.out.println(alno1.otroMetodoPersona());
    }

}
class Persona{
    String nombre;
    String apellido;

    public void metodoPersona (){
        System.out.println("Yo soy " + nombre + " " + apellido);
    }
    public int otroMetodoPersona(){
        int res=45;
        return res;
    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}//Superclase

class Alumno extends Persona{
   String curso;
   String centro;

    public void metodoPersona (){
        super.metodoPersona();
        System.out.println("...y tú lo sabes");
    }
    //Constructor
    public Alumno(String nombre, String apellido, String curso, String centro) {
        super(nombre, apellido);
        this.curso = curso;
        this.centro = centro;
    }
    public int otroMetodoPersona(){
        int resultadoMetodo=super.otroMetodoPersona();
        int a= 2*resultadoMetodo++;
        return a;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", centro='" + centro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
    public void alumno(){
        System.out.println("Hola!");
        super.metodoPersona();
    }
}//Subclase



