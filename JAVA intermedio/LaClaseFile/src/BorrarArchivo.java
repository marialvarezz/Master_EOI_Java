import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        File archivo=new File("miarchivo.txt");
        if(archivo.exists()){
            if(archivo.delete()){
                System.out.println("Archivo " + archivo.getName()+ " eliminado con éxito");
            }else {
                System.out.println("El archivo " + archivo.getName() + " no se puede eliminar");
            }

        }else {
            System.out.println("El archivo " + archivo.getName() + " no existe");
        }
    }
}
