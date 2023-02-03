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
            //Detectar sistema numérico
            //octal
            if (dato.charAt(0)!='0'){
                //decimal
                numeroDecimal = Integer.parseInt(dato);
            } else if (dato.charAt(1)=='b') {
                //binario
                dato = dato.substring(2);
                numeroDecimal = Integer.parseInt(dato,2);
            } else if (dato.charAt(1)=='x') {
                //hexadecimal
                dato = dato.substring(2);
                numeroDecimal = Integer.parseInt(dato,16);
            } else{
                //octal
                numeroDecimal = Integer.parseInt(dato,8);
            }


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
