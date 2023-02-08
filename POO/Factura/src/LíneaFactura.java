import java.text.DecimalFormat;

public class LíneaFactura {
    private int uds;
    private String producto;
    private double preciouni;
    private double preciototal;

    //Constructor
    //dos decimales
    DecimalFormat df=new DecimalFormat("#.00");
    public LíneaFactura(int uds, String producto, double preciouni) {
        this.uds = uds;
        this.producto = producto;
        this.preciouni = preciouni;
        this.preciototal = uds*preciouni;
    }
    //toString
    public String toString(){
        return uds+"\t\t"+producto+"\t\t"+df.format(preciouni) +"€"+"\t\t"+df.format(preciototal)+"€";
    }
    //Getter

    public double getPreciototal() {
        return preciototal;
    }
}
