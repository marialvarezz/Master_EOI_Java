package EjerAbstracción;

public class Cuadrado extends FiguraGeo{

    float longlado;
    String nombre;


    public Cuadrado( String nombre,float longlado) {
        this.longlado=longlado;
        this.nombre = nombre;

    }

    @Override
    public float perimetro() {
        float per=longlado*4;
        return per;
    }

    @Override
    public double area() {
        double are=Math.pow(longlado,2);
        return are;
    }

    @Override
    public void gráfico() {
        System.out.println("Hago un cuadrado");
    }

    //toString

    @Override
    public String toString() {
        return "Cuadrado{" +
                "nombre='" + nombre + '\'' +
                ", longlado=" + longlado +
                '}';
    }
}
