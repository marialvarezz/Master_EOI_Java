import javax.swing.plaf.PanelUI;

public class Coche1 {
    //atributos(estado o características)
    private String marca;
    private String modelo;
    private String color;
    private String carrocería;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm;
    private float km;
    final  static String eCall="112";
    private float deposito;
    static String distintivos="E";


    //Constructores
    public Coche1(){
    this.km=4;
    }
    public Coche1(String marca){
        this();
        this.marca=marca;
    }
    public Coche1(String marca,String modelo){
        this(marca);
        this.modelo=modelo;
    }


    //Getter y Setter


    public String getMarca() {
        return marca;
    }public void setMarca(String marca){
        this.marca=marca;
    }

    public String getColor() {
        return color;
    }public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

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
        this.km += distancia;
        return this.deposito/distancia*100;
    }
    public float consumo(float distancia,float repostaje){
        this.km +=distancia;
        return repostaje/distancia*100;
    }

}
