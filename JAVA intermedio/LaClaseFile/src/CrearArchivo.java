import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {

        try{
            File archivo=new File("miarchivo.txt");
            System.out.println("Crear archivo -> " + archivo.createNewFile());
            archivo.delete();
            //if(archivo.createNewFile()){
              //  System.out.println("Archivo creado");
            //}else {
              //  System.out.println("el archivo ya existe");
            //}
            if (!archivo.exists()){
                archivo.createNewFile();
                System.out.println("Archivo " + archivo.getName() +" creado");
            }else{
                System.out.println("el archivo ya existe");
            }
        }catch (IOException e){
            System.out.println("error al crear el archivo");
            System.out.println(e.toString());
        }

    }

}
