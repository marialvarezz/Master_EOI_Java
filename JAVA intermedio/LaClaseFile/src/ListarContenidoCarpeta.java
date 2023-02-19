import java.io.File;

public class ListarContenidoCarpeta {
    public static void main(String[] args) {
        File archivo=new File("src");
        System.out.println(archivo.isDirectory());
        String[] lista=archivo.list();
        for (String nombre:lista) {
            System.out.println(nombre);
        }

    }
}
