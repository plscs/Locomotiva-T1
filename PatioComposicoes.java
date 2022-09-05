import java.util.ArrayList;

public class PatioComposicoes {
   private ArrayList<Composição> patio;
  
   public PatioComposicoes(){
      this.patio = new ArrayList<Composição>(0);
   }

   public void addTrem(Composição trem){
      patio.add(trem);
   }

   public void listaTrens(){
      for(int i=0;i<=patio.size();i++){
         if(patio.get(i) instanceof Composição){
            System.out.println("Índice: "+i+"; Identificador"+patio.get(i).getIdentificador());
         }
      }
   }
   public ArrayList<Composição> getTrens() {
      return this.patio;

  }

   public void desfazTrem(Composição trem){
      trem.zeraTudo();
      patio.remove(trem);

   }
}
