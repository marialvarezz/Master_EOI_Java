public class Motocicleta extends Vehículo {
    int ruedas=2;
    String transmisión="";
    public void acelerarPuño(){
        System.out.println("Acelerando la moto");
    }

    @Override
    public String toString() {
        return "Motocicleta ->" +
                "\nruedas= " + ruedas +
                "\ntransmisión= " + transmisión +
                "\nmarca= " + marca  +
                "\nmodelo= " + modelo  +
                "\npotencia= " + potencia;
    }
}
