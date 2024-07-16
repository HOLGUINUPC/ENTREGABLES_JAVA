public class Videojuego implements Entregable {

    protected final static int HORA_DEF = 10;
    protected final static boolean ENTREGADO_DEF = false;
    protected final static String TITULO_DEF = "";
    protected final static String GENERO_DEF = "";
    protected final static String COMPAÑIA_DEF = "";


    private final static int HORAS_ESTIMADAS_DEF=100;
 
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
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego(){
        this(TITULO_DEF, HORA_DEF, ENTREGADO_DEF, GENERO_DEF, COMPAÑIA_DEF);
    }

    

    public Videojuego(String titulo, int horasEstimadas){
        this(titulo, horasEstimadas,  ENTREGADO_DEF, GENERO_DEF, COMPAÑIA_DEF);
    }

    public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }
    @Override
    public void entregar() {
        entregado=true;
    }
 
    /**
     * Cambia el estado de entregado a false
     */
    @Override
    public void devolver() {
        entregado=false;
    }
 
    /**
     * Indica el estado de entregado
     * @return 
     */
    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
 
    /**
     * Compara dos videojuegos segun el numero de paginas
     * @return codigo numerico
     * <ul>
     * <li>1: El videojuego 1 es mayor que el videojuego 2</li>
     * <li>0: Los videojuegos son iguales</li>
     * <li>-1: El videojuego 1 es menor que el videojuego 2</li></ul>
     */
    @Override
    public int compareTo(Object a) {
        int estado=MENOR;
 
        //Hacemos un casting de objetos para usar el metodo get
        Videojuego ref=(Videojuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=IGUAL;
        }
 
        return estado;
    }
 
    /**
     * Muestra informacion del videojuego
     * @return cadena con toda la informacion del videojuego
     */
    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia;
    }
 
    /**
     * Indica si dos videojuegos son iguales, siendo el titulo y compañia iguales
     * @param a videojuego a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Videojuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getCompañia())){
            return true;
        }
        return false;
    }


    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public int getHorasEstimadas() {
        return horasEstimadas;
    }



    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }



    public String getGenero() {
        return genero;
    }



    public void setGenero(String genero) {
        this.genero = genero;
    }



    public String getCompañia() {
        return compañia;
    }



    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }




    





}
