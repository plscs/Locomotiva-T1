public class Vagao {
    private int identificador;
    private double capCarga;
    private int composição;
    private boolean vagao;


    public Vagao(boolean vagao, int identificador, double capCarga, int composição){
        this.vagao = true;
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
}
