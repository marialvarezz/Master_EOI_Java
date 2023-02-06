public enum TipoCoche {
    SEDAN("Sedan","Mediano",4),
    STATION_WAGON("Familiar","Grande",5),
    HATCHBACH("Hatchbach","Compacto",5),
    PICKUP("Pickup","Furgoneta abierta",2),
    COUPE("Coupe","Deportivo",2),
    SUV("Suv","Todo terreno urbano",5);

    private final String nombre;
    private final String descripción;
    private final int numPuertas;

    TipoCoche(String nombre, String descripción, int numPuertas) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.numPuertas = numPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
