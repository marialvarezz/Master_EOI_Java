public class General {
    public static void main(String[] args) {
        System.out.println("Math max -> " + Math.max(4,8));
        System.out.println("Math.min -> "+ Math.min(4,8));
        System.out.println("Math.sqrt -> "+ Math.sqrt(16));
        System.out.println("Math.pow(4,4) = " + Math.pow(4,4));
        
        //Grados -> radianes
        //seno,coseno y tangente
        double radianes = (30*2*Math.PI)/360;
        System.out.println("Math.sin(radianes) = " + Math.sin(radianes));
        System.out.println("Math.cos(radianes) = " + Math.cos(radianes));
        System.out.println("Math.tan(radianes) = " + Math.tan(radianes));
        //logaritmos
        System.out.println("Math.log(2.71) = " + Math.log(2.71));
        System.out.println("Math.log10(2) = " + Math.log10(2));
        //Redondeo ceil(hacia arriba), floor (hacia abajo) y round (hacia el ENTERO más próximo)
        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1));
        System.out.println("Math.floor(2.9) = " + Math.floor(2.9));
        System.out.println("Math.round(2.5) = " + Math.round(2.5));
        //valor absoluto
        System.out.println("Math.abs(2.3) = " + Math.abs(2.3));
        System.out.println("Math.abs(-2.3) = " + Math.abs(-2.3));
        System.out.println("Math.exp(2) = " + Math.exp(2));//potencias de e
    }
}
