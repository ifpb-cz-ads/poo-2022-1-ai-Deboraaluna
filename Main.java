import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner menu = new Scanner (System.in);

            while (true) {            

            System.out.print("##--BEM VINDO!--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - INTERIORES E EXTERIOR     |\n");
            System.out.print("| Opção 2 - PALETAS          |\n");
            System.out.print("| Opção 3 - DECORAÇÃO         |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 4) {
                System.out.print("\nAté logo!");
                menu.close(); 
            }

            switch (opcao) {
            case 1:
                System.out.print("\nOpção Interiores e Exterior selecionado");
                break;

            case 2:
                System.out.print("\nOpção Paletas Selecionado\n");
                break;

            case 3:
                System.out.print("\nOpção Decoração Selecionado\n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;
        }
    }
 }

}
