import java.io.File;

public class BorrarCarpeta {
    public static void main(String[] args) {
        File archivo=new File("carpeta1");
        if (archivo.exists()){
            if (archivo.delete()){
                System.out.println(archivo.getName() + " ha sido eliminada con éxito");
            }else {
                if (archivo.isDirectory()){
                    System.out.println(archivo.getName() + " no se puede borrar, contiene "+archivo.list().length + " archivos");
                }else{
                    System.out.println("No se ha podido eliminar " + archivo.getName());
                }

            }

        }else {
            System.out.println("La carpeta "+ archivo.getName()+" no existe");
        }
    }
}
