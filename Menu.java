

/*
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
*/
import java.util.Scanner;

public class Menu {

    public Menu(GaragemLocomotiva garagemLocomotiva, GaragemVagoes garagemVagoes, Composição composição){

    }

    private static Scanner sc = new Scanner(System.in);

    public static void mainMenu(GaragemLocomotiva garagemLocomotiva, GaragemVagoes garagemVagoes, Composição composição){
        System.out.println("Bem-vindo");
        System.out.println("Digite o Número correspondente à opção desejada:");
        System.out.println("\n1 Gerar nova composição (trem); \n2 Editar um trem; \n3 Listar todas os trens já criados (todos os trens que estão no pátio); \n4 Desfazer um trem; \n0 Sair e fechar o programa.");

        int op = sc.nextInt();
        switch(op) {
            case 1:
                //gLocomotiva.getInvetory().get(2);
                //Colocar variavel correspondente ao ID do trem gerado depois do "+"
                System.out.println("Novo trem gerado. ID: " + );
                break;
            case 2:
                compositionMenu(garagemLocomotiva, garagemVagoes, composição);
                break;
            case 3:
                //listar trens
                break;
            case 4:
                //desfazer trem
                //inserir metodo com o ID entre os "+"
                System.out.println("Trem de ID " +  + " desmontado.");
                break;
            case 0:
                closeAndExit();
                break;
            default:
                System.out.println("Por favor, digite uma opção válida.");
                mainMenu(garagemLocomotiva, garagemVagoes, composição);
        }
    }

    public static void closeAndExit() {
        sc.close();
        System.exit(0);
    }

    public static void compositionMenu (GaragemLocomotiva garagemLocomotiva, GaragemVagoes garagemVagoes, Composição composição) {
        System.out.println("Gerador de composição:");
        
        System.out.println("Digite o ID do trem a ser editado");
        int trainID = sc.nextInt();

        System.out.println("Digite a opção desejada:"); 
        System.out.println(" 1: Inserir uma locomotiva (informar identificador) respeitando as restrições;");
        System.out.println(" 2: Inserir um vagão (informar identificador) respeitando as restrições;");
        System.out.println(" 3: Remover o último elemento do trem;");
        System.out.println(" 4: Listar locomotivas livres;");
        System.out.println(" 5: Listar vagões livres;");
        System.out.println(" 6: Encerrar a edição do trem.");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                //inserir mensagem:
                System.out.println("Digite o identificador da locomotiva a engatar:");
                //"locoID" é provisório
                int locoID = sc.nextInt();
                System.out.println("Locomotiva " + locoID + " engatada ao trem de ID " + trainID);
                break;
            case 2:
                System.out.println("Digite o ID do vagão a ser engatado");
                // "carID" é provisório
                int carID = sc.nextInt();

                System.out.println("Vagão " + carID + " engatado ao trem de ID " + trainID);
                break;
            case 3:
                //remover ultimo elemento do trem
                System.out.println("Elemento removido.");
                System.out.println("");
                break;
            case 4:
                System.out.println("Lista de locomotivas livres:");
                System.out.println("");
                break;
            case 5:
                System.out.println("Lista de vagões livres:");
                break;
            case 6:
                mainMenu(garagemLocomotiva, garagemVagoes, composição);
                break;
            default:
            System.out.println("Por favor, digite uma opção válida.");
            compositionMenu(garagemLocomotiva, garagemVagoes, composição);
        }
    }
}

