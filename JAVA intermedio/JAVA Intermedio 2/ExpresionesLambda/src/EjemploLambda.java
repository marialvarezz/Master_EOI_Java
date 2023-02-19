import java.util.ArrayList;
import java.util.function.Consumer;

public class EjemploLambda {
    public static void main(String[] args) {
        ArrayList<Integer>cifras=new ArrayList<>();
        cifras.add(89);
        cifras.add(8);
        cifras.add(9);
        cifras.add(25);

        cifras.forEach((n)-> System.out.println("n = " +n));
        System.out.println("-------------------------------------");

        //bloque
        cifras.forEach((n)->{
            if(n==89){
                System.out.println("El " + n);
            }else{
                n*=2;
            }
            System.out.println("n = " + n);
        });
        System.out.println("------------------------------------");

        // Asignar lamba a variable de tipo emun
        Consumer numerar=(n)-> System.out.println("nconsumer = "  + n);
        cifras.forEach(numerar);
        System.out.println("-------------------------------------");

        //Lambda + Interfaz FunciónString
        FunciónString interrogación=(s)->"¿"+s+"?";
        System.out.println(interrogación.ejecuta("a"));
        FunciónString admiración=(s)->"¡" +s+ "!";
        imprimeTexto("Laura",admiración);

        //Lambda + Interfaz FunciónNumeros
        FunciónNúmeros suma=(i,v)->i+v;
        System.out.println("suma.ejecuta(3,6) = " + suma.ejecuta(3,6));
        FunciónNúmeros resta=(i,v)->i-v;
        System.out.println("resta.ejecuta(99,67) = " + resta.ejecuta(99,67));
    }
    public static void imprimeTexto(String str,FunciónString ind){
        System.out.println(ind.ejecuta(str));
    }
}
