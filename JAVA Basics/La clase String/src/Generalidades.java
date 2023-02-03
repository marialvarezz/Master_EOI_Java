public class Generalidades {
    public static void main(String[] args) {
        //Declaraciones
        String nombre = new String("María");
        System.out.println("nombre = " + nombre);
        String apellido = "Alvarez";
        System.out.println("apellido = " + apellido);

        //"Escapar las comillas"
        String bienvenida = "El nombre auténtico de Pepé es \"José\" Martin";
        System.out.println("bienvenida = " + bienvenida);

        //Concatenar
        System.out.println("El nombre completo es " + nombre + " " + apellido);
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);

        //Comparar
        String uno = "María Álvarez";
        String dos = new String("María Álvarez");
        //String dos = "María Álvarez";
        System.out.println("uno = " + uno);
        System.out.println("dos = " + dos);
        System.out.println("uno == dos -> " + (uno == dos)); //no!
        System.out.println("uno.equals(dos) -> " + uno.equals(dos));
    }
}
