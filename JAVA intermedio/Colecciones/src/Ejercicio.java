import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio {
    public static void main(String[] args) {
        //List
        //Crear un ArrayList de números enteros y ordenarlos
        ArrayList<Integer>num=new ArrayList<>();
        num.add(2);
        num.add(6);
        num.add(1);
        num.add(5);
        num.add(2,23);
        num.add(17);
        recorrer(num);
        Collections.sort(num);
        recorrer(num);
        //Recorrer con Iterator
        Iterator<Integer> it=num.iterator();
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
        System.out.println("--------------------------------------------");


        


        //Crea un LinkedList de String, añade elementos, añade un elemento al principio, otro al final, busca, …. y ordénalo.
        LinkedList<String>mat=new LinkedList<>();
        mat.add("María");
        mat.add("Pepe");
        mat.add("Edu");
        mat.add("Ale");
        mat.add("Laura");
        recorrer(mat);
        mat.addFirst("Marta");
        mat.add("Vicenta");
        System.out.println("mat.indexOf(\"María\") = "+mat.indexOf("María"));
        mat.remove(3);
        mat.remove("Ale");
        Collections.sort(mat);
        recorrer(mat);




        //Set
        //Hashset - solo se recorre con un foreach - no siguen el orden de introducción
        HashSet<String>matset= new HashSet<>();
        matset.add("María");
        matset.add("Ana");
        matset.add("Pepe");
        matset.add("Edu");
        //matset.add("Pepe");- no se puede repetir los elementos
        for (String valor:matset) {
            System.out.println("valor = " + valor);
        }
        System.out.println("----------------------------------------");
        //HashMap
        HashMap<String,String> emails=new HashMap<>();
        emails.put("juan@eoi.es","Juan");
        emails.put("maria@eoi.es","María");
        emails.put("ana@eoi.es","Ana");
        emails.put("anaperez@eoi.es","Ana");
        emails.put("paco@eoi.es","Paco");

        //Introduce el dato por ventana emergente
        Scanner scn1=new Scanner(System.in);
        System.out.print("Introduce el usuario: ");
        String usuario=scn1.nextLine();

        AtomicInteger i = new AtomicInteger();

        emails.forEach((Email,Nombre)->{

            if (usuario.equals(Nombre)){
                System.out.println("Email: " + Email + " - Nombre : " + Nombre);
                i.set(1);

            }
        });
        if(i.get() ==0){
            System.err.println("Usuario no encontrado");
        }




        }

    public static void recorrer(ArrayList<Integer> num){
        for (int i=0;i<num.size();i++){
            System.out.println("num["+i+"] = " + num.get(i));
        }
        System.out.println("----------------------------------------");
    }
    public static void recorrer2(ArrayList<Integer> num){
        for(Integer valor:num){
            System.out.println("valor = " + valor);
        }
    }
    public static void recorrer(LinkedList<String>mat){
        for (int i=0;i<mat.size();i++){
            System.out.println("num["+i+"] = " + mat.get(i));
        }
        System.out.println("----------------------------------------");
    }
    }



