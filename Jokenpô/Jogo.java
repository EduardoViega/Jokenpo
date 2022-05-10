import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //  1: Pedra  -  2: Papel  -  3: Tesoura  \\
        
        int escolhaUsuario, escolhaComputador;
        int vitoriasUsuario = 0, vitoriasComputador = 0, empates = 0;
        
        System.out.printf("%n----> JOKENPÔ <----%n");
        
        for(int i=0; i<5; i++){
            // Opções:
            System.out.printf("%nOpções:%n 1- Pedra%n 2- Papel%n 3- Tesoura%nDigite a opção escolhida: ");
            
            escolhaUsuario = entrada.nextInt();
            escolhaComputador = (int) (Math.random() * (3) + 1);

            System.out.printf("\n\n\n\n\nOpção do Usuário: %d\n", escolhaUsuario);
            System.out.printf("Opção do Computador: %d\n\n", escolhaComputador);
            
            // Verifica ganhador da partida:
            if((escolhaUsuario == 1 && escolhaComputador == 3) || (escolhaUsuario == 2 && escolhaComputador == 1) || (escolhaUsuario == 3 && escolhaComputador == 2)){
                System.out.println("--> Usuário ganhou a partida! <--\n\n");
                vitoriasUsuario++;
            }
            else if((escolhaComputador == 1 && escolhaUsuario == 3) || (escolhaComputador == 2 && escolhaUsuario == 1) || (escolhaComputador == 3 && escolhaUsuario == 2)){
                System.out.println("--> Computador ganhou a partida! <--\n\n");
                vitoriasComputador++;
            }
            else if(escolhaUsuario == escolhaComputador){
                System.out.println("--> Empate! <--\n\n");
                empates++;
            }
            else{
                System.out.println("Escolha inválida, jogue novamente!");
                i--;
            }

            // Mostra o número de vitórias e empates:
            System.out.println("Vitórias do Usuário: " + vitoriasUsuario);
            System.out.println("Vitórias do Computador: " + vitoriasComputador);
            System.out.println("Número de empates: " + empates);
        }
        
        // Resultado do jogo:
        if(vitoriasUsuario > vitoriasComputador){
            System.out.println(" ");
            System.out.println("|--------------------------------|");
            System.out.println("|---> USUÁRIO VENCEU O JOGO! <---|");
            System.out.println("|--------------------------------|");
            System.out.println(" ");
        }
        else if (vitoriasUsuario < vitoriasComputador) {
            System.out.println(" ");
            System.out.println("|-----------------------------------|");
            System.out.println("|---> COMPUTADOR VENCEU O JOGO! <---|");
            System.out.println("|-----------------------------------|");
            System.out.println(" ");
        }
        else {
            System.out.println(" ");
            System.out.println("|--------------------------------|");
            System.out.println("|---> JOGO ACABOU EM EMPATE! <---|");
            System.out.println("|--------------------------------|");
            System.out.println(" ");
        }
    }

}