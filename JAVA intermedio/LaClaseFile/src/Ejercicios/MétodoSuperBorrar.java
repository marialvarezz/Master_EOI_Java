package Ejercicios;

import java.io.File;

public class MétodoSuperBorrar {
    public static void main(String[] args) {
        File archivo=new File("carpeta1");
        superborrar2(archivo);


    }

   //Crear un método para borrar una carpeta con contenido.
    public static void superborrar2(File archivo){
        if (archivo.exists()){
            if (archivo.isDirectory()){

                archivo.delete();

                if(archivo.exists()){
                    File[] listado=archivo.listFiles();
                    for(File lista:listado){

                        superborrar2(lista);
                        lista.delete();
                    }

                }
            }else{
                archivo.delete();
                System.out.println("el archivo " + archivo.getName() +" ha sido borrado con éxito.");

            }
            if (archivo.exists()){
                System.out.println(archivo.getName() + " ha sido eliminado");
                archivo.delete();
            }
        }else{
            System.out.println("el archivo " + archivo.getName() + " no existe.");
        }
    }
}
