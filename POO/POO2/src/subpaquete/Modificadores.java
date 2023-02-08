package subpaquete;

public class Modificadores {

        public String nombre;
        String apellidos;
        private int edad;

       public void nombreCompleto(){
            System.out.println(nombre+" "+apellidos + " tiene " + edad);
        }

    public Modificadores(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
