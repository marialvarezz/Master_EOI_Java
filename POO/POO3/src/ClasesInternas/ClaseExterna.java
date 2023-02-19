package ClasesInternas;

public class ClaseExterna {
    int x=10;
    int y=5;
    Vector miVector = new Vector(4,5);
    Vector tuVector=new Vector(2,3);

 class Interna1{
    int k=1;

}
public void modulovector(Vector a){
    System.out.println("módulo = " + (Math.sqrt(Math.pow(a.x,2) + Math.pow(a.y,2))));
}
static class InternaStatic{
     int i=9;
}
    class Vector{
        int x;
        int y;

        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}





