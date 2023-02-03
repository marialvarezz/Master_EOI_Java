public class ConversiónSistemasNuméricos {
    public static void main(String[] args) {
        int numeroDecimal = 0b1110;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numeroDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numeroDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numeroDecimal));
    }
}
