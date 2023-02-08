import subpaquete.Modificadores;

public class OtroEjemploModificadores {
    public static void main(String[] args) {
        Modificadores objeto=new Modificadores("María","Alvarez",20);
        objeto.nombreCompleto();
        objeto.nombre ="Belén";
        objeto.apellidos="López";
        objeto.setEdad(20);
    }
}
