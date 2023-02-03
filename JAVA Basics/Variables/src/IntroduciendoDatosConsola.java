import java.util.Scanner;

public class IntroduciendoDatosConsola {
    public static void main(String[] args) {
        //Leer dato por consola
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un entero: ");
        dato = entrada.nextLine();
        System.out.println("dato = " + dato);
        
        //Convertir dato a entero y representarlo en diferentes sistemas
        int numeroDecimal = Integer.parseInt(dato);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numeroDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numeroDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numeroDecimal));
    }
}
