public class FiguraGeométrica {
    //Atributos
    String nombre;
    float longlado;
    int numeroLados;
    final float PI = 3.1415929f;
    //Métodos de la clase
    //perímetro, superficie, info
    public float perímetro (){
        float perimetro=0;
        if(numeroLados==0){
        perimetro= 2*PI*longlado;
        }else{
        perimetro= numeroLados*longlado;
        }
        return perimetro;
    }
    public double superficie(){
        double superficie=0;
        if(numeroLados==0){
            superficie= PI*Math.pow(longlado,2);
        }else{
            float ang= 2*PI/(2*numeroLados);
            double ap = longlado/(2*Math.tan(ang));
            float perimetro= numeroLados*longlado;
            superficie= perimetro*ap/2;
        }
        return superficie;
    }


    public String info() {
        return "\nnombre= '" + nombre + '\'' +
                "\nlonglado= " + longlado +
                "\nnumeroLados= " + numeroLados +
                "\nPI= " + PI +
                "\nperimetro = " + perímetro() + " cm" +
                "\nsuperficie = " + superficie() + " cm2";

    }



    public FiguraGeométrica(String nombre, float longlado, int numeroLados) {
        this.nombre = nombre;
        this.longlado = longlado;
        this.numeroLados = numeroLados;

    }
}
