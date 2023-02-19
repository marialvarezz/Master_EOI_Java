package ConAbstracta;

public class Heredada extends Abstracta{
    String fecha;
    @Override
    void saludo() {
        System.out.println("holaaa");
    }

    @Override
    public void métodoInterfaz() {
        System.out.println("abstracto 1");
    }

    @Override
    public void métodoInterfazb() {
        System.out.println("abstracto 1b");

    }
}
