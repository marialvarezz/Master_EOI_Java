public class Casting {
    public static void main(String[] args) {
        double miDouble;
        long miLong;
        int miInt;
        float mifloat;
        short miShort;
        byte miByte;
        
        miDouble= 456468.56e38d;
        System.out.println("miDouble =" + miDouble);
        
        mifloat=(float)miDouble;
        System.out.println("mifloat = " + mifloat);
        miLong =(long)miDouble;
        System.out.println("miLong = " + miLong);
        miInt =(int)miDouble;
        System.out.println("miInt = " + miInt);
        miShort = (short)miDouble;
        System.out.println("miShort = " + miShort);
        miByte = (byte)miDouble;
        System.out.println("miByte = " + miByte);

        mifloat = 1455.12246f;
        System.out.println("valor: " + (int)mifloat);
        System.out.println("Decimales "+ (mifloat - (int)mifloat));
    }
}
