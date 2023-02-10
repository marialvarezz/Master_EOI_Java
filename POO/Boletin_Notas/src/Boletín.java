import java.io.BufferedReader;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Boletín {
    public static void main(String[] args) {
        //Para dejar solo dos decimales
        DecimalFormat df=new DecimalFormat("#.00");
        //Introduce los datos del instituto(predeterminado - Clase) y el nombre el profesor(por consola)
        String nombreProf=introduceDato("Introduce el nombre y apellido del profesor");
        DatosInstituto inst1=new DatosInstituto(nombreProf);

        //Introduce los datos del alumno(por consola)
        System.out.println("Introduce los datos del alumno: ");
        String nombre=introduceDato("Introduce el nombre");
        String apellidos=introduceDato("Introduce los apellidos");
        String curso=introduceDato("Introduce el curso");
        String clase=introduceDato("Introduce la clase");
        String evaluación=introduceDato("Introduce la evaluación");

        DatosAlumno alumno=new DatosAlumno(nombre,apellidos,curso,clase,evaluación);

        System.out.println("--------------------------------------------------------");


        int numeroAsig=7; //número de materias
        Asignaturas materia = Asignaturas.OOO;
        int v=0;
        ArrayList<LíneaBoletín> mat= new ArrayList<>(); //Declaro la matriz
        //Creo un bucle hasta que llegue a la última asignatura
        for(v=1;v<=numeroAsig;v++){
            if(v==1){
                materia=Asignaturas.LENG;
                mat.clear();//Tratamiento del error "Calificación mal asignada" - Para borrar los datos arrastrados
            } else if (v==2) {
                materia=Asignaturas.EF;
            } else if (v==3) {
                materia=Asignaturas.INGLÉS;
            } else if (v==4) {
                materia=Asignaturas.MAT;
            } else if (v==5) {
                materia=Asignaturas.HIST;
            } else if (v==6) {
                materia=Asignaturas.FIS;
            } else if (v==7) {
                materia=Asignaturas.TIC;
            }else {
                materia=Asignaturas.OOO;
            }

            //Introducción de la nota (por consola)
            float nota=Float.valueOf(introduceDato("Introduce la nota de " + materia.getNombre()));

            //Defino la nota
            String designaciones= "";
            if (nota<0){
                designaciones="Nota sin designar";
                System.err.print("Calificación mal asignada\n");
                v=0; //Tratamiento del error "Calificación mal asignada" - Para volver al principio del bucle
            } else if (nota<5) {
                designaciones="Inuficiente";
            } else if (nota==5){
                designaciones="Suficiente";
            } else if (nota==6) {
                designaciones="Bien";
            }else if (nota<9){
                designaciones="Notable";
            } else if (nota<=10) {
                designaciones="Sobresaliente";
            } else if (nota>10) {
                designaciones="Nota sin designar";
                System.err.print("Calificación mal asignada\n");
                v=0; //Tratamiento del error "Calificación mal asignada" - Para volver al principio del bucle
            }


            LíneaBoletín line = new LíneaBoletín(materia.getCódigo(), materia.getNombre(),nota,designaciones);
            System.out.println(line.toString());
            mat.add(line); // Añado las líneas del boletín a la matriz

        }
       float notatot=0;
        //Recorro la matriz(sin imprimir) - Suma de las notas asignadas
        for(LíneaBoletín ln:mat){
            if(ln!=null){
                notatot+=ln.getNota();
            }
        }
        float notaMedia=notatot/numeroAsig; //Calculo la nota media
        //Defino la nota media
        String notafinal="";
        if (notaMedia<5){
            notafinal="Insuficiente";
        }else if (notaMedia<6){
            notafinal="Suficiente";
        } else if (notaMedia<7) {
            notafinal="Bien";
        }else if (notaMedia<9){
            notafinal="Notable";
        } else if (notaMedia<=10) {
            notafinal="Sobresaliente";
        }

        System.out.println("--------------------------------------------------------\n");
        //Imprimo el boletín completo
        System.out.println("--------------------------------------------------------\n");
        System.out.println(inst1.toString() + "\n");
        System.out.println("Boletín de notas trimestral");
        System.out.println(alumno.toString());
        System.out.println("\n"+fecha()+"\n");

            for(LíneaBoletín ln:mat){
                if(ln!=null){
                    System.out.println(ln.toString());
                }
            }
        System.out.println("\nLa nota media es: "+ df.format(notaMedia) + "\t" + notafinal);

            }




    public static String introduceDato (String mensaje){
        Scanner scn1=new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return scn1.nextLine();
    }

    public static String fecha(){
        DateFormat dt=new SimpleDateFormat("dd MMM yyyy");
        String fecha=dt.format(new Date());
        return fecha;
    }
}
