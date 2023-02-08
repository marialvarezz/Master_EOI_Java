import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Factura {
    public static void main(String[] args) {
        //Para dejar solo dos decimales
        DecimalFormat df=new DecimalFormat("#.00");

        //Introducir los datos del cliente por consola
        String nombre=introducirDato("Introduce el nombre");
        String apellidos =introducirDato("Introduce los apellidos");
        String DNI = introducirDato("Introduce el DNI");
        String numtlf=introducirDato("Introduce el número de teléfono");
        String email= introducirDato("Introduce el email");
        DatosCliente cliente1=new DatosCliente(nombre,apellidos,DNI,numtlf,email);

        //número de factura
        Random objrndm = new Random();
        int factura=objrndm.nextInt(0,1000000000);


        System.out.println("Introduce los datos del producto:");
        int unidades=1;
        int v=0;
        boolean a=false; //Para hacer un bucle hasta que se quiera salir
        //LíneaFactura[] mat= new LíneaFactura[10];//Matriz para ir añadiendo los productos
        ArrayList<LíneaFactura> mat= new ArrayList<>();
        while(a!=true){ //bucle
        unidades= Integer.parseInt(introducirDato("Unidades (0:salir)"));
        if (unidades==0){ //Para salir del bucle
            a=true;
        }else{ //Para seguir en él

        Catálogo producto=Catálogo.ITEM0;
        String tipoProducto=introducirDato("Seleccione el producto: 1-Portátil, 2-Ratón, 3-Monitor, 4-Disco duro, 5-Tableta gráfica");
        switch (tipoProducto){ //Asigno una variable para cada producto
            case "1" :
                producto=Catálogo.ITEM1;
                break;
            case "2":
                producto=Catálogo.ITEM2;
                break;
            case "3":
                producto=Catálogo.ITEM3;
                break;
            case "4":
                producto=Catálogo.ITEM4;
                break;
            case "5":
                producto=Catálogo.ITEM5;
                break;
            default:
                System.err.println("No se puede encontrar el producto");
                producto=Catálogo.ITEM0;

        }
        LíneaFactura product=new LíneaFactura(unidades,producto.getDescription(),producto.getPrice());
        System.out.println(product.toString());
        mat.add(product);
        }
        }
        double totalFactura=0;
        for (LíneaFactura lin:mat){ //Recorrer la matriz
            if(lin!=null){ //Para evitar el error de ser nula
                totalFactura+= lin.getPreciototal(); //Ir sumando al precio total
            }
        }
        //IVA
        float iva=21;
        double ivaprice=totalFactura*(iva/100);
        double totalConIva=totalFactura+ivaprice;
        //Imprimir la factura

        System.out.println("\n\n--------------------------------------------------------------------------------");
        System.out.println(cliente1.toString()); //Datos del cliente
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Fecha: "+ fecha()); //Fecha
        System.out.println("Número de factura: " + factura); //Número de factura
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Uds     Descripción         Unitario      Precio");
        for (LíneaFactura lf:mat){ //Recorrer la matriz
            if(lf!=null){ //Para evitar el error de ser nula
                System.out.println(lf.toString());
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("El precio sin IVA es: " + df.format(totalFactura)+"€" + "\nIVA: " + df.format(ivaprice)+"€" + "\nTotal factura: "+df.format(totalConIva)+"€");




    }

    public static String introducirDato (String mensaje){
        Scanner scn1=new Scanner(System.in);
        System.out.print(mensaje+" : ");
        return scn1.nextLine();
    }

    public static String fecha(){  //fecha
        DateFormat formato=new SimpleDateFormat("dd MMM yyyy");
        String fecha= formato.format(new Date());

        return fecha;
    }
}
