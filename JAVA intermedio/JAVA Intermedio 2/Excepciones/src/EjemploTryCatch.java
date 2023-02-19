public class EjemploTryCatch {
    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5};
        try {
            for(int i=0; i<= numeros.length;i++){
            System.out.println("numeros[" +i+ "] = "+ numeros[i]);
            float a=(1/numeros[i]);
            System.out.println("(1/numeros[i]) = " + a);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de límites " );
        }catch (ArithmeticException e){
            System.out.println("División entre 0");
        }finally {
            System.out.println("fín del bloque");
        }
        System.out.println("final del programa");
    }
}
