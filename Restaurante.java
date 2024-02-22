import java.util.ArrayList;
import java.util.List;

class Restaurante {
    private String nome;
    private String avaliacao;
    private List<Item> cardapio;

    public Restaurante(String nome, String avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.cardapio = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarItem(Item item) {
        cardapio.add(item);
    }

    public void imprimirMenu() {
        for (Item item : cardapio) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco());
        }
    }
}

class Item {
    private String nome;
    private String preco;

    public Item(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }
}
