import java.io.File;
import java.io.IOException;

public class CrearCarpeta {
    public static void main(String[] args) {
        File archivo=new File("carpeta1/subcarpeta2");
        File archivo2=new File("carpeta1/subcarpeta2/subsub3");

        File archivo1=new File("carpeta1/miarchivo.txt");
        archivo.mkdirs();
        archivo2.mkdirs();
        try{
            archivo2.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

        try {
            archivo1.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
