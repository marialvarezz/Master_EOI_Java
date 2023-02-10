public class LíneaBoletín {
    private String código;
    private String asignatura;
    private float nota;
    private String designación;

    //Constructor

    public LíneaBoletín(String código, String asignatura, float nota, String designación) {
        this.código = código;
        this.asignatura = asignatura;
        this.nota = nota;
        this.designación = designación;
    }


    //toString

    @Override
    public String toString() {
        return código  +
                "\t\t" + asignatura +
                "\t\t" + nota +
                "\t\t" + designación;
    }

    public float getNota() {
        return nota;
    }
}
