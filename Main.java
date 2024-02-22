import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Restaurante> restaurantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Digite o nome do restaurante: ");
                String nomeRestaurante = scanner.nextLine();
                System.out.print("Digite a avaliação do restaurante: ");
                String avaliacao = scanner.nextLine();
                Restaurante restaurante = new Restaurante(nomeRestaurante, avaliacao);
                restaurantes.add(restaurante);
                System.out.println("Restaurante " + nomeRestaurante + " cadastrado com sucesso!");
            } else if (opcao.equals("2")) {
                System.out.println("Restaurantes cadastrados:");
                for (int i = 0; i < restaurantes.size(); i++) {
                    System.out.println(i + ": " + restaurantes.get(i).getNome());
                    restaurantes.get(i).imprimirMenu();
                }
            } else if (opcao.equals("3")) {
                System.out.print("Escolha o número do restaurante para adicionar um item ao menu: ");
                int escolha = Integer.parseInt(scanner.nextLine());
                Restaurante restauranteEscolhido = restaurantes.get(escolha);
                System.out.print("Digite o nome do item: ");
                String nomeItem = scanner.nextLine();
                System.out.print("Digite o preço do item: ");
                String precoItem = scanner.nextLine();
                Item item = new Item(nomeItem, precoItem);
                restauranteEscolhido.adicionarItem(item);
                System.out.println("Item " + nomeItem + " adicionado ao menu do restaurante " + restauranteEscolhido.getNome() + "!");
            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}
