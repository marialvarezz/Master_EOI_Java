public class Coche {
    //atributos(estado o características)
    String marca;
    String modelo;
    String color;
    String carrocería;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm;
    float km;
    final  static String eCall="112";
    float deposito;
    static String distintivos="E";

    //Métodos ("comportamiento")
    public void arrancar(){
        rpm=800;
    }
    public void acelerar(float rpm){
        this.rpm += rpm;
    }
    public void frenar(float deceleración){
        rpm -= deceleración;
    }
    public String detallesCoche(){
        return "Marca: +" + marca + "\nModelo: " + modelo + "\nColor: " + color;
    }
    public static void llamarEmergencias(){
        System.out.println("Hago una llamada al " + eCall);
    }
    public float consumo(float distancia){
        //Siempre lleno el depósito y siempre lo vacío
        return this.deposito/distancia*100;
    }
    public float consumo(float distancia,float repostaje){
        return repostaje/distancia*100;
    }

}
