import java.nio.file.Files;

public class LeitorArquivos {
    public static void main(String[] args) {
        try {
            if(args.length > 0) {
                String nomeAquivo = args[0];
                Path caminhoArquivo = Paths.get(nomeArquivo);
                List<String> linhas = Files.readAllLines(caminhoArquivo);
                for (String linha : linhas) {
                    String[] dados = linha.split(";");
                    int id = Integer.parseInt(dados[0]);
                    double cargaMaxima = Double.parseDouble(dados[1]);
                    int vagoesMaximo = Integer.parseInt(dados[2]);
                    int idComposicao = Integer.parseInt(dados[3]);
                    System.out.println(id);
                    System.out.println(cargaMaxima);
                    System.out.println(vagoesMaximo);
                    System.out.println(idComposicao);
                }

            } else {
                System.out.println("Favor informar nome do aruivo!");
            }
        } catch (Exception e) {
            System.out.println("Falha de leitura do arquivo");
            System.out.println("Tente novamente");
        }
    }
}
