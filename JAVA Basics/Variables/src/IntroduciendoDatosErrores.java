import java.util.Scanner;

public class IntroduciendoDatosErrores {
    public static void main(String[] args) {
        //Leer dato por consola
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un entero: ");
        dato = entrada.nextLine();
        System.out.println("dato = " + dato);
        
        //Convertir dato a entero
        int numeroDecimal = 0;

        //Control de error de dato a entero
        try{
            numeroDecimal = Integer.parseInt(dato);
        }catch (NumberFormatException e){
            System.out.println("e.getMessage()" + e.getMessage());
            System.out.println("ERROR - Has de introducir un número entero");
            main(args);
            System.exit(0);
        }

        //y representarlo en diferentes sistemas
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numeroDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numeroDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numeroDecimal));
    }
}
