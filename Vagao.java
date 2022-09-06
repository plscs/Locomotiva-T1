public class Vagao {
    private int identificador;
    private double capCarga;
    private int composição;
    private boolean vagao;


    public Vagao(boolean vagao, int identificador, double capCarga, int composição){
        this.vagao = vagao;
        this.identificador = identificador;
        this.capCarga = capCarga;
        this.composição = composição;
    }
    public boolean getVagao(){
        return this.vagao;
    }

    public int getIdentificador(){
        return this.identificador;

    }
    public double getCapCarga(){
        return this.capCarga;

    }
    public int getComposição(){
        return this.composição;

    }
    public String toString(){
        return "ID:"+identificador+" Peso Maximo(T):"+capCarga+" Parte do Trem:"+composição+"." ;
    }
    public void setComposição(int c){
        this.composição = c;
    }
    
}
