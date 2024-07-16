public class Serie implements Entregable {

    private final static int NUM_TEMPORADAS_DEF=3;
 
    /**
     * Constante que indica que un objeto es mayor que otro
     */
    public final static int MAYOR=1;
 
    /**
     * Constante que indica que un objeto es menor que otro
     */
    public final static int MENOR=-1;
 
    /**
     * Constante que indica que un objeto es igual que otro
     */
    public final static int IGUAL=0;

    protected final static int NUMERO_TEMPORADAS_DEF = 3;
    protected final static boolean ENTREGADO_DEF = false;
    protected final static String TITULO_DEF = "";
    protected final static String CREADOR_DEF = "";
    protected final static String GENERO_DEF = "";

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this(TITULO_DEF, NUMERO_TEMPORADAS_DEF, ENTREGADO_DEF, GENERO_DEF, CREADOR_DEF);
    }

    public Serie(String titulo, String creador){
        this(titulo, NUMERO_TEMPORADAS_DEF,  ENTREGADO_DEF, GENERO_DEF, creador);
    }

    public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * Cambia el estado de entregado a true
     */
    public void entregar() {
        entregado=true;
    }
 
    /**
     * Cambia el estado de entregado a false
     */
    public void devolver() {
        entregado=false;
    }
 
    /**
     * Indica el estado de entregado
     */
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
 
    /**
     * Compara dos series segun su numero de temporadas
     * @param objeto a comparar
     * @return codigo numerico
     * <ul>
     * <li>1: La Serie 1 es mayor que la Serie 2</li>
     * <li>0: Las Series son iguales</li>
     * <li>-1: La Serie 1 es menor que la Serie 2</li></ul>
     */
    public int compareTo(Object a) {
        int estado=MENOR;
 
        //Hacemos un casting de objetos para usar el metodo get
        Serie ref=(Serie)a;
        if (numeroTemporadas>ref.getNumeroTemporadas()){
            estado=MAYOR;
        }else if(numeroTemporadas==ref.getNumeroTemporadas()){
            estado=IGUAL;
        }
 
        return estado;
    }
 
    /**
     * Muestra informacion de la Serie
     * @return cadena con toda la informacion de la Serie
     */
    public String toString(){
        return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador;
    }
 
    /**
     * Indica si dos Series son iguales, siendo el titulo y creador iguales
     * @param a Serie a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Serie a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())){
            return true;
        }
        return false;
    }



}
