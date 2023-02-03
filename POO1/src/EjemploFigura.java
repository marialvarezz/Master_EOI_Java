public class EjemploFigura {
    public static void main(String[] args) {
        FiguraGeométrica cuadrado=new FiguraGeométrica("cuadrado",5f,4);
        System.out.println("cuadrado.info() = " + cuadrado.info());
        System.out.println("-------------------------------------------------------------------------");
        FiguraGeométrica pentágono=new FiguraGeométrica("Pentágono",7f,5);
        System.out.println("triangulo.info() = " + pentágono.info());
        System.out.println("-----------------------------------------------------------------------------");
        FiguraGeométrica circulo=new FiguraGeométrica("Circulo",4.5f,0);
        System.out.println("circulo.info() = " + circulo.info());
        


    }
}
