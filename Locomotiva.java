public class Locomotiva {
    private int identificador;
    private double pesoMaximo;
    private int composição;
    private int qtdMaxVagoes;
    private boolean locomotiva;

    public Locomotiva(boolean locomotiva, int identificador, double pesoMaximo, int composição, int qtdMaxVagoes){
        this.identificador = identificador;
        this.pesoMaximo = pesoMaximo;
        this.composição = composição;
        this.qtdMaxVagoes = qtdMaxVagoes;
    }
    public boolean getLocomotiva(){
        return locomotiva;

    }
    public int getIdentificador(){
        return this.identificador;

    }
    public double getCapCarga(){
        return this.pesoMaximo;

    }
    public int getComposição(){
        return this.composição;

    }

    public int getQtdMaxVagoes(){
        return this.qtdMaxVagoes;

    }
}
