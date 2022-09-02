import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class GaragemLocomotiva {

    private ArrayList<Locomotiva> inventory;//??
    private int counter;
    private Boolean check;

    public GaragemLocomotiva(){
        lArrayList = new ArrayList<>();
        this.inventory = new ArrayList<>;
        Locomotiva l1 = new Locomotiva(Locomotiva.getLocomotiva(), 1, 100.0, 2, 3);
        Locomotiva l2 = new Locomotiva(true, 1, 1.0, 1, 1);
        counter = 1;
    }
    
    public void createInventory(){
        for( int i = counter; check == false; i++){
            if (check = true){
                lArrayList.add(new Locomotiva(true, 1, 1, 1, 1));
                counter++;
            }
        }
    }
    public ArrayList<Locomotiva> createCatalog() throws IOException {
        ArrayList<Locomotiva> inventory = new ArrayList<>(100) ;
        BufferedReader r = new BufferedReader(new FileReader("catalog.txt"));
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

    private Locomotiva createLocomotiva(String line) {
        String[] attributes = line.split(",");
        boolean type = Boolean.parseBoolean(attributes[0]);
        int id = Integer.parseInt(attributes[1]);
        double carga = Double.parseDouble(attributes[2]);
        int size = Integer.parseInt(attributes[5]);
        //boolean[] habitats = new boolean[6];
        /*for(int i = 0; i < 6; i++)
            habitats[i] = attributes[i+6].equals( "1" )?  true : false;*/
        return new Locomotiva(type, size, carga, size, size);
    }
        
    
}
