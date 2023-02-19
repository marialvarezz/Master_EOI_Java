package EjerAbstracción;

public class EjemFigura {
    public static void main(String[] args) {
        Círculo cir=new Círculo("Cículo",3);
        System.out.println("el área es de -> "+cir.area());
        System.out.println("el perímetro es de -> " + cir.perimetro());
        cir.gráfico();
        System.out.println(cir.toString());

        Cuadrado cua=new Cuadrado("Cuadrado",4);
        System.out.println("el área es de -> " + cua.area());
        System.out.println("el perímetro es de -> " + cua.perimetro());
        cua.gráfico();
        System.out.println(cua.toString());


    }


}
