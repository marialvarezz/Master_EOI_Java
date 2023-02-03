public class Wrapped {
    public static void main(String[] args) {
        //Integer
        Integer i = Integer.valueOf(123456);
        Integer b = Integer.valueOf(123456);
        System.out.println( "i==b -> " + (i==b));
        System.out.println("i.equals(b) ->" + i.equals(b));

        //convertir de Integer a String
        String s=i.toString();
        System.out.println("s -> "+ s);

        int j = i.intValue();
        long l = i.longValue();
        float f = i.floatValue();
        double d= i.doubleValue();
        System.out.println("int -> " + j+ " long -> "+ l + " float-> "+ f+ " double ->" + d );
        System.out.println(i.getClass());

        int k = Integer.parseInt("123456");
        System.out.println("k = " + k);
        System.out.println("To Hex " + Integer.toHexString(123456));
        System.out.println("To Oct " + Integer.toOctalString(123456));
        System.out.println("To Bin " + Integer.toBinaryString(123456));

        //Long
        Long valong = 1234567899L;
        System.out.println("valong = " + valong);
        String str = valong.toString();
        System.out.println("str = " + str);
        d = valong.doubleValue();
        System.out.println("d = " + d);
        System.out.println("bits -> " + Long.bitCount(12345646));

        //Character
        Character c = Character.valueOf('1');
        Character c1 ='b';
        char c2 = c.charValue();
        System.out.println("c.charValue() = " + c2);
        System.out.println("c.isDigit() -> " + c.isDigit(c1));
        System.out.println("Character.isAlphabethic -> " + Character.isAlphabetic(c1));
        System.out.println("Character.isUpperCase(c1) = " + Character.isUpperCase(c1));
        System.out.println("Character.isLowerCase(c1) = " + Character.isLowerCase(c1));

    }
}
