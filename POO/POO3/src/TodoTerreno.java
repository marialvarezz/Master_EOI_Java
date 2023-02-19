public class TodoTerreno extends Automóvil {
    String reductora;
    String cabrestante;

    public void vadearRio(){
        System.out.println("Atravesando rio!");
    }

    @Override
    public String toString() {
        return "TodoTerreno-> " +
                "\nreductora= " + reductora  +
                "\ncabrestante= " + cabrestante  +
                "\nruedas= " + ruedas +
                "\ncombustible= " + combustible +
                "\nmarca= " + marca  +
                "\nmodelo= " + modelo  +
                "\npotencia= " + potencia;
    }
}
