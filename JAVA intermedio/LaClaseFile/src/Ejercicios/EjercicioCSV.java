package Ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCSV {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos=new ArrayList<>();
        File archivo=new File("listaalumnos.csv");
        leer(archivo,listaAlumnos);
        for (Alumno al:listaAlumnos) {
           System.out.println( al.nombre + " " + al.apellido + " -> email: " + al.email+" - tlfno: "+al.movil);
        }


    }
    public static void escribirArchivo(ArrayList<Alumno> lista){
        //Escribe en un archivo el contenido del arrayList
            try {
                FileWriter escribir=new FileWriter("listaalumnos.csv");
                for (Alumno v:lista) {
                escribir.write(v.nombre + ";" + v.apellido + ";" + v.email +";"+v.movil + "\r" );
                }
                escribir.close();
            }catch (IOException e){
                System.out.println("El archivo no se puede escribir");
                System.out.println(e.toString());
            }
    }
    public static void leer(File archivo,ArrayList<Alumno>mat){
        //leer csv y meterlo en un arrayList
        try{
            Scanner scn1=new Scanner(archivo);

            while(scn1.hasNextLine()){
                String alum=scn1.nextLine();
                    //Saco los datos necesarios
                   // int i=alum.indexOf(';');
                   // int v=alum.indexOf(';',i+1);
                    //int y=alum.lastIndexOf(';');
                String[] campos=alum.split(";");
                    String nombre=campos[0];
                    String apellido=campos[1];
                    String email=campos[2];
                    String movil=campos[3];
                //Construyo el alumno
                Alumno a=new Alumno(nombre,apellido,email,movil);
                mat.add(a);

            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
