public class MetodoRandom {
    public static void main(String[] args) {
        //generar un num aleatorio
        for (int i= 0; i<=100;i++){
        System.out.println(Math.random());
        }
        System.out.println("--------------------------------------------------------");
        //Con dos decimales
        for(int i = 0;i <=20;i++){
        int n = (int)(Math.random()*100);
        System.out.println(n);
        float f=n;
            System.out.println("f = " + f/100);
        }
        System.out.println("---------------------------------------------------------");
        //Si quieres que te salga un num < 99
            for(int i = 0;i <=20;i++){
            int n = (int)(Math.random()*101);
            System.out.println("n = " + n);
        }
        System.out.println("---------------------------------------------------------");
        //Aleatorio del 1 al 90
        for (int i =0;i<=100; i++){
            int n = 1+(int)(Math.random()*(90));
            System.out.println("n = " + n);
        }
        System.out.println("------------------------------------------------------");
        //Juego Bingo
        int[] bingo = new int[91];
        int contador = 0;
      while(contador<90){
        int n = 1+ (int)(Math.random()*90);
                if (bingo[n-1]!= n){
                System.out.println("el = " + n);
                bingo[n]=n;
                contador++;
       }
        }
        System.out.println("---------------------------------------");
        int[] bingo1 = new int[91];
        contador= 0;
        int n=0;
        while (contador<90){
            int i = 1 + (int) (Math.random()*90);
            if(bingo1[i-1] != i){
                System.out.println("el -> " + i);
                bingo1[i-1] = i;
                contador++;

            }
        }
    }
}
