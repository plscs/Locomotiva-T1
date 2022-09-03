import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class GaragemLocomotiva {

    private ArrayList<Locomotiva> inventory;//??
    //private int counter;
    //private Boolean check;

    public GaragemLocomotiva()throws IOException{
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
    public ArrayList<Locomotiva> createInventory() throws IOException {
        ArrayList<Locomotiva> inventory = new ArrayList<>(100) ;
        BufferedReader r = new BufferedReader(new FileReader("LocoData.csv"));
        int i = 0;
        String line = r.readLine();
        while (line != null) {
            inventory.add(i, createLocomotiva(line));
            line = r.readLine();
            i++;
        }
        r.close();
        return inventory;
    }
    public ArrayList<Locomotiva> getInvetory() {
        return this.inventory;

    }
    private Locomotiva createLocomotiva(String line) {
        String[] attributes = line.split(",");
        boolean type = Boolean.parseBoolean(attributes[0]);
        int id = Integer.parseInt(attributes[1]);
        double carga = Double.parseDouble(attributes[2]);
        //int composição = Integer.parseInt(attributes[3]);
        int qtdMaxVagões = Integer.parseInt(attributes[4]);
        //boolean[] habitats = new boolean[6];
        /*for(int i = 0; i < 6; i++)
            habitats[i] = attributes[i+6].equals( "1" )?  true : false;*/
        return new Locomotiva(type, id, carga, 0, qtdMaxVagões);
    }
    
    public String toString(){
        ArrayList<Locomotiva> r = getInvetory();
        return (r.get(1).toString());
    }
    
}
