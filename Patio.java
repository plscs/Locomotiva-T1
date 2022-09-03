import java.io.IOException;
//import java.util.ArrayList;
//import java.lang.reflect.Array;

public class Patio {
    public static void main(String[] args) throws IOException {

        GaragemLocomotiva gLocomotiva = new GaragemLocomotiva();
        GaragemVagoes gVagoes = new GaragemVagoes();
        gLocomotiva.createInventory();
        gVagoes.createInventory();
        System.out.println(gLocomotiva);
        //String test = g1.toString(g1.getInvetory().get(1));
        System.out.println(gLocomotiva);
        System.out.println(gLocomotiva.toString()); 
    }
}
