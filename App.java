import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        //Locomotiva l1 = new Locomotiva;
       // System.out.println(l1.getCapCarga());
       GaragemLocomotiva gLocomotiva = new GaragemLocomotiva();
       GaragemVagoes gVagoes = new GaragemVagoes();
       
       
       System.out.println(gVagoes);
       //String test = g1.toString(g1.getInvetory().get(1));
       System.out.println(gLocomotiva.toString());
       System.out.println(gLocomotiva.toString(1));
       Composição Assembly = new Composição();
       Assembly.engataLocomotiva(gLocomotiva.getInvetory().get(2));
    
    }

}
