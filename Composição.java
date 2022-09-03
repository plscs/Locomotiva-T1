import java.util.ArrayList;

public class Composição{
    ArrayList<Composição> trem;
    public int getIdentificador(){
        return 1;
    }
    public int getQtdadeLocomotiva(){
        return 1;
    }
    public int getQtdadeVagoes(){
        return 1;
    }
    public int getVagoes(){
        return 1;
    }
    public boolean engataLocomotiva(Locomotiva locomotiva){
        return false;
    }
    public boolean getEngataVagoes(Vagao vagao){
        return false;
    }
    public boolean desengataLocomotiva(){
        return false;
    }
    public boolean desengataVagoes(){
        return false;
    }
    
}

