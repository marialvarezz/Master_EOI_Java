import java.io.File;

public class InfoArchivo {
    public static void main(String[] args) {
        File archivo = new File("miarchivo.txt");
        if(archivo.exists()){
            System.out.println("archivo.getName() = " + archivo.getName());
            System.out.println("archivo.getAbsolutePath() = " + archivo.getAbsolutePath());
            System.out.println("archivo.canRead() = " + archivo.canRead());
            System.out.println("archivo.canExecute() = " + archivo.canExecute());
            System.out.println("archivo.canWrite() = " + archivo.canWrite());

        }else {
            System.out.println("archivo no encontrado");
        }
    }

}
