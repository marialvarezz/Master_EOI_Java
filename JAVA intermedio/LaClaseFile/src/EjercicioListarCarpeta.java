import java.io.File;

public class EjercicioListarCarpeta {
    static int nivel =0;
    public static void main(String[] args) {
        File archivo=new File(".");
        recorrer(archivo);
    }
    public static void recorrer (File archivo){
        if (archivo.exists()){
            nivel++;
            File[] listado=archivo.listFiles();

            for (File lista:listado) {
                for (int i=0;i<nivel;i++){

                }
                if (lista.isDirectory()){
                     System.out.println(lista.getName() + " -> directorio");
                     recorrer(lista);
                }else{
                    System.out.println("\t" + lista.getName() + "\t\t" + lista.length() + " bytes");
                }
            }
            nivel--;

        }else{
            System.out.println("el archivo no existe");
        }
    }
}
