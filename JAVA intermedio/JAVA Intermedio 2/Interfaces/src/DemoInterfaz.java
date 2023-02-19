public class DemoInterfaz {
    public static void main(String[] args) {
        EjemploInterfaz ejemploMaria=new EjemploInterfaz("María","Álvarez");
        System.out.println(ejemploMaria.nombreCompleto());
        System.out.println(ejemploMaria.CONSTANTE1);
        ejemploMaria.métodoInterfaz();
        ejemploMaria.métodoInterfazb();

        EjemploInterfaz2 ejemploLaura=new EjemploInterfaz2("Laura", "Chenoa");
        System.out.println("ej = " + ejemploLaura.nombreCompleto());;
        ejemploLaura.métodoInterfaz();
        ejemploLaura.métodoInterface2();
        ejemploLaura.métodoInterfazb();
    }
}
