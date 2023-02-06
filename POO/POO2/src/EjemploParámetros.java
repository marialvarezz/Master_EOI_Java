public class EjemploParámetros {
    public static void main(String[] args) {
        TipoCoche miCoche=TipoCoche.SEDAN;
        System.out.println("miCoche = " + miCoche);
        System.out.println("miCoche.getNombre() = " + miCoche.getNombre());
        System.out.println("miCoche.getDescripción() = " + miCoche.getDescripción());
        System.out.println("miCoche.getNumPuertas() = " + miCoche.getNumPuertas());

        System.out.println("miCoche.getNombre() = " + miCoche.getNombre());

        Amigos miAmigo = Amigos.LAURA;
        System.out.println("miAmigo = " + miAmigo);
        System.out.println("miAmigo.getNombre() = " + miAmigo.getNombre());
        System.out.println("miAmigo.getNumtlf() = " + miAmigo.getNumtlf());
        System.out.println("miAmigo.getCorreoe() = " + miAmigo.getCorreoe());
        System.out.println("--------------------------------------------------------------------------");
        
        //Como atributo en una clase
        Persona companiero = new Persona("Eduardo", "Corral","eduardo@corral.es",Amigos.BELÉN);
        System.out.println("companiero.getNombre() = " + companiero.getNombre());
        System.out.println("companiero.getApellidos() = " + companiero.getApellidos());
        System.out.println("companiero.getEmail() = " + companiero.getEmail());
        System.out.println("companiero.getMejorAmigo().getNombre() = " + companiero.getMejorAmigo().getNombre());
        companiero.setMejorAmigo(Amigos.CONCHA);
        System.out.println("companiero.getMejorAmigo().getNombre() = " + companiero.getMejorAmigo().getNombre());
        System.out.println("----------------------------------------------------------------------");
        muestraAmigo(companiero.getMejorAmigo());
        System.out.println("---------------------------------------------------------------------");
        companiero.setMejorAmigo(Amigos.VANE);
        System.out.println(companiero.getMejorAmigo().toString());
    }
    public static void muestraAmigo(Amigos amigos){
        System.out.println("amigos.getNombre() = " + amigos.getNombre());
        System.out.println("amigos.getNumtlf() = " + amigos.getNumtlf());
        System.out.println("amigos.getCorreoe() = " + amigos.getCorreoe());
    }
}
