import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class EjemploArrayList {
    public static void main(String[] args) {
        //Crear ArrayList
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        //Agregar elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        //Añadir el valor a una posición deter
        numeros.add(2,22);
        numeros.set(2,11); //Cambiar el valor
        numeros.remove(2); //Borrar el valor
        recorrer(numeros);
        System.out.println("-------------------------------------------");

        //Buscar un elemento por su valor
        System.out.println("numeros.indexOf(3)= "+numeros.indexOf(3));  //Primer 3
        System.out.println(numeros.lastIndexOf(3));   //Último 3
        System.out.println("-------------------------------------------");
        //Dimensión
        System.out.println(numeros.size());
        System.out.println("-------------------------------------------");

        //Ordenar la ArrayList
        Collections.sort(numeros);
        recorrer(numeros);

        //Obtener un valor de una posición determinada
        System.out.println(numeros.get(4));
        System.out.println("----------------------------------");
        //Si un elemento está contenido en un ArrayList
        System.out.println("numeros.contains(7) = " + numeros.contains(7));
        System.out.println("numeros.contains(99) = " + numeros.contains(99));
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty()); //Consulta si está vacío

        //Eliminar todo el  contenido
        numeros.clear();
        recorrer(numeros);
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());

        numeros.add(3);
        numeros.add(6);
        numeros.add(2);
        numeros.add(99);
        numeros.add(88);
        numeros.add(77);

        System.out.println("--------------------------------------------");
        recorrer(numeros);
        System.out.println("-------------------------------------------");
        Collections.sort(numeros);
        recorrer(numeros);
        recorreIterator(numeros);
    }
       public static void recorrer (ArrayList<Integer> numeros){
        for (int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }}
        // o
        // for (Integer valor: numeros){
        //    System.out.println("valor = " + valor);
        //}

    public static void recorreIterator(ArrayList<Integer> num){
        Iterator<Integer> iterador=num.iterator();

        while (iterador.hasNext()){
            System.out.println("iterador.next() = " + iterador.next());
        }
    }
    }

