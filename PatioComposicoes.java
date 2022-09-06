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
      System.out.println("O pátio possui os seguintes trens:");
      for(Composição x : patio){
         System.out.println("Trem - ID: "+x.getIdentificador());
      }

   }
   public ArrayList<Composição> getTrens() {
      return this.patio;

  }

   public void desfazTrem(int i){
      for(Composição x : patio)
         if(x.getIdentificador()==i){
            x.zeraTudo();
            patio.remove(x);
            System.out.println("Trem desfeito!");
      }
   }

   public boolean achaTrem(int ID){
      for(Composição x : patio)
         if(x.getIdentificador()==ID)
            return true;
      return false;
   }
}
