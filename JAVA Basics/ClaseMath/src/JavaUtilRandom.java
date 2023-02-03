import java.util.Random;

public class JavaUtilRandom {
    public static void main(String[] args) {
        Random objetoRdn = new Random();
        int numInt = objetoRdn.nextInt();
        System.out.println("numInt = " + numInt);
        long numlong = objetoRdn.nextLong();
        System.out.println("numlong = " + numlong);
        float numfloat = objetoRdn.nextFloat();
        System.out.println("numfloat = " + numfloat);
        double numDouble = objetoRdn.nextDouble();
        System.out.println("numDouble = " + numDouble);

        //Rangos 0....n
        for (int i = 0; i<100; i++){
            numInt = objetoRdn.nextInt(91);
            System.out.println("numInt = " + numInt);
        }

        for (int i = 0; i<100; i++){
            numfloat = objetoRdn.nextFloat(48);
            System.out.println("numfloat = " + numfloat);
        }
        // Rangos n....m
        numInt= objetoRdn.nextInt(0,90);
        System.out.println("numInt = " + numInt);
        numlong= objetoRdn.nextLong(23900000,25000000);
        System.out.println("numlong = " + numlong);
    }
}
