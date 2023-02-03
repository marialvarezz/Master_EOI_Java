public class Ejercicio {
    public static void main(String[] args) {
        String archivo = "i.e.mifoto.jpg";
        //Busco el último punto
        int punto = archivo.lastIndexOf('.');
        //Extraigo los nombres
        System.out.println("Nombre del archivo -> " + archivo.substring(0,punto));
        System.out.println("Extensión -> " + archivo.substring(punto));


    }
}
