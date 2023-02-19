import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejemploStream {
    public static void main(String[] args) {
        //Crear un Stream desde una lista de datos
        Stream<String> nombres=Stream.of("María","Jorge","Pepe","Ana");
        nombres.forEach(n -> System.out.println(n));
        System.out.println("----------------------------------------------");
        //Crear un Stream a partir de un Array
        String[] arraynom={"María","Jorge","Pepe","Ana"};
        Stream<String>nombres1= Arrays.stream(arraynom);
        nombres1.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        //Crear Stream "construyendolo con Stream builder
        Stream<String>nombres2=Stream.<String>builder()
                .add("María")
                .add("Pepe")
                .add("Ana")
                .build();
        nombres2.forEach(System.out::println);


        //operador map y peek
        Stream<String>nombres4=Stream.of("María","Jorge","Pepe","Ana");
        nombres4//.peek(nom-> System.out.println(nom + " <- nom antes"))
                .map(nom->nom.toUpperCase())
                //.peek(n-> System.out.println(n + " <- nombre después"))
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        //Convertir en colección
        Stream<String>nombres5= Arrays.stream(arraynom);
        List<String>lista=nombres5.map(nom->nom.toUpperCase())
                .map(nom->nom.toLowerCase())
                .collect(Collectors.toList());
        lista.forEach(System.out::println);

        //Convertir en objetos
        Stream<String>nombres6= Arrays.stream(arraynom);
                nombres6.map(nombre->new Usuario(nombre,null,null))
                .peek(us-> System.out.println(us.getNombre()))
                .forEach(usuario-> System.out.println(usuario.toString()));

        Stream<String> nombres8 = Stream.of("Juan", "Marta", "José", "María")
                .map(nombre -> nombre.toUpperCase())
                //.filter(u -> u.equals("JUAN"))
                .filter(u -> u.contains("M"))
                .map(u->u.substring(0,1).toUpperCase()+u.substring(1).toLowerCase());

        nombres8.forEach(e -> System.out.println(e));


    }
}
