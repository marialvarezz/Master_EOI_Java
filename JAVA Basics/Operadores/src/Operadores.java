public class Operadores {
    public static void main(String[] args) {
        //Incremento y decremento
        int a = 10;
        System.out.println("a = " + a);
        System.out.println("++a = " + ++a);
        System.out.println("a = " + a);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);
        System.out.println("--a = " + --a);
        System.out.println("a-- = " + a--);
        System.out.println("a = " + a);
        //Módulo resto de la divión entera
        int b = 2;
        int c = 8;
        System.out.println("módulo = " + (c % b));
        // += y -=
        c+=b; //c = c+b
        System.out.println("c += b -> "+ c);
        c-=b; // c= c-b
        System.out.println("c-=b -> " + c);
        //*= y /=
        c *= b;
        System.out.println("c *=b -> " + c);
        c/= b;
        System.out.println("c /=b -> " + c);
        // %=
        c %= 3;
        System.out.println("c %=3 -> " + c);
        //Operadores racionales
        System.out.println("b > c -> " + (b>c));
        System.out.println("b < c -> " + (b<c));
        System.out.println("b >= c -> " + (b>=c));
        System.out.println("b <= c -> " + (b>=c));
        System.out.println("b<>c -> "+ (b!=c));

        //Operador ternario
        //Tipo variable = condición? valor1 (true) : valor2 false
        //if condición then{
        int resultado = (c<a) ? 3:5;
        System.out.println("resultado ->" + resultado);

        //Operadores lógicos
        System.out.println("(c < a) AND (b > a) -> " + ((c<a) && (b<a)));
        System.out.println("(c < a) OR (b > a) -> " + ((c>a) || (b<a)));
        System.out.println("NOT (b > a) -> " + !(b > a));

    }
}
