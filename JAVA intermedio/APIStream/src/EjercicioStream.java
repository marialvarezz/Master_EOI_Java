import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Stream;

public class EjercicioStream {
    //Crear un stream desde un archivo
    //con los datos del archivo creamos objetos tipo Usuario
    //Imprimimos el contenido de los objetos

    public static void main(String[] args) {
        File archivo=new File("listaalumnos.txt");
        ArrayList<Usuario>lista=new ArrayList<>(); //Opción 2
        //try(Stream<String>lineas= Files.lines(archivo.toPath())){
        try {
            //Opción 1
            Stream<String>lineas=Files.lines(archivo.toPath());
            lineas.map(lin->lin.split(";"))
                            .map(lin->new Usuario(lin[0],lin[1],lin[2],lin[3]))
                            .forEach(System.out::println);


            //Opción 2
            Stream<String>lineas2=Files.lines(archivo.toPath());
            lineas2.forEach(lin->{
                String[]campos=lin.split(";");
                Usuario us=new Usuario(campos[0],campos[1],campos[2],campos[3]);
                lista.add(us);
            });

        }catch (Exception e){
            System.out.println("e = "+e.toString());
        }

        //recorrer el Array - opción 2
        lista.forEach(n-> System.out.println(n.toString()));
    }
}
