import java.util.Arrays;

public class añadir {
    public static void main(String[] args) {
        int[] matriz={1,2,3,4,5,6,7,8};
        int i =9;
        int v = matriz.length;
        int[] matriz2 =new int[v+1];
        matriz2[v]=i;
        int n=0;
        while(n< matriz.length){
            matriz2[n]=+matriz[n];
            n++;
        }
        matriz=Arrays.copyOf(matriz2,matriz2.length);


        for (int k=0;k< matriz.length;k++){
            System.out.println("matriz["+k+"] = "+matriz[k]);
        }

    }

}
