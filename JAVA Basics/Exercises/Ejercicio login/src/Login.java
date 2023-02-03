import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        //Definimos usuario y contraseña
        String usuario = "marialvarez";
        String contraseña = "12345M";


        //Leer dato de consola
        String dato1;
        String dato2;
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce tu usuario: ");
        dato1 = entrada1.nextLine();
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Introduce tu contraseña: ");
        dato2 = entrada2.nextLine();
        System.out.println("El usuario introducido es: " + dato1);
        System.out.println("La contraseña introducida es: " + dato2);



        //Control del error

        //System.out.println(usuario.equals(dato1) && contraseña.equals(dato2));

        //Si quieres poner algo más que true o false

        if(usuario.equals(dato1) && contraseña.equals(dato2)){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Usuario o contraseña incorrectos");
        }





    }
}
