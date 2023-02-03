import javax.swing.*;

public class IntroduciendoDatos {
    public static void main(String[] args) {
        //Leer Dato (String)
        String dato;
        dato = JOptionPane.showInputDialog(null, "Introduce un entero");

        //Convertir dato a entero y representarlo en diferentes sistemas
        int numeroDecimal = Integer.parseInt(dato);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numeroDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numeroDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numeroDecimal));
    }
}
