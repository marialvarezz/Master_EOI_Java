import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        //Declaración
        LinkedList<Integer> mat=new LinkedList<>();
        //Añadir elementos
        mat.add(5);
        mat.add(7);
        mat.add(4);
        mat.add(12);
        recorrer(mat);
        mat.add(2,23);
        recorrer(mat);

        //add Específicos LinkedList
        mat.addFirst(66);
        mat.addLast(2);
        recorrer(mat);

        //Ordenar
        Collections.sort(mat);
        recorrer(mat);

        //Eliminar
        mat.remove(2);
        recorrer(mat);
        //remove específicos LinkedList
        mat.removeFirst();
        mat.removeLast();
        recorrer(mat);
        
        mat.add(12);
        
        //Buscar
        System.out.println("mat.indexOf(12) = " + mat.indexOf(12));
        System.out.println("mat.indexOf(3) = " + mat.indexOf(3));
        System.out.println("mat.lastIndexOf(12) = " + mat.lastIndexOf(12));
        System.out.println("mat.contains(33) = " + mat.contains(33));
        System.out.println("mat.contains(23) = " + mat.contains(23));
        recorreIterator(mat);

        //Vaciar
        mat.clear();
        System.out.println("mat.isEmpty() = " + mat.isEmpty());


    }
    public static void recorrer(LinkedList <Integer> mat){
        for (int i=0;i<mat.size();i++){
            System.out.println("mat.get(" + i+") = " + mat.get(i));

        }
        System.out.println("--------------------------------------");
    }
    public static void recorreIterator(LinkedList<Integer> num){
        Iterator<Integer> iterador=num.iterator();
        while (iterador.hasNext()){
            System.out.println("iterador.next() = " + iterador.next());
        }
    }

}
