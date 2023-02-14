import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploHashMap {
    public static void main(String[] args) {
        //Declaramos
        HashMap <Integer,String> mat= new HashMap<>();
        //Agregar
        mat.put(45445454,"Pepe");
        mat.put(45445445,"María");
        mat.put(45445421,"Laura");
        mat.put(45445411,"Load");
        mat.put(45445438,"Ana");
        System.out.println("mat.get(21) = " + mat.get(21));
        System.out.println("mat.get(22) = " + mat.get(45445454));
        //Obtener todas las claves
        System.out.println("mat.keySet() = " + mat.keySet());
        recorrer(mat);
        recorrer2(mat);
        //Buscar
        System.out.println("mat.containsKey(45445454) = " + mat.containsKey(45445454));
        System.out.println("mat.containsKey(21) = " + mat.containsKey(21));
        System.out.println("mat.containsValue(\"Pepe\") = " + mat.containsValue("Pepe"));
        System.out.println("-------------------------------");

        //Modificar
        mat.replace(45445454,"Edu");
        recorrer2(mat);
        System.out.println(mat.replace(45445454,"Edu","Javier"));
        recorrer2(mat);
        //Borrar clave determinada
        System.out.println("mat.remove(45445454) = " + mat.remove(45445454));
        recorrer2(mat);



    }
    public static void recorrer(HashMap<Integer,String>mat){
        for (Integer clave:mat.keySet()){
            System.out.println("clave = " + clave + " --> " + mat.get(clave));
        }
        System.out.println("------------------------------------------");
    }
    public static void recorrer2(HashMap<Integer,String> mapa){
        mapa.forEach((teléfono,nombre)-> {
            System.out.println("teléfono -> " + teléfono + " nombre -> " + nombre);
        });
        System.out.println("--------------------------------------------");
    }
    //no tiene interator
}
