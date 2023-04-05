package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;
    
    //Constructor
    public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    //Métodos
    @Override
    public int palabrasTotales(int pags){
        return pags * getPaginas();
    }

    @Override
    public String interpretacion(){
        return interpretacion;    
    }

    @Override
    public String toString() {
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+ensenanza; 
    }

    //Get and Set
    public String getEnsenanza() {
        return this.ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    
}
