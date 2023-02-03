import java.util.Arrays;

public class OrdenDescendente {
    public static void main(String[] args) {
      int[] numeros ={2,7,9,3,1,5};
    }
   public static void ordenInverso(int[] numeros){
        int[] numerosInv = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(numeros);
        for(int i =0;i< numeros.length;i++){
          int indice= numeros.length - i - 1;
           numeros[i] = numerosInv[indice];
        }
  }
}
