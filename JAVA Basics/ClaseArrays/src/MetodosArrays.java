import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        String[] colores1 ={"azul", "rojo", "verde","amarillo","naranja"};
        int[] numeros ={1,2,3,4,3,6};
        int[] numeros1 = {2,8,3,5,4,9};

        //Buscar
        System.out.println("Arrays.binarySearch(numeros, 6) = " + Arrays.binarySearch(numeros,6));
        System.out.println("Arrays.binarySearch(numeros, 6) = " + Arrays.binarySearch(numeros,2,6,3));
        //Ordenar
        Arrays.sort(numeros);
        for(int i = 0; i< numeros.length; i++){
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
        System.out.println("Arrays.binarySearch(numeros, 6) = " + Arrays.binarySearch(numeros,2,6,3));

        Arrays.sort(colores1);
        for(int i = 0; i< colores1.length; i++){
            System.out.println("colores1[" + i + "] = " + colores1[i]);
        }
        //comparar
        System.out.println("Arrays.equals(numeros,numeros1) = " + Arrays.equals(numeros,numeros1));
        System.out.println("Arrays.compare(numeros,numeros1) = " + Arrays.compare(numeros,numeros1));
        System.out.println("Arrays.compare(numeros,1,5,numeros1,1,5) = " + Arrays.compare(numeros, 1, 5, numeros1, 1, 5));

        //copiar
        int[] copia = Arrays.copyOf(numeros,3);
        for(int i :copia){
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------");
        int[] copiaRango=Arrays.copyOfRange(numeros,2,numeros.length);
        for (int i : copiaRango){
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------------" );
        //rellenar
        int[] miMatriz = new int[8];
        for (int i: miMatriz){
            System.out.println("i = " + i);
        }
        Arrays.fill(miMatriz,1);
        System.out.println("-----------------------------------------------------");
        for (int i: miMatriz){
            System.out.println("i = " + i);
        }
        //bidimensionales
        int[][] bidi = new int[3][4];
        bidi[0][0]=23;
        int[][] bidi1={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] bidi2 = new int[4][];
        bidi2[0]=new int[4];
        bidi2[1]=new int[3];
        bidi2[2]=new int[7];
        bidi2[3]=new int[2];
        int[][] bidi3={{1,2,3,13,14},{4,5,6},{7,8,9,15},{10,11}};
        for(int i = 0; i<bidi2.length; i++){
            for (int j=0; j<bidi2[i].length; j++){
                System.out.println("bidi2[" + i + "]["+j + "] = " + bidi2 [i][j]);
            }
        }


    }
}
