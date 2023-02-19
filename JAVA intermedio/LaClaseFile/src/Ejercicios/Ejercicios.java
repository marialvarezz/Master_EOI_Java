package Ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        //Listar el contenido de una carpeta del sistema de archivos y de todas sus subcarpetas mostrando
        // el tamaño de los archivos

        File archivo=new File(".");
        recorrer(archivo);



        //Crear un archivo y guardar en el contenido de un array (o estructura de datos similar) que contenga nombres
        // y correos electrónicos.

        //Declaro los archivos y los arrays
        File archivo2=new File("listaalumnos.csv");
        ArrayList<Alumno>alum=new ArrayList<>();

        try {
            Scanner scnr=new Scanner(archivo2); //Meto el archivo en el scanner

            while (scnr.hasNextLine()){
                String scanner= scnr.nextLine();
                //Separar la info
                String[] campos=scanner.split(";");
                    String nombre=campos[0];
                    String apellidos=campos[1];
                    String email=campos[2];
                    String tlfno=campos[3];

                Alumno al=new Alumno(nombre,apellidos,email,tlfno);

                //Añado el alumno al Array
                alum.add(al);
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
        //Recorro el Array
        for (Alumno v:alum){
            System.out.println(v.nombre +" " + v.apellido + " " + v.email+" " + v.movil);
        }







    }
   public static void recorrer(File arch){
        if (arch.exists()){
            File[] listado=arch.listFiles();
            for(File lista:listado){
                    if (lista.isDirectory()){
                        System.out.println(lista.getName() + " -> directorio "+ lista.length() + " bytes");
                        recorrer(lista);
                    }else{
                        System.out.println("\t"+lista.getName() + " -> " + lista.length() + " bytes");
                    }
            }
        }
   }
}
