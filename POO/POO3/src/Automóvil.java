public class Automóvil extends Vehículo {
    int ruedas;
    String combustible;

    public void abrirMaletero(){
        System.out.println("Se abre");
    }

    @Override
    public String toString() {
        return "Automóvil ->" +
                "\nruedas= " + ruedas +
                "\ncombustible= " + combustible  +
                "\nmarca= " + marca  +
                "\nmodelo= " + modelo  +
                "\npotencia= " + potencia;
    }
}
