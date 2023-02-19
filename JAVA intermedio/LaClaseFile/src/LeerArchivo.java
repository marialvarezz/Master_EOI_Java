import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        try{
            File archivo=new File("miarchivo.txt");
            Scanner leer=new Scanner(archivo);
            while(leer.hasNextLine()){
                String linea=leer.nextLine();
                System.out.println(linea);
            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
            System.out.println(e.toString());
        }
    }
}
