public class EjemploAnimal {
    public static void main(String[] args) {
        Perro miperro=new Perro();
        miperro.sonido();
        Serpiente miserpiente=new Serpiente();
        miserpiente.sonido();
        Caballo miCaballo=new Caballo();
        miCaballo.sonido();
        miserpiente.sonido("shhhhhhh");
    }
}
