public enum Amigos {
    PEPE("José Marín","666676567","pepe@eoi.es"),
    LAURA("María Laura Corradini","666111333","soyhumana@eoi.es"),
    MARISA("María Luisa Benito","666777888","marisaprisa@eoi.es"),
    VICENTA("Vicenta Benito","666555666","vicenta@eoi.es"),
    CONCHA("Concepción de la Fuente","666444333","concha@eoi.es"),
    BELÉN("Belén López Vázquez","666222111","belen@eoi.es"),
    VANE("Vanesa Martín","666777111","vm@eoi.es");

    private final String nombre;
    private final String numtlf;
    private final String correoe;

    Amigos(String nombre, String numtlf, String correoe) {
        this.nombre = nombre;
        this.numtlf = numtlf;
        this.correoe = correoe;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumtlf() {
        return numtlf;
    }

    public String getCorreoe() {
        return correoe;
    }

    public String toString() {
        return "Amigos ->" +
                "\nnombre= " + nombre  +
                "\nnumtlf= " + numtlf +
                "\ncorreoe= " + correoe;

    }
}


