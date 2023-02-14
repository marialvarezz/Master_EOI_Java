import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploHashSet {
    public static void main(String[] args) {
        //Declaración
        HashSet<Integer>mat=new HashSet<>();
        //Agregar elementos
        mat.add(5);
        mat.add(6);
        mat.add(12);
        mat.add(7);
        mat.add(3);
        recorrer(mat);
        
        //Agregar duplicado
        System.out.println("mat.add(7) = " + mat.add(7));
        System.out.println("mat.add(23) = " + mat.add(23));
        recorrer(mat);

        //Eliminar
        mat.remove(12);
        recorrer(mat);
        recorreIterator(mat);
        //Buscar
        System.out.println("mat.contains(12) = " + mat.contains(12));
        System.out.println("mat.contains(23) = " + mat.contains(23));
        System.out.println("mat.isEmpty() = " + mat.isEmpty());
        mat.clear();
        System.out.println("mat.isEmpty() = " + mat.isEmpty());


    }

    public static void recorrer(HashSet<Integer> mat){
        for (Integer n:mat){
            System.out.println("n = " + n);
        }
        System.out.println("---------------------------------------");
    }
    public static void recorreIterator(HashSet<Integer> num){
        Iterator<Integer> iterador=num.iterator();

        while (iterador.hasNext()){
            System.out.println("iterador.next() = " + iterador.next());
        }
        System.out.println("-----------------------------------------");
    }

}
