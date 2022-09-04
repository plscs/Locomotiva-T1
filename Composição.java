import java.util.ArrayList;

public class Composição{
    private ArrayList<Object> trem;

    private int c = 0;

    public Composição(){
        this.trem = new ArrayList<Object>();
        c++;
    }
  
    
    public int getIdentificador(){
        return c;
    }
    public int getQtdadeLocomotiva(){
        int qtdLoco=0;
        for(int i=0;i<trem.size();i++){
            if(trem.get(i) instanceof Locomotiva){
                qtdLoco++;
            }
        }
        return qtdLoco;
    }
    public int getQtdadeVagoes(){
        int qtdVaga=0;
        for(int i=0;i<trem.size();i++){
            if(trem.get(i) instanceof Vagao){
                qtdVaga++;
            }
        }
        return qtdVaga;
    }

    public void getLocomotiva(){
        for(int i=0;i<trem.size();i++){
            if(trem.get(i) instanceof Locomotiva){
                System.out.println(((Locomotiva) trem.get(i)).getIdentificador());
            }
        }
    }
    
    public void getVagoes(){
        for(int i=0;i<trem.size();i++){
            if(trem.get(i) instanceof Vagao){
                System.out.println(((Vagao) trem.get(i)).getIdentificador());
            }
        }
        
    }
    public boolean engataLocomotiva(Locomotiva locomotiva){
        boolean vazio = trem.isEmpty();
        
        if(locomotiva.getComposição()!=0){
            System.out.println("Locomotiva já está sendo usada!");
            return false;
        }
        
        if(vazio==true){
            trem.add(locomotiva);
            System.out.println("Primeira locomotiva engatada!");
            locomotiva.setComposição(c);
            return true;
        }
            
        boolean locoAntes = false;
        
        if(trem.get(trem.size()-1) instanceof Locomotiva)
            locoAntes = true;
        if (locoAntes==true) {
            trem.add(locomotiva);
            System.out.println("Locomotiva engatada!");
            locomotiva.setComposição(c);
            return true;
        }
        else {
            System.out.println("Não é possível adicionar uma locomotiva após um vagão.");
            return false;
        }               
    }
    public boolean EngataVagoes(Vagao vagao){
        if(vagao.getComposição()!=0){
            System.out.println("Vagão está sendo utilizado.");
            return false;
        }
        boolean vazio = trem.isEmpty();
        
        double Carga=vagao.getCapCarga()+getCarga();
        double Capacidade=getCapacidade();
        if(vazio==true){
            System.out.println("O trem não pode começar com um vagão.");
            return false;
        }
        
        else if(Carga>Capacidade){
            System.out.println("O vagão não pôde ser adicionado pois excede a capacidade das locomotivas");
            return false;
        }
        else{
            trem.add(vagao);
            vagao.setComposição(c);
            System.out.println("Vagão engatado!");
            return true;
        }
        

    }
    public boolean removeUltimoCarro(){
        return false;
    }
    
    public double getCapacidade(){
        double Capacidade=0;
        int qtdLoco=0;
        for(int i=0;i<trem.size();i++){
            if(trem.get(i) instanceof Locomotiva){
                Capacidade=Capacidade+((Locomotiva) trem.get(i)).getCapCarga();
                qtdLoco++;
            }
        }
        if(qtdLoco<=1)
            return Capacidade;
        else{
            Capacidade=Capacidade*(1-(0.1*(qtdLoco-1)));
            return Capacidade;
        }
    }

    public double getCarga(){
        double Carga=0;
        for(int i=0;i<trem.size();i++)
            if(trem.get(i) instanceof Vagao)
                Carga=Carga+((Vagao) trem.get(i)).getCapCarga();
        return Carga;
    

    } 
}



