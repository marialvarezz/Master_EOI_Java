import java.util.Scanner;

public class EjemploIf {
    public static void main(String[] args) {

        //Definimos el usuario y la contraseña
        String usuario = "Maria";
        String contraseña = "12345m";

        Scanner dato1 = new Scanner(System.in);
        System.out.print("Usuario: ");
        String us = dato1.next();
        System.out.print("Contraseña: ");
        String con = dato1.next();


        // System.out.println("Tu usuario introducido es: " + us);
        // System.out.println("Tu contraseña introducida es: " + con);
        
       // boolean login = usuario.equals(us) && contraseña.equals(con);
        //System.out.println("login = " + login);

        if ((us.equals(usuario)) && (con.equals(contraseña))){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Usuario o contraseña incorrecto");
            main(args);
            System.exit(0);
        }
        dato1.close();

        //if....else if...
        int a= 2;
        int b= 2;
        int c= 2;

        if (a<b){
            System.out.println("Si lo digo");
        } else if (b<=c) {
            System.out.println("DIGO!!!");
        }else {
            System.out.println("NO");
        }

        int nota = 8;
        if (nota<5){
            System.out.println("Suspenso");
        }else if (nota<7){
            System.out.println("Aprobado");
        }else if (nota<9){
            System.out.println("Notable");
        } else if (nota<10) {
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Matricula de honor");
        }


    }
}
