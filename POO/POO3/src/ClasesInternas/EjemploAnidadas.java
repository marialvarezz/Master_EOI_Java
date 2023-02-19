package ClasesInternas;

public class EjemploAnidadas {
    public static void main(String[] args) {

            ClaseExterna objetoExterno=new ClaseExterna();
            System.out.println("objetoExterno.x = " + objetoExterno.x);

        //Llamas al "objeto externo para acceder a la clase(no es estática)"
            ClaseExterna.Vector unvector=objetoExterno.new Vector(5,7);
        System.out.println(unvector.x);
        ClaseExterna.Interna1 inter =objetoExterno.new Interna1();
        System.out.println(inter.k);

        //solo si es estático puedes instanciarlo sin llamar a un objeto externo
        ClaseExterna.InternaStatic miStatic=new ClaseExterna.InternaStatic();
        System.out.println(miStatic.i);

        objetoExterno.modulovector(objetoExterno.miVector);
    }
}
