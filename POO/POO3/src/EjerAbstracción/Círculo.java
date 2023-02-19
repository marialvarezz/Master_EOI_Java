package EjerAbstracción;

public class Círculo extends FiguraGeo{
    String nombre;
    float radio;

    public Círculo(String nombre,float radio) {

        this.nombre=nombre;
        this.radio=radio;
    }

    @Override
    public float perimetro() {
        float per=2*PI*radio;
        return per;
    }

    @Override
    public double area() {
        double area = PI*Math.pow(radio,2);
        return area;
    }

    @Override
    public void gráfico() {
        System.out.println("Hago un gráfico");
    }

    //toString

    @Override
    public String toString() {
        return "Círculo{" +
                "nombre='" + nombre + '\'' +
                ", radio= " + radio +
                "}";
    }
}
