package app;

import java.util.Scanner;
import bicho.Bicho;

public class Main {
    public static void main(String[] args) {

        int option = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do seu bichinho: ");
        String nome = scanner.nextLine();

        System.out.println("Insira a classe do seu bichinho: ");
        String classe = scanner.nextLine();

        System.out.println("Insira a família do seu bichinho: ");
        String familia = scanner.nextLine();

        Bicho bichinho1 = new Bicho(nome, classe, familia);

        while (option != 6 && bichinho1.isVivo()) {
            System.out.println("\nO que o seu pet fará agora?");
            System.out.println("1. Comer");
            System.out.println("2. Dormir");
            System.out.println("3. Correr");
            System.out.println("4. Morrer");
            System.out.println("5. Status");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    bichinho1.comer();
                    break;
                case 2:
                    bichinho1.dormir();
                    break;
                case 3:
                    bichinho1.correr();
                    if (!bichinho1.isVivo()) {
                        bichinho1.morrer();
                    }
                    break;
                case 4:
                	bichinho1.morrer();
                	System.out.println(nome+" morreu!");
                case 5:
                    System.out.println("Status do pet:");
                    System.out.println("Nome: " + nome);
                    System.out.println("Classe: " + classe);
                    System.out.println("Família: " + familia);
                    System.out.println("Calorias: " + bichinho1.getCaloria());
                    System.out.println("Força: " + bichinho1.getForca());
                    System.out.println("Idade: " + bichinho1.getIdade());
                    System.out.println("Status: " + (bichinho1.isVivo() ? "Vivo" : "Morto"));
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
            
            if (!bichinho1.isVivo()) {
                System.out.println("O programa foi encerrado porque seu bichinho morreu.");
                break;
            }
        }
        
        scanner.close();
    }
}
