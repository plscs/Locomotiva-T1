import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class GaragemVagoes {

    private ArrayList<Vagao> inventory;//??
    //private int counter;
    //private Boolean check;

    public GaragemVagoes()throws IOException{
        this.inventory = createInventory();
    }
    
    /*public void createInventory(){
        for( int i = counter; check == false; i++){
            if (check = true){
                lArrayList.add(new Locomotiva(true, 1, 1, 1, 1));
                counter++;
            }
        }
    }*/
    public ArrayList<Vagao> createInventory() throws IOException {
        ArrayList<Vagao> inventory = new ArrayList<>(100) ;
        BufferedReader r = new BufferedReader(new FileReader("VagaData.csv"));
        int i = 0;
        String line = r.readLine();
        while (line != null) {
            inventory.add(i, createVagao(line));
            line = r.readLine();
            i++;
        }
        r.close();
        return inventory;
    }
    public ArrayList<Vagao> getInvetory() {
        return this.inventory;

    }
    private Vagao createVagao(String line) {
        String[] attributes = line.split(",");
        boolean type = Boolean.parseBoolean(attributes[0]);
        int id = Integer.parseInt(attributes[1]);
        double carga = Double.parseDouble(attributes[2]);
        //int composição = Integer.parseInt(attributes[3]);
        //int qtdMaxVagões = Integer.parseInt(attributes[4]);
        //boolean[] habitats = new boolean[6];
        /*for(int i = 0; i < 6; i++)
            habitats[i] = attributes[i+6].equals( "1" )?  true : false;*/
        return new Vagao(type, id, carga, 0);
    }
    
    public String toString(){
        ArrayList<Vagao> r = getInvetory();

        return (r.iterator().toString());
    }
    public String toString(int op){
        ArrayList<Vagao> r = getInvetory();
        
        return (r.get(op).toString());
    }

    public boolean achaVagao(int ID){
        for(Vagao x : inventory)
            if(x.getIdentificador()==ID)
                if(x.getComposição()!=0)
                    return false;
                else
                    return true;
        return false;
    }


    
}