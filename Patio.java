import java.io.IOException;
//import java.util.ArrayList;
//import java.lang.reflect.Array;

public class Patio {
    public static void main(String[] args) throws IOException {

        GaragemLocomotiva g1 = new GaragemLocomotiva();
        g1.createInventory();
        //String test = g1.toString(g1.getInvetory().get(1));
        System.out.println(g1);
        System.out.println(g1.toString()); 
    }
}
