

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
import java.util.ArrayList;
import java.util.Scanner;
//import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Menu {
    
    private GaragemLocomotiva garagemLocomotiva;
    private GaragemVagoes garagemVagoes;
    private PatioComposicoes patio;
    public Menu(GaragemLocomotiva garagemLocomotiva, GaragemVagoes garagemVagoes, PatioComposicoes patio){
        this.garagemLocomotiva = garagemLocomotiva;
        this.garagemVagoes = garagemVagoes;
        this.patio = patio;
    }
    private  Scanner sc = new Scanner(System.in);

    public  void mainMenu(){
        System.out.println("Bem-vindo");
        System.out.println("Digite o Numero correspondente a opcao desejada:");
        System.out.println("\n1 Gerar nova composicao (trem); \n2 Editar um trem; \n3 Listar todas os trens ja criados (todos os trens que estao no patio); \n4 Desfazer um trem; \n0 Sair e fechar o programa.");

        int op = sc.nextInt();
        switch(op) {
            case 1:
                //gLocomotiva.getInvetory().get(2);
                //Colocar variavel correspondente ao ID do trem gerado depois do "+"
                listLocomotiva();
                System.out.println("Selecione a Locomotiva que quer adicionar pelo ID" );
                
                int locoID = sc.nextInt();
                patio.addTrem(addLocomotiva(garagemLocomotiva, locoID-1));
                System.out.println("Novo trem gerado. ID: " + patio.getTrens().get(patio.getTrens().size()-1).getIdentificador());
                mainMenu();
                break;
            case 2:
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);
                mainMenu();
                break;
            case 3:
                listLocomotiva();
                //listar trens
                break;
            case 4:
                //desfazer trem
                //inserir metodo com o ID entre os "+"
//                System.out.println("Trem de ID " +  + " desmontado.");
                mainMenu();
                break;
            case 0:
                closeAndExit();
                break;
            default:
                System.out.println("Por favor, digite uma opção válida.");
                mainMenu();
        }
    }

    

    

    public  void closeAndExit() {
        sc.close();
        System.exit(0);
    }

    public  void compositionMenu (GaragemLocomotiva garagemLocomotiva, GaragemVagoes garagemVagoes, PatioComposicoes patio) {
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
                Composição pegaTrem = patio.getTrens().get(trainID-1);
                pegaTrem.engataLocomotiva(garagemLocomotiva.getInvetory().get(locoID-1));
                listLocomotiva(true);

                System.out.println("Locomotiva " + locoID + " engatada ao trem de ID " + trainID);
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);;
                break;
            case 2:
                System.out.println("Digite o ID do vagão a ser engatado");
                // "carID" é provisório
                int carID = sc.nextInt();
                pegaTrem = patio.getTrens().get(trainID-1);
                pegaTrem.EngataVagoes(garagemVagoes.getInvetory().get(carID-1));
                listVagao(carID);
                
                System.out.println("Vagão " + carID + " engatado ao trem de ID " + trainID);
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);;
                break;
            case 3:
                //remover ultimo elemento do trem
                System.out.println("Elemento removido.");
                System.out.println("");
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);
                break;
            case 4:
                listLocomotiva();
                //System.out.println("");
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);
                break;
            case 5:
                listVagao();
                
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);
                break;
            default:
                System.out.println("Por favor, digite uma opção válida.");
                compositionMenu(garagemLocomotiva, garagemVagoes, patio);
                break;
            case 6:
                mainMenu();
                
            
        }
    }
// Aqui começa os métodos
    public Composição addLocomotiva(GaragemLocomotiva garagemLocomotiva, int locoID ){
        Composição novoTrem = new Composição();
        novoTrem.engataLocomotiva(garagemLocomotiva.getInvetory().get(locoID));
        return novoTrem;
    }
    // lista de locomotivas livres
    private void listLocomotiva() {
        ArrayList<Locomotiva> l = garagemLocomotiva.getInvetory();
                
        System.out.println("Lista de locomotivas livres:");
        for(int i = 0; i < l.size(); i++){
            if (l.get(i).getComposição()== 0){
                    System.out.println(garagemLocomotiva.toString(i));
                }
    }
}
// lista de locomotivas entadadas em um trem qualquer
    private void listLocomotiva(boolean bool) {
        ArrayList<Locomotiva> l = garagemLocomotiva.getInvetory();
                
        System.out.println("Lista de locomotivas livres:");
        for(int i = 0; i < l.size(); i++){
            if (l.get(i).getComposição()!= 0){
                    System.out.println(garagemLocomotiva.toString(i));
            }
        }
    } 
    private void listLocomotiva(int tremID) {
        ArrayList<Locomotiva> l = garagemLocomotiva.getInvetory();
                
        System.out.println("Lista de locomotivas no trem:");
        for(int i = 0; i < l.size(); i++){
            if (l.get(i).getComposição()== tremID){
                    System.out.println(garagemLocomotiva.toString(i));
            }
        }
    }
    // lista de vagões livres
    private void listVagao() {
        ArrayList<Vagao> g = garagemVagoes.getInvetory();
       
            System.out.println("Lista de vagões livres:");
            for(int i = 0; i < g.size(); i++){
                if (g.get(i).getComposição() == 0){
                    garagemVagoes.toString(i);
                }    
            }
    }
    // lista de vagões entadados em um trem qualquer
    private void listVagao(boolean bool) {
        ArrayList<Vagao> g = garagemVagoes.getInvetory();
       
                System.out.println("Lista de vagões engatados:");
                for(int i = 0; i < g.size(); i++){
                    if (g.get(i).getComposição() == 0){
                        garagemVagoes.toString(i);
                    }    
            }
    }
    private void listVagao(int tremID) {
        ArrayList<Vagao> g = garagemVagoes.getInvetory();
       
                System.out.println("Lista de vagões no trem:");
                for(int i = 0; i < g.size(); i++){
                    if (g.get(i).getComposição() == tremID){
                        garagemVagoes.toString(i);
                    }    
            }
    }
}

