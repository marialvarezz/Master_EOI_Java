public class Final {
    public static void main(String[] args) {
        Teléfono mitllfn= new Teléfono("+34666666666","Nokia","AW03");
        mitllfn.marcar("+34655555555");
        mitllfn.colgar();
        mitllfn.toString();
        System.out.println("---------------------------------------------------------------------------");
        SamsungS23 smsng=new SamsungS23("+34777777777","Samsung","S23","64GB","5G");
        smsng.marcar("999999999");
        smsng.colgar();
        System.out.println(smsng.toString());
    }
}

class Teléfono{//Superclase
    protected String numero;
    protected String marca;
    protected String modelo;

    public final void marcar(String num){
        System.out.println("Llamando al "+num);
    }
    public void  colgar(){
        System.out.println("Colgando llamada");
    }
    //Constructor

    public Teléfono(String numero, String marca, String modelo) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Teléfono{" +
                "numero='" + numero + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
class SamsungS23 extends Teléfono{
    private String memoria;
    private String comunicación;


    public void colgar(){
        System.out.println("Ya he colgado");

    }

    public SamsungS23(String numero, String marca, String modelo, String memoria, String comunicación) {
        super(numero, marca, modelo);
        this.memoria = memoria;
        this.comunicación = comunicación;
    }

    @Override
    public String toString() {
        return "SamsungS23{" +
                "memoria='" + memoria + '\'' +
                ", comunicación='" + comunicación + '\'' +
                ", numero='" + numero + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
