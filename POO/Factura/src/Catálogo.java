public enum Catálogo {
    //Añadimos los items
    ITEM1("Ordenador portálil",454.50),
    ITEM2("Ratón inalámbrico",25.60),
    ITEM3("Monitor 25\" 4K",250.45),
    ITEM4("Disco duro 1TB",53.50),
    ITEM5("Tableta gráfica",459.99),
    ITEM0("Sin especificar",00.00);

    //Definimos los items
    private String description;
    private double price;

    //Constructor

    Catálogo(String description, double price) {
        this.description = description;
        this.price = price;
    }
    //Getter

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
