package ConAbstracta;

public class Demo {
    public static void main(String[] args) {
        Heredada objeto=new Heredada();
        objeto.direccion="La mia";
        objeto.métodoInterfaz();
        objeto.métodoInterfazb();
        objeto.fecha="14 de febrero";
        System.out.println("objeto.fecha = " + objeto.fecha);
        System.out.println("objeto.direccion = " + objeto.direccion);
        
    }
}
