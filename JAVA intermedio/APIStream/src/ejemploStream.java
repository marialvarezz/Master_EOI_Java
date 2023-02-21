import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
                nombres6.map(nombre->new Usuario(nombre,null,null,null))
                .peek(us-> System.out.println(us.getNombre()))
                .forEach(usuario-> System.out.println(usuario.toString()));


        //Filter
        Stream<String> nombres7 = Stream.of("Juan", "Marta", "José", "María");
        nombres7.filter(n->n.contains("a")).forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        Stream<String> nombres8 = Stream.of("Juan", "Marta", "José", "María")
                .map(nombre -> nombre.toUpperCase())
                //.filter(u -> u.equals("JUAN"))
                .filter(u -> u.contains("M"))
                .map(u->u.substring(0,1).toUpperCase()+u.substring(1).toLowerCase());

        nombres8.forEach(e -> System.out.println(e));
        System.out.println("-------------------------------------------------------");

        //anyMatch y allMatch
        //anyMatch - al menos uno coincide
        Boolean nombres9 = Stream.of("Juan", "Marta", "José", "María")
                .map(n->n.toUpperCase())
                .anyMatch(v->v.contains("J")); //te devuelve un boolean
        System.out.println("nombres9 = " + nombres9);


        //allMatch - si todos los elementos cumplen la condición
        Boolean nombres10 = Stream.of("Juan", "Marta", "José", "María")
                .map(n->n.toUpperCase())
                .filter(i->i.contains("M"))
                .allMatch(v->v.contains("A"));
        System.out.println("nombres10 = " + nombres10);

        System.out.println("-------------------------------------------------------");

        //Count - cuenta los datos que tiene
        long contador =Stream.of("Juan", "Marta","","José","María")
                .filter(nom->!nom.isEmpty())
                .count();
        System.out.println("contador = " + contador);
        System.out.println("-------------------------------------------------------");

        //Distinct - elimina los duplicados
        Stream<String> nombres11 = Stream.of("Juan","Marta","Juan","José","Juan", "María")
                .distinct();
        nombres11.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");

        //Reduce
        String nombres12 = Stream.of("Juan","Marta","Juan","José","Juan", "María")
                .distinct()
                .reduce("Resultado concatenado = ",(a,b)->a+","+b);
        System.out.println("nombres12 = " + nombres12);

        Stream<Integer> num=Stream.of(5,10,15,20,25);
        int resultados=num.reduce(0,(a,b)->a+b); //el indentify se suma al resultado final
        System.out.println("resultados = " + resultados);

        Stream<Integer> num2=Stream.of(5,10,15,20,25);
        resultados=num2.reduce(1,(a,b)->a*b);
        System.out.println("resultados = " + resultados);
        System.out.println("-------------------------------------------------------");
        
        //Rangos numéricos
        //Sum - solo válidos para IntStream
        IntStream numeros=IntStream.range(5,20)
        //.peek(System.out::println)
        .peek(n-> System.out.println(n));
        System.out.println("numeros.sum() = " + numeros.sum());


        //eliminar los que no sean múltiplos de 5
        IntStream numeros2=IntStream.range(5,20)
                //.peek(System.out::println)
                //.peek(n-> System.out.println(n))
                .map(n->{
                    if ((n%5)!=0)
                        n=0;
                    return n;
                })
                .filter(n->n>0)
                .peek(n-> System.out.println(n));
        System.out.println("numeros.sum() = " + numeros2.sum());
        System.out.println("-------------------------------------------------------");

        //Estadísticas - solo válidos para IntStream
        IntStream numeros3=IntStream.rangeClosed(5,20)
                .peek(System.out::println);
        IntSummaryStatistics estadística=numeros3.summaryStatistics();
        System.out.println("estadística.getMax() = " + estadística.getMax());
        System.out.println("estadística.getMin() = " + estadística.getMin());
        System.out.println("estadística.getAverage() = " + estadística.getAverage());
        System.out.println("estadística.getSum() = " + estadística.getSum());
        System.out.println("estadística.getCount() = " + estadística.getCount());
        System.out.println("estadística.toString() = " + estadística.toString());

        IntStream numeros4=IntStream.of(5,10,15,30,4,20);
        IntSummaryStatistics estadística2=numeros4.summaryStatistics();
        System.out.println("estadística.getMax() = " + estadística2.getMax());
        System.out.println("estadística.getMin() = " + estadística2.getMin());
        System.out.println("estadística.getAverage() = " + estadística2.getAverage());
        System.out.println("estadística.getSum() = " + estadística2.getSum());
        System.out.println("estadística.getCount() = " + estadística2.getCount());
        System.out.println("estadística.toString() = " + estadística2.toString());
        System.out.println("-------------------------------------------------------");



    }
}
