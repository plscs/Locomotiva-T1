import java.util.Scanner;

public class Menu {
    /*
    •Inserir uma locomotiva (informar identificador) respeitando restrições;
    •Inserir um vagão (informar identificador) respeitandorestrições;
    •Remover o último elemento do trem;
    •Listar locomotivas livres;
    •Listar vagões livres
    •Encerrar a edição do trem.
    */

    public Menu(GaragemLocomotiva garagemLocomotiva, GaragemVagoes garagemVagoes){

    }

    public Object criarUmTrem(GaragemLocomotiva garagemLocomotiva){
        Scanner sc = new Scanner(System.in);
        garagemLocomotiva.getInvetory().iterator().toString();
        
        int op = sc.nextInt();
        //Escolha uma locomotiva.
        
        garagemLocomotiva.getInvetory().get(op);
        sc.close();
        return new Composição();
    }

    public void Init() {
        System.out.println("Bem vindo! ");

    }
}
