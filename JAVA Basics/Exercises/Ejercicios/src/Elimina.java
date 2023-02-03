import java.util.Arrays;

public class Elimina {
    public static void main(String[] args) {
     int [] matriz ={1,2,3,4,5,6,7,8,9};
     int i =2;
     elimina(matriz,i);


        for (int k=0;k< matriz.length;k++){
            System.out.println("copia["+k+"] = " + matriz[k]);
        }
     }
     public static void elimina(int [] matriz,int i){
         int v=0;
         while(v<i){
             matriz[v]=matriz[v];
             v++;
         }
         v=i+1;
         while(v< matriz.length){
             matriz[v-1]=matriz[v];
             v++;
         }
     }
    }

