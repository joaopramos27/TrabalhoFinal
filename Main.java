import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao = 0;//Var. 1 switch
        int opcaoCase2 = 0;//Var. 2 switch


        Jogador jogador1 = new Jogador("Thiikkj", "Naruto", 4, 3, 9, 4.3333333);
        

        
        do{
        System.out.println("Gerenciamento de campeonato de Valorant");
        System.out.println("1. cadasrar equipe");
        System.out.println("2. ver estatisticas de jogador");
        System.out.println("3. ver próxima partida");
        System.out.println("4. sair");
         opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o nome e a tag da equipe: ");
                Equipe equipe = new Equipe(scanner.next(), scanner.next(), null);

                System.out.println("Equipe " + equipe.getNome() + " cadastrada com sucesso!");

                System.out.println("Cadastro de jogadores para a equipe " + equipe.getNome());

                System.out.print("Digite o nome e o agente do jogador: ");
                
                
                System.out.println("Jogador " + jogador1.getNickname() + " cadastrado com sucesso na equipe " + equipe.getNome());

                break;
            case 2:
                
                switch (opcaoCase2){
                System.out.println("Ver estatísticas de qual jogador?");
                System.out.println("1. " + jogador1.t);
               




                }
                break;
            case 3:
                System.out.println("Ver próxima partida");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
        }
        }while(opcao!= 4);
        scanner.close();
        random.doubles();
        
    }
}
